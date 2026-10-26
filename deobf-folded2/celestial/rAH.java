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
   private static final Logger id_class = LogManager.getLogger();
   public final File id_break;

   protected abstract boolean id_byte(String var1);

   private static String id_byte(rAI var0, rqO_2 var1) {
      return String.format("%s/%s/%s", var0.id_class(), var1.id_byte(), var1.id_break());
   }

   public rAH(File var1) {
      this.id_break = var1;
   }

   @Override
   public <T> T id_class(rAo_1<T> var1) throws IOException {
      Object var2;
      try (InputStream var3 = this.id_break("pack.mcmeta")) {
         var2 = id_class(var1, var3);
      }

      return (T)var2;
   }

   public static <T> T id_class(rAo_1<T> var0, InputStream var1) {
      JsonObject var2;
      try (BufferedReader var3 = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8))) {
         var2 = rpY_2.id_class(var3);
      } catch (JsonParseException | IOException var9) {
         id_class.error("Couldn't load {} metadata", var0.id_class(), var9);
         return null;
      }

      if (!var2.has(var0.id_class())) {
         return null;
      } else {
         try {
            return (T)var0.id_break(rpY_2.id_native(var2, var0.id_class()));
         } catch (JsonParseException var7) {
            id_class.error("Couldn't load {} metadata", var0.id_class(), var7);
            return null;
         }
      }
   }

   protected static String id_class(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   @Override
   public InputStream id_class(rAI var1, rqO_2 var2) throws IOException {
      return this.id_break(id_byte(var1, var2));
   }

   @Override
   public String id_class() {
      return this.id_break.getName();
   }

   @Override
   public InputStream id_class(String var1) throws IOException {
      if (!var1.contains("/") && !var1.contains("\\")) {
         return this.id_break(var1);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   @Override
   public boolean id_break(rAI var1, rqO_2 var2) {
      return this.id_byte(id_byte(var1, var2));
   }

   protected abstract InputStream id_break(String var1) throws IOException;

   protected void id_protected(String var1) {
      id_class.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", var1, this.id_break);
   }
}
