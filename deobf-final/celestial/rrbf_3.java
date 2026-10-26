package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class rrbf_3 {
   private static rrbj_3[][] class_ = (rrbj_3[][])null;

   private static rrbj_3[][] byte_() {
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
               InputStream var10 = rrbb_3.class_(var9);
               if (var10 == null) {
                  if (++var8 > 10) {
                     break;
                  }
               }

               rrzE_2 var11 = new rrzE_2();
               var11.load(var10);
               var10.close();
               rrbb_3.byte_("CustomSky properties: " + var7);
               String var12 = var6 + ".png";
               rrbj_3 var13 = new rrbj_3(var11, var12);
               if (var13.class_(var7)) {
                  String var14 = rrzX_2.case_(var13.class_, ".png");
                  rqO_2 var15 = new rqO_2(var14);
                  ff_3 var16 = rrzJ_2.class_(var15);
                  if (var16 == null) {
                     rrbb_3.case_("CustomSky: Texture not found: " + var15);
                  } else {
                     var13.protected_ = var16.new_();
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

   public static boolean class_(rYB var0) {
      if (class_ == null) {
         return false;
      } else {
         int var1 = rrzc_3.class_(var0);
         if (var1 >= 0 && var1 < class_.length) {
            rrbj_3[] var2 = class_[var1];
            return var2 == null ? false : var2.length > 0;
         } else {
            return false;
         }
      }
   }

   public static void class_(rYB var0, fY_2 var1, Ml_1 var2, float var3) {
      if (class_ != null) {
         if (rrbb_3.rs()) {
            rrdZ.class_(rrdX.CUSTOM_SKY);
         }

         int var4 = rrzc_3.class_(var0);
         if (var4 >= 0 && var4 < class_.length) {
            rrbj_3[] var5 = class_[var4];
            if (var5 != null) {
               long var6 = var0.P();
               int var8 = (int)(var6 % 24000L);
               float var9 = var0.protected_(var3);
               float var10 = var0.private_(var3);
               float var11 = var0.case_(var3);
               if (var10 > 0.0F) {
                  var11 /= var10;
               }

               for (int var12 = 0; var12 < var5.length; var12++) {
                  rrbj_3 var13 = var5[var12];
                  if (var13.class_(var0, var8)) {
                     var13.class_(var0, var2, var8, var9, var10, var11);
                  }
               }

               float var14 = 1.0F - var10;
               rrxh_3.class_(var14);
            }
         }
      }
   }

   public static void class_() {
      class_ = (rrbj_3[][])null;
   }

   public static void break_() {
      class_();
      if (rrbb_3.D()) {
         class_ = byte_();
      }
   }
}
