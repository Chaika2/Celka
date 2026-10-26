package celestial;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Debug-only netty handler, loaded inside the game's nested classloader.
 *
 * Logs every decoded inbound packet (server -> client) and every outbound packet
 * (client -> server) to packetdebug.log (working dir = run) with a reflective
 * field dump, so we can watch teleport / respawn / confirm packets around a
 * cross-world kick.
 *
 * Enabled only when the file "packetdebug.on" exists in the working directory
 * (run/packetdebug.on), so normal runs are unaffected. Toggle without a rebuild
 * by creating or deleting that file.
 */
public final class PacketTap extends ChannelDuplexHandler {
    private static final AtomicLong SEQ = new AtomicLong();
    private static final boolean ENABLED = resolveToggle();
    private static volatile java.io.Writer WRITER;
    private static volatile java.io.Writer FOCUS_WRITER;
    private static final Object FILE_LOCK = new Object();
    private static volatile long LAST_FLUSH = 0L;

    static {
        if (ENABLED) {
            try {
                synchronized (FILE_LOCK) {
                    java.io.Writer out = writer();
                    out.write("[tap] packet tap ENABLED at " + System.currentTimeMillis()
                        + " cwd=" + new File(".").getAbsolutePath() + System.lineSeparator());
                    out.flush();
                }
            } catch (Throwable ignored) {
                // never break startup
            }
        }
    }

    public PacketTap() {
    }

