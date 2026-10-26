/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.bridge.game.GameVersion
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  io.netty.util.ResourceLeakDetector
 *  io.netty.util.ResourceLeakDetector$Level
 */
package celestial;

import celestial.RB;
import celestial.rpe_3;
import com.mojang.bridge.game.GameVersion;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;

public class rqu_3 {
    public static final ResourceLeakDetector.Level id_class = ResourceLeakDetector.Level.DISABLED;
    public static boolean id_break = true;
    public static boolean id_byte;
    public static final char[] id_protected;
    private static GameVersion id_throws;

    static {
        id_protected = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
        ResourceLeakDetector.setLevel((ResourceLeakDetector.Level)id_class);
        CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
        CommandSyntaxException.BUILT_IN_EXCEPTIONS = new RB();
    }

    public static GameVersion id_class() {
        if (id_throws == null) {
            id_throws = rpe_3.id_class();
        }
        return id_throws;
    }

    public static boolean id_class(char c) {
        return c != '\u00a7' && c >= ' ' && c != '\u007f';
    }

    public static String id_class(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (!rqu_3.id_class(c)) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static int id_break() {
        return 754;
    }
}

