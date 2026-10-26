package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rAH implements rAC {
   private static final Logger class_ = LogManager.getLogger();
   public final File break_;

   protected abstract boolean byte_(String var1);

   private static String byte_(rAI var0, rqO_2 var1) {
      return String.format("%s/%s/%s", var0.class_(), var1.byte_(), var1.break_());
   }

   public rAH(File var1) {
      this.break_ = var1;
   }

   @Override
   public <T> T class_(rAo_1<T> var1) throws IOException {
      Object var2;
      try (InputStream var3 = this.break_("pack.mcmeta")) {
         var2 = class_(var1, var3);
      }

      return (T)var2;
   }

   public static <T> T class_(rAo_1<T> var0, InputStream var1) {
      JsonObject var2;
      try (BufferedReader var3 = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8))) {
         var2 = rpY_2.class_(var3);
      } catch (JsonParseException | IOException var9) {
         class_.error("Couldn't load {} metadata", var0.class_(), var9);
         return null;
      }

      if (!var2.has(var0.class_())) {
         return null;
      } else {
         try {
            return (T)var0.break_(rpY_2.native_(var2, var0.class_()));
         } catch (JsonParseException var7) {
            class_.error("Couldn't load {} metadata", var0.class_(), var7);
            return null;
         }
      }
   }

   protected static String class_(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   @Override
   public InputStream class_(rAI var1, rqO_2 var2) throws IOException {
      return this.break_(byte_(var1, var2));
   }

   @Override
   public String class_() {
      return this.break_.getName();
   }

   @Override
   public InputStream class_(String var1) throws IOException {
      if (!var1.contains("/") && !var1.contains("\\")) {
         return this.break_(var1);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   @Override
   public boolean break_(rAI var1, rqO_2 var2) {
      return this.byte_(byte_(var1, var2));
   }

   protected abstract InputStream break_(String var1) throws IOException;

   protected void protected_(String var1) {
      class_.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", var1, this.break_);
   }
}