    private static boolean resolveToggle() {
        if (new File("packetdebug.on").exists()) {
            return true;
        }
        // working dir may differ; try a couple of nearby locations
        File parent = new File(".").getAbsoluteFile().getParentFile();
        if (parent != null) {
            if (new File(parent, "packetdebug.on").exists()) {
                return true;
            }
            File grand = parent.getParentFile();
            if (grand != null && new File(grand, "run/packetdebug.on").exists()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (ENABLED) {
            log("IN ", ctx, msg);
        }
        super.channelRead(ctx, msg);
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        if (ENABLED) {
            log("OUT", ctx, msg);
        }
        super.write(ctx, msg, promise);
    }

    private static java.io.Writer writer() throws java.io.IOException {
        java.io.Writer local = WRITER;
        if (local == null) {
            synchronized (FILE_LOCK) {
                if (WRITER == null) {
                    WRITER = new java.io.BufferedWriter(
                        new java.io.FileWriter("packetdebug.log", StandardCharsets.UTF_8, true));
                }
                local = WRITER;
            }
        }
        return local;
    }

    private static void log(String dir, ChannelHandlerContext ctx, Object msg) {
        try {
            long t = System.currentTimeMillis();
            String summary = summarize(msg);
            String line = String.format("[%d] #%d %s %s %s",
                t, SEQ.incrementAndGet(), dir, ctx.channel().remoteAddress(), summary);
            synchronized (FILE_LOCK) {
                java.io.Writer out = writer();
                out.write(line);
                out.write(System.lineSeparator());
                // time-based flush: keeps the trail on disk without stalling on a packet flood
                long now = System.currentTimeMillis();
                if (now - LAST_FLUSH >= 200L) {
                    out.flush();
                    LAST_FLUSH = now;
                }
            }
            // Focused teleport trace: respawn / teleport / confirm / movement packets only,
            // so the cross-world kick is readable without the entity-metadata flood.
            if (msg != null) {
                String simple = msg.getClass().getSimpleName();
                if (isMovementSimpleName(simple)) {
                    String focused = String.format("[%d] %s %s %s", t, dir, simple, summary);
                    synchronized (FILE_LOCK) {
                        java.io.Writer ft = focusWriter();
                        ft.write(focused);
                        ft.write(System.lineSeparator());
                        ft.flush();
                    }
                }
            }
        } catch (Throwable error) {
            // never let debug logging break the connection
        }
    }

    /**
     * The client keeps movement packets (rZX = position+rotation, rZh_1 = position)
     * and the teleport plumbing in a small set of obfuscated classes; these are the
     * only ones that matter for the "client did not confirm the mandatory teleport" kick.
     */
    private static boolean isMovementSimpleName(String simple) {
        switch (simple) {
            case "rZX":      // CPlayerPositionAndRotation
            case "rZh_1":    // CPlayerPosition
            case "rZO":      // CPlayer (status only base)
            case "rvD_2":    // SPlayerPositionLook  (server -> client teleport with teleportId)
            case "rmV_2":    // CConfirmTeleport     (client -> server confirm, carries teleportId)
            case "rmI_2":    // CPerformRespawn
            case "rvZ_2":    // SJoinGame          (world switch / lobby move)
            case "rmw_3":    // CClientSettings
            case "rZJ":      // CPlayerAbilities
            case "rvm_3":    // SCloseWindow / respawn-adjacent
                return true;
            default:
                return false;
        }
    }

    private static java.io.Writer focusWriter() throws java.io.IOException {
        java.io.Writer local = FOCUS_WRITER;
        if (local == null) {
            synchronized (FILE_LOCK) {
                if (FOCUS_WRITER == null) {
                    FOCUS_WRITER = new java.io.BufferedWriter(
                        new java.io.FileWriter("teleport_trace.log", StandardCharsets.UTF_8, true));
                }
                local = FOCUS_WRITER;
            }
        }
        return local;
    }

    private static String summarize(Object msg) {
        if (msg == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(msg.getClass().getSimpleName());
        sb.append('{');
        boolean first = true;
        // Walk the whole hierarchy: movement packets (rZX / rZh_1) keep their
        // position/rotation fields in the parent class, so declared-only dumps
        // print a useless "{}".
        java.util.List<Class<?>> chain = new java.util.ArrayList<>();
        for (Class<?> c = msg.getClass(); c != null && c != Object.class; c = c.getSuperclass()) {
            chain.add(c);
        }
        java.util.Set<String> seen = new java.util.HashSet<>();
        for (int ci = chain.size() - 1; ci >= 0; ci--) {
            Field[] declared;
            try {
                declared = chain.get(ci).getDeclaredFields();
            } catch (Throwable ignored) {
                continue;
            }
            for (Field field : declared) {
                int mods = field.getModifiers();
                if (Modifier.isStatic(mods) || field.isSynthetic()) {
                    continue;
                }
                if (!seen.add(field.getName())) {
                    continue;
                }
                try {
                    field.setAccessible(true);
                } catch (Throwable ignored) {
                    continue;
                }
                Object value;
                try {
                    value = field.get(msg);
                } catch (Throwable ignored) {
                    continue;
                }
                if (!first) {
                    sb.append(", ");
                }
                first = false;
                sb.append(field.getName()).append('=').append(format(value));
            }
        }
        sb.append('}');
        try {
            String s = msg.toString();
            if (s != null && !s.startsWith(msg.getClass().getName() + "@")) {
                sb.append(" :: ").append(oneLine(s, 200));
            }
        } catch (Throwable ignored) {
            // ignore broken toString
        }
        return sb.toString();
    }

    private static String format(Object value) {
        if (value == null) {
            return "null";
        }
        if (value.getClass().isArray()) {
            return arrayString(value);
        }
        return oneLine(String.valueOf(value), 120);
    }

    private static String oneLine(String s, int max) {
        String r = s.replace('\n', ' ').replace('\r', ' ');
        if (r.length() > max) {
            r = r.substring(0, max) + "...";
        }
        return r;
    }

    private static String arrayString(Object value) {
        int len = java.lang.reflect.Array.getLength(value);
        StringBuilder sb = new StringBuilder("[");
        int show = Math.min(len, 12);
        for (int i = 0; i < show; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(java.lang.reflect.Array.get(value, i));
        }
        if (len > show) {
            sb.append(",...(").append(len).append(')');
        }
        return sb.append(']').toString();
    }
}
