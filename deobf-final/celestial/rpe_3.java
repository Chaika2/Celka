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
   private static final Logger break_ = LogManager.getLogger();
   public static final GameVersion class_ = new rpe_3();
   private final String byte_;
   private final String protected_;
   private final boolean throws_;
   private final int case_;
   private final int catch_;
   private final int private_;
   private final Date implements_;
   private final String finally_;

   private rpe_3() {
      this.byte_ = UUID.randomUUID().toString().replaceAll("-", "");
      this.protected_ = "1.16.5";
      this.throws_ = true;
      this.case_ = 2586;
      this.catch_ = rqu_3.break_();
      this.private_ = 6;
      this.implements_ = new Date();
      this.finally_ = "1.16.5";
   }

   private rpe_3(JsonObject var1) {
      this.byte_ = rpY_2.case_(var1, "id");
      this.protected_ = rpY_2.case_(var1, "name");
      this.finally_ = rpY_2.case_(var1, "release_target");
      this.throws_ = rpY_2.private_(var1, "stable");
      this.case_ = rpY_2.extends_(var1, "world_version");
      this.catch_ = rpY_2.extends_(var1, "protocol_version");
      this.private_ = rpY_2.extends_(var1, "pack_version");
      this.implements_ = Date.from(ZonedDateTime.parse(rpY_2.case_(var1, "build_time")).toInstant());
   }

   public String getName() {
      return this.protected_;
   }

   public static GameVersion class_() {
      try {
         rpe_3 var11;
         try (InputStream var0 = rpe_3.class.getResourceAsStream("/version.json")) {
            if (var0 == null) {
               break_.warn("Missing version information!");
               return class_;
            }

            rpe_3 var1;
            try (InputStreamReader var2 = new InputStreamReader(var0)) {
               var1 = new rpe_3(rpY_2.class_(var2));
            }

            var11 = var1;
         }

         return var11;
      } catch (IOException | JsonParseException var9) {
         throw new IllegalStateException("Game version information is corrupt", var9);
      }
   }

   public String getId() {
      return this.byte_;
   }

   public boolean isStable() {
      return this.throws_;
   }

   public String getReleaseTarget() {
      return this.finally_;
   }

   public int getPackVersion() {
      return this.private_;
   }

   public int getWorldVersion() {
      return this.case_;
   }

   public Date getBuildTime() {
      return this.implements_;
   }

   public int getProtocolVersion() {
      return this.catch_;
   }
}
