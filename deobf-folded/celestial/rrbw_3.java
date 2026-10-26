package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class rrbw_3 {
   private static rrbI_2 id_class = null;
   private static final Random id_break = new Random();

   private static String[] id_byte() {
      ArrayList var0 = new ArrayList();
      var0.add("textures/gui/title/background");

      for (int var1 = 0; var1 < 100; var1++) {
         String var2 = "optifine/gui/background" + var1;
         String var3 = var2 + "/panorama_0.png";
         rqO_2 var4 = new rqO_2(var3);
         if (rrbb_3.id_byte(var4)) {
            var0.add(var2);
         }
      }

      return var0.toArray(new String[var0.size()]);
   }

   private static int id_class(int[] var0) {
      int var1 = rrWD.id_break(var0);
      int var2 = id_break.nextInt(var1);
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length; var4++) {
         var3 += var0[var4];
         if (var3 > var2) {
            return var4;
         }
      }

      return var0.length - 1;
   }

   private static Properties[] id_class(String[] var0) {
      Properties[] var1 = new Properties[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         String var3 = var0[var2];
         if (var2 == 0) {
            var3 = "optifine/gui";
         } else {
            rrbb_3.id_byte("CustomPanorama: " + var3);
         }

         rqO_2 var4 = new rqO_2(var3 + "/background.properties");

         try {
            InputStream var5 = rrbb_3.id_class(var4);
            if (var5 != null) {
               rrzE_2 var6 = new rrzE_2();
               var6.load(var5);
               rrbb_3.id_byte("CustomPanorama: " + var4.id_break());
               var1[var2] = var6;
               var5.close();
            }
         } catch (IOException var7) {
         }
      }

      return var1;
   }

   public static rrbI_2 id_class() {
      return id_class;
   }

   private static int[] id_class(Properties[] var0) {
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
            var1[var2] = rrbb_3.id_class(var4, 1);
         }
      }

      return var1;
   }

   public static void id_break() {
      id_class = null;
      String[] var0 = id_byte();
      if (var0.length > 1) {
         Properties[] var1 = id_class(var0);
         int[] var2 = id_class(var1);
         int var3 = id_class(var2);
         String var4 = var0[var3];
         Object var5 = var1[var3];
         if (var5 == null) {
            var5 = var1[0];
         }

         if (var5 == null) {
            var5 = new rrzE_2();
         }

         rrbI_2 var6 = new rrbI_2(var4, (Properties)var5);
         id_class = var6;
      }
   }
}
