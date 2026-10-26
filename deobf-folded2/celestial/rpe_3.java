package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.bridge.game.GameVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rpe_3 implements GameVersion {
   private static final Logger id_break = LogManager.getLogger();
   public static final GameVersion id_class = new rpe_3();
   private final String id_byte;
   private final String id_protected;
   private final boolean id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_private;
   private final Date id_implements;
   private final String id_finally;

   private rpe_3() {
      this.id_byte = UUID.randomUUID().toString().replaceAll("-", "");
      this.id_protected = "1.16.5";
      this.id_throws = true;
      this.id_case = 2586;
      this.id_catch = rqu_3.id_break();
      this.id_private = 6;
      this.id_implements = new Date();
      this.id_finally = "1.16.5";
   }

   private rpe_3(JsonObject var1) {
      this.id_byte = rpY_2.id_case(var1, "id");
      this.id_protected = rpY_2.id_case(var1, "name");
      this.id_finally = rpY_2.id_case(var1, "release_target");
      this.id_throws = rpY_2.id_private(var1, "stable");
      this.id_case = rpY_2.id_extends(var1, "world_version");
      this.id_catch = rpY_2.id_extends(var1, "protocol_version");
      this.id_private = rpY_2.id_extends(var1, "pack_version");
      this.id_implements = Date.from(ZonedDateTime.parse(rpY_2.id_case(var1, "build_time")).toInstant());
   }

   public String getName() {
      return this.id_protected;
   }

   public static GameVersion id_class() {
      try {
         rpe_3 var11;
         try (InputStream var0 = rpe_3.class.getResourceAsStream("/version.json")) {
            if (var0 == null) {
               id_break.warn("Missing version information!");
               return id_class;
            }

            rpe_3 var1;
            try (InputStreamReader var2 = new InputStreamReader(var0)) {
               var1 = new rpe_3(rpY_2.id_class(var2));
            }

            var11 = var1;
         }

         return var11;
      } catch (IOException | JsonParseException var9) {
         throw new IllegalStateException("Game version information is corrupt", var9);
      }
   }

   public String getId() {
      return this.id_byte;
   }

   public boolean isStable() {
      return this.id_throws;
   }

   public String getReleaseTarget() {
      return this.id_finally;
   }

   public int getPackVersion() {
      return this.id_private;
   }

   public int getWorldVersion() {
      return this.id_case;
   }

   public Date getBuildTime() {
      return this.id_implements;
   }

   public int getProtocolVersion() {
      return this.id_catch;
   }
}
