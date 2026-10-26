package celestial;

import java.nio.file.Path;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class rnp_3 extends rnA_2<rnp_3> {
   public final boolean class_ = this.class_("online-mode", true);
   public final boolean break_ = this.class_("prevent-proxy-connections", false);
   public final String byte_ = this.class_("server-ip", "");
   public final boolean protected_ = this.class_("spawn-animals", true);
   public final boolean throws_ = this.class_("spawn-npcs", true);
   public final boolean case_ = this.class_("pvp", true);
   public final boolean catch_ = this.class_("allow-flight", false);
   public final String private_ = this.class_("resource-pack", "");
   public final String implements_ = this.class_("motd", "A Minecraft Server");
   public final boolean finally_ = this.class_("force-gamemode", false);
   public final boolean extends_ = this.class_("enforce-whitelist", false);
   public final rRO native_ = this.class_("difficulty", class_(rRO::class_, rRO::class_), rRO::byte_, rRO.EASY);
   public final rRl_1 volatile_ = this.class_("gamemode", class_(rRl_1::class_, rRl_1::class_), rRl_1::break_, rRl_1.SURVIVAL);
   public final String final_ = this.class_("level-name", "world");
   public final int package_ = this.class_("server-port", 25565);
   public final int int_ = this.class_("max-build-height", var0 -> rfU_2.class_((var0 + 8) / 16 * 16, 64, 256), 256);
   public final Boolean new_ = this.break_("announce-player-achievements");
   public final boolean continue_ = this.class_("enable-query", false);
   public final int super_ = this.class_("query.port", 25565);
   public final boolean this_ = this.class_("enable-rcon", false);
   public final int else_ = this.class_("rcon.port", 25575);
   public final String synchronized_ = this.class_("rcon.password", "");
   public final String return_ = this.class_("resource-pack-hash");
   public final String public_ = this.class_("resource-pack-sha1", "");
   public final boolean goto_ = this.class_("hardcore", false);
   public final boolean while_ = this.class_("allow-nether", true);
   public final boolean try_ = this.class_("spawn-monsters", true);
   public final boolean instanceof_;
   public final boolean throw_;
   public final boolean interface_;
   public final int char_;
   public final int abstract_;
   public final int long_;
   public final long float_;
   public final int void_;
   public final int static_;
   public final int import_;
   public final int short_;
   public final boolean default_;
   public final boolean const_;
   public final int strictfp_;
   public final boolean boolean_;
   public final boolean transient_;
   public final boolean for_;
   public final int double_;
   public final String switch_;
   public final rnA_2<rnp_3>.celestial/rnn_3<Integer> r;
   public final rnA_2<rnp_3>.celestial/rnn_3<Boolean> P;
   public final rrSp_1 B;

   public rnp_3(Properties var1, rVm_1 var2) {
      super(var1);
      if (this.class_("snooper-enabled", true)) {
      }

      this.instanceof_ = false;
      this.throw_ = this.class_("use-native-transport", true);
      this.interface_ = this.class_("enable-command-block", false);
      this.char_ = this.class_("spawn-protection", 16);
      this.abstract_ = this.class_("op-permission-level", 4);
      this.long_ = this.class_("function-permission-level", 2);
      this.float_ = this.class_("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
      this.void_ = this.class_("rate-limit", 0);
      this.static_ = this.class_("view-distance", 10);
      this.import_ = this.class_("max-players", 20);
      this.short_ = this.class_("network-compression-threshold", 256);
      this.default_ = this.class_("broadcast-rcon-to-ops", true);
      this.const_ = this.class_("broadcast-console-to-ops", true);
      this.strictfp_ = this.class_("max-world-size", var0 -> rfU_2.class_(var0, 1, 29999984), 29999984);
      this.boolean_ = this.class_("sync-chunk-writes", true);
      this.transient_ = this.class_("enable-jmx-monitoring", false);
      this.for_ = this.class_("enable-status", true);
      this.double_ = this.class_("entity-broadcast-range-percentage", var0 -> rfU_2.class_(var0, 10, 1000), 100);
      this.switch_ = this.class_("text-filtering-config", "");
      this.r = this.break_("player-idle-timeout", 0);
      this.P = this.break_("white-list", false);
      this.B = rrSp_1.class_(var2, var1);
   }

   public static rnp_3 class_(rVm_1 var0, Path var1) {
      return new rnp_3(class_(var1), var0);
   }

   protected rnp_3 break_(rVm_1 var1, Properties var2) {
      return new rnp_3(var2, var1);
   }
}
