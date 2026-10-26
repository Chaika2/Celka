/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  celestial.rnA_2$celestial.rnn_3
 */
package celestial;

import celestial.rRO;
import celestial.rRl_1;
import celestial.rVm_1;
import celestial.rfU_2;
import celestial.rnA_2;
import celestial.rrSp_1;
import java.nio.file.Path;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class rnp_3
extends rnA_2<rnp_3> {
    public final boolean id_class = this.id_class("online-mode", true);
    public final boolean id_break = this.id_class("prevent-proxy-connections", false);
    public final String id_byte = this.id_class("server-ip", "");
    public final boolean id_protected = this.id_class("spawn-animals", true);
    public final boolean id_throws = this.id_class("spawn-npcs", true);
    public final boolean id_case = this.id_class("pvp", true);
    public final boolean id_catch = this.id_class("allow-flight", false);
    public final String id_private = this.id_class("resource-pack", "");
    public final String id_implements = this.id_class("motd", "A Minecraft Server");
    public final boolean id_finally = this.id_class("force-gamemode", false);
    public final boolean id_extends = this.id_class("enforce-whitelist", false);
    public final rRO id_native = this.id_class("difficulty", rnp_3.id_class(rRO::id_class, rRO::id_class), rRO::id_byte, rRO.EASY);
    public final rRl_1 id_volatile = this.id_class("gamemode", rnp_3.id_class(rRl_1::id_class, rRl_1::id_class), rRl_1::id_break, rRl_1.SURVIVAL);
    public final String id_final = this.id_class("level-name", "world");
    public final int id_package = this.id_class("server-port", 25565);
    public final int id_int = this.id_class("max-build-height", n -> rfU_2.id_class((n + 8) / 16 * 16, 64, 256), 256);
    public final Boolean id_new = this.id_break("announce-player-achievements");
    public final boolean id_continue = this.id_class("enable-query", false);
    public final int id_super = this.id_class("query.port", 25565);
    public final boolean id_this = this.id_class("enable-rcon", false);
    public final int id_else = this.id_class("rcon.port", 25575);
    public final String id_synchronized = this.id_class("rcon.password", "");
    public final String id_return = this.id_class("resource-pack-hash");
    public final String id_public = this.id_class("resource-pack-sha1", "");
    public final boolean id_goto = this.id_class("hardcore", false);
    public final boolean id_while = this.id_class("allow-nether", true);
    public final boolean id_try = this.id_class("spawn-monsters", true);
    public final boolean id_instanceof;
    public final boolean id_throw;
    public final boolean id_interface;
    public final int id_char;
    public final int id_abstract;
    public final int id_long;
    public final long id_float;
    public final int id_void;
    public final int id_static;
    public final int id_import;
    public final int id_short;
    public final boolean id_default;
    public final boolean id_const;
    public final int id_strictfp;
    public final boolean id_boolean;
    public final boolean id_transient;
    public final boolean id_for;
    public final int id_double;
    public final String id_switch;
    public final rnA_2.rnn_3<Integer> r;
    public final rnA_2.rnn_3<Boolean> P;
    public final rrSp_1 B;

    public rnp_3(Properties properties, rVm_1 rVm_12) {
        super(properties);
        if (this.id_class("snooper-enabled", true)) {
            // empty if block
        }
        this.id_instanceof = false;
        this.id_throw = this.id_class("use-native-transport", true);
        this.id_interface = this.id_class("enable-command-block", false);
        this.id_char = this.id_class("spawn-protection", 16);
        this.id_abstract = this.id_class("op-permission-level", 4);
        this.id_long = this.id_class("function-permission-level", 2);
        this.id_float = this.id_class("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
        this.id_void = this.id_class("rate-limit", 0);
        this.id_static = this.id_class("view-distance", 10);
        this.id_import = this.id_class("max-players", 20);
        this.id_short = this.id_class("network-compression-threshold", 256);
        this.id_default = this.id_class("broadcast-rcon-to-ops", true);
        this.id_const = this.id_class("broadcast-console-to-ops", true);
        this.id_strictfp = this.id_class("max-world-size", n -> rfU_2.id_class((int)n, 1, 29999984), 29999984);
        this.id_boolean = this.id_class("sync-chunk-writes", true);
        this.id_transient = this.id_class("enable-jmx-monitoring", false);
        this.id_for = this.id_class("enable-status", true);
        this.id_double = this.id_class("entity-broadcast-range-percentage", n -> rfU_2.id_class((int)n, 10, 1000), 100);
        this.id_switch = this.id_class("text-filtering-config", "");
        this.r = this.id_break("player-idle-timeout", 0);
        this.P = this.id_break("white-list", false);
        this.B = rrSp_1.id_class(rVm_12, properties);
    }

    @Override
    protected /* synthetic */ rnA_2 id_class(rVm_1 rVm_12, Properties properties) {
        return this.id_break(rVm_12, properties);
    }

    public static rnp_3 id_class(rVm_1 rVm_12, Path path) {
        return new rnp_3(rnp_3.id_class(path), rVm_12);
    }

    protected rnp_3 id_break(rVm_1 rVm_12, Properties properties) {
        return new rnp_3(properties, rVm_12);
    }
}

