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
   private String class_;

   public rrdl_1(String var1) {
      this.class_ = var1;
   }

   public static Vs_1 class_(String var0, Vs_1 var1) {
      String var2 = var0 + ".mcmeta";
      String var3 = "texture";
      InputStream var4 = rrdZ.finally_(var2);
      if (var4 != null) {
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var4));

         Vs_1 var10;
         try {
            JsonObject var7 = new JsonParser().parse(var5).getAsJsonObject();
            JsonObject var16 = var7.getAsJsonObject(var3);
            if (var16 == null) {
               return var1;
            }

            Vs_1 var9 = Vs_1.class_.class_(var16);
            if (var9 != null) {
               return var9;
            }

            var10 = var1;
         } catch (RuntimeException var14) {
            rrdJ.break_("Error reading metadata: " + var2);
            rrdJ.break_(var14.getClass().getName() + ": " + var14.getMessage());
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
      this.continue_();
      InputStream var2 = rrdZ.finally_(this.class_);
      if (var2 == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.class_);
      } else {
         try {
            fN_2 var3 = fN_2.class_(var2);
            Vs_1 var4 = class_(this.class_, new Vs_1(false, false));
            fo_3.class_(this.new_(), var3.class_(), var3.break_());
            var3.class_(0, 0, 0, 0, 0, var3.class_(), var3.break_(), var4.class_(), var4.break_(), false, true);
         } finally {
            IOUtils.closeQuietly(var2);
         }
      }
   }
}
