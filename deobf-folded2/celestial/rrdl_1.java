package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.io.IOUtils;

public class rrdl_1 extends ff_3 {
   private String id_class;

   public rrdl_1(String var1) {
      this.id_class = var1;
   }

   public static Vs_1 id_class(String var0, Vs_1 var1) {
      String var2 = var0 + ".mcmeta";
      String var3 = "texture";
      InputStream var4 = rrdZ.id_finally(var2);
      if (var4 != null) {
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var4));

         Vs_1 var10;
         try {
            JsonObject var7 = new JsonParser().parse(var5).getAsJsonObject();
            JsonObject var16 = var7.getAsJsonObject(var3);
            if (var16 == null) {
               return var1;
            }

            Vs_1 var9 = Vs_1.id_class.id_class(var16);
            if (var9 != null) {
               return var9;
            }

            var10 = var1;
         } catch (RuntimeException var14) {
            rrdJ.id_break("Error reading metadata: " + var2);
            rrdJ.id_break(var14.getClass().getName() + ": " + var14.getMessage());
            return var1;
         } finally {
            IOUtils.closeQuietly(var5);
            IOUtils.closeQuietly(var4);
         }

         return var10;
      } else {
         return var1;
      }
   }

   @Override
   public void a_(rAL var1) throws IOException {
      this.id_continue();
      InputStream var2 = rrdZ.id_finally(this.id_class);
      if (var2 == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.id_class);
      } else {
         try {
            fN_2 var3 = fN_2.id_class(var2);
            Vs_1 var4 = id_class(this.id_class, new Vs_1(false, false));
            fo_3.id_class(this.id_new(), var3.id_class(), var3.id_break());
            var3.id_class(0, 0, 0, 0, 0, var3.id_class(), var3.id_break(), var4.id_class(), var4.id_break(), false, true);
         } finally {
            IOUtils.closeQuietly(var2);
         }
      }
   }
}
