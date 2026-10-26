package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class rrbw_3 {
   private static rrbI_2 class_ = null;
   private static final Random break_ = new Random();

   private static String[] byte_() {
      ArrayList var0 = new ArrayList();
      var0.add("textures/gui/title/background");

      for (int var1 = 0; var1 < 100; var1++) {
         String var2 = "optifine/gui/background" + var1;
         String var3 = var2 + "/panorama_0.png";
         rqO_2 var4 = new rqO_2(var3);
         if (rrbb_3.byte_(var4)) {
            var0.add(var2);
         }
      }

      return var0.toArray(new String[var0.size()]);
   }

   private static int class_(int[] var0) {
      int var1 = rrWD.break_(var0);
      int var2 = break_.nextInt(var1);
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length; var4++) {
         var3 += var0[var4];
         if (var3 > var2) {
            return var4;
         }
      }

      return var0.length - 1;
   }

   private static Properties[] class_(String[] var0) {
      Properties[] var1 = new Properties[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         String var3 = var0[var2];
         if (var2 == 0) {
            var3 = "optifine/gui";
         } else {
            rrbb_3.byte_("CustomPanorama: " + var3);
         }

         rqO_2 var4 = new rqO_2(var3 + "/background.properties");

         try {
            InputStream var5 = rrbb_3.class_(var4);
            if (var5 != null) {
               rrzE_2 var6 = new rrzE_2();
               var6.load(var5);
               rrbb_3.byte_("CustomPanorama: " + var4.break_());
               var1[var2] = var6;
               var5.close();
            }
         } catch (IOException var7) {
         }
      }

      return var1;
   }

   public static rrbI_2 class_() {
      return class_;
   }

   private static int[] class_(Properties[] var0) {
      int[] var1 = new int[var0.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         Properties var3 = var0[var2];
         if (var3 == null) {
            var3 = var0[0];
         }

         if (var3 == null) {
            var1[var2] = 1;
         } else {
            String var4 = var3.getProperty("weight", (String)null);
            var1[var2] = rrbb_3.class_(var4, 1);
         }
      }

      return var1;
   }

   public static void break_() {
      class_ = null;
      String[] var0 = byte_();
      if (var0.length > 1) {
         Properties[] var1 = class_(var0);
         int[] var2 = class_(var1);
         int var3 = class_(var2);
         String var4 = var0[var3];
         Object var5 = var1[var3];
         if (var5 == null) {
            var5 = var1[0];
         }

         if (var5 == null) {
            var5 = new rrzE_2();
         }

         rrbI_2 var6 = new rrbI_2(var4, (Properties)var5);
         class_ = var6;
      }
   }
}
