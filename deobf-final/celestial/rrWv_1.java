package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Executor;

public class rrWv_1 {
   public static float class_(Properties var0, String var1, float var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         float var4 = rrbb_3.class_(var3, Float.MIN_VALUE);
         if (var4 == Float.MIN_VALUE) {
            rrbb_3.protected_("Invalid value for " + var1 + ": " + var3);
            return var2;
         } else {
            return var4;
         }
      }
   }

   public static boolean class_(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         String var4 = var3.toLowerCase().trim();
         if (var4.equals("true") || var4.equals("on")) {
            return true;
         } else if (!var4.equals("false") && !var4.equals("off")) {
            rrbb_3.protected_("Invalid value for " + var1 + ": " + var3);
            return var2;
         } else {
            return false;
         }
      }
   }

   public static void class_() {
      rrWF var0 = new rrWF();
      Executor var1 = rqR_2.case_();
      QY var2 = QY.instanceof_();
      ub_3 var3 = (ub_3)rrxr_3.class_(var2, rrxr_3.Su);
      if (var3 != null) {
         var3.break_().class_(var0, rrbb_3.x(), var1, var2);
      }
   }

   public static Int2ObjectMap<Float> class_(Properties var0) {
      Int2ObjectOpenHashMap var1 = new Int2ObjectOpenHashMap();

      for (String var3 : var0.keySet()) {
         String var4 = "width.";
         if (var3.startsWith(var4)) {
            String var5 = var3.substring(var4.length());
            int var6 = rrbb_3.class_(var5, -1);
            if (var6 >= 0) {
               String var7 = var0.getProperty(var3);
               float var8 = rrbb_3.class_(var7, -1.0F);
               if (var8 >= 0.0F) {
                  char var9 = (char)var6;
                  var1.put(var9, new Float(var8));
               }
            }
         }
      }

      return var1;
   }

   public static Properties class_(rqO_2 var0) {
      String var1 = var0.break_();
      rrzE_2 var2 = new rrzE_2();
      String var3 = ".png";
      if (!var1.endsWith(var3)) {
         return var2;
      } else {
         String var4 = var1.substring(0, var1.length() - var3.length()) + ".properties";

         try {
            rqO_2 var5 = new rqO_2(var0.byte_(), var4);
            InputStream var6 = rrbb_3.class_(rrbb_3.x(), var5);
            if (var6 == null) {
               return var2;
            }

            rrbb_3.case_("Loading " + var4);
            var2.load(var6);
            var6.close();
         } catch (FileNotFoundException var7) {
         } catch (IOException var8) {
            var8.printStackTrace();
         }

         return var2;
      }
   }

   public static rqO_2 break_(rqO_2 var0) {
      if (!rrbb_3.U()) {
         return var0;
      } else if (var0 == null) {
         return var0;
      } else if (!rrbb_3.final_()) {
         return var0;
      } else {
         String var1 = var0.break_();
         String var2 = "textures/";
         String var3 = "optifine/";
         if (!var1.startsWith(var2)) {
            return var0;
         } else {
            var1 = var1.substring(var2.length());
            var1 = var3 + var1;
            rqO_2 var4 = new rqO_2(var0.byte_(), var1);
            return rrbb_3.break_(rrbb_3.x(), var4) ? var4 : var0;
         }
      }
   }
}
