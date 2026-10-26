package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class rrbf_3 {
   private static rrbj_3[][] id_class = (rrbj_3[][])null;

   private static rrbj_3[][] id_byte() {
      rrbj_3[][] var0 = new rrbj_3[10][0];
      String var1 = "optifine/sky/world";
      int var2 = -1;

      for (int var3 = 0; var3 < var0.length; var3++) {
         String var4 = var1 + var3;
         ArrayList var5 = new ArrayList();

         for (int var6 = 0; var6 < 1000; var6++) {
            String var7 = var4 + "/sky" + var6 + ".properties";
            int var8 = 0;

            try {
               rqO_2 var9 = new rqO_2(var7);
               InputStream var10 = rrbb_3.id_class(var9);
               if (var10 == null) {
                  if (++var8 > 10) {
                     break;
                  }
               }

               rrzE_2 var11 = new rrzE_2();
               var11.load(var10);
               var10.close();
               rrbb_3.id_byte("CustomSky properties: " + var7);
               String var12 = var6 + ".png";
               rrbj_3 var13 = new rrbj_3(var11, var12);
               if (var13.id_class(var7)) {
                  String var14 = rrzX_2.id_case(var13.id_class, ".png");
                  rqO_2 var15 = new rqO_2(var14);
                  ff_3 var16 = rrzJ_2.id_class(var15);
                  if (var16 == null) {
                     rrbb_3.id_case("CustomSky: Texture not found: " + var15);
                  } else {
                     var13.id_protected = var16.id_new();
                     var5.add(var13);
                     var10.close();
                  }
               }
            } catch (FileNotFoundException var17) {
               if (++var8 > 10) {
                  break;
               }
            } catch (IOException var18) {
               var18.printStackTrace();
            }
         }

         if (var5.size() > 0) {
            rrbj_3[] var22 = var5.toArray(new rrbj_3[var5.size()]);
            var0[var3] = var22;
            var2 = var3;
         }
      }

      if (var2 < 0) {
         return (rrbj_3[][])null;
      } else {
         int var19 = var2 + 1;
         rrbj_3[][] var20 = new rrbj_3[var19][0];

         for (int var21 = 0; var21 < var20.length; var21++) {
            var20[var21] = var0[var21];
         }

         return var20;
      }
   }

   public static boolean id_class(rYB var0) {
      if (id_class == null) {
         return false;
      } else {
         int var1 = rrzc_3.id_class(var0);
         if (var1 >= 0 && var1 < id_class.length) {
            rrbj_3[] var2 = id_class[var1];
            return var2 == null ? false : var2.length > 0;
         } else {
            return false;
         }
      }
   }

   public static void id_class(rYB var0, fY_2 var1, Ml_1 var2, float var3) {
      if (id_class != null) {
         if (rrbb_3.rs()) {
            rrdZ.id_class(rrdX.CUSTOM_SKY);
         }

         int var4 = rrzc_3.id_class(var0);
         if (var4 >= 0 && var4 < id_class.length) {
            rrbj_3[] var5 = id_class[var4];
            if (var5 != null) {
               long var6 = var0.P();
               int var8 = (int)(var6 % 24000L);
               float var9 = var0.id_protected(var3);
               float var10 = var0.id_private(var3);
               float var11 = var0.id_case(var3);
               if (var10 > 0.0F) {
                  var11 /= var10;
               }

               for (int var12 = 0; var12 < var5.length; var12++) {
                  rrbj_3 var13 = var5[var12];
                  if (var13.id_class(var0, var8)) {
                     var13.id_class(var0, var2, var8, var9, var10, var11);
                  }
               }

               float var14 = 1.0F - var10;
               rrxh_3.id_class(var14);
            }
         }
      }
   }

   public static void id_class() {
      id_class = (rrbj_3[][])null;
   }

   public static void id_break() {
      id_class();
      if (rrbb_3.D()) {
         id_class = id_byte();
      }
   }
}
