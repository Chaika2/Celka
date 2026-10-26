package celestial;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;

public class rUI extends rUO<rUf_1> {
   public rUI(Codec<rUf_1> var1) {
      super(var1);
   }

   protected boolean id_class(
      rRg_1 var1,
      Random var2,
      rUf_1 var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      int var21 = 0;
      BitSet var22 = new BitSet(var19 * var20 * var19);
      rfw_3 var23 = new rfw_3();
      int var24 = var3.id_byte;
      double[] var25 = new double[var24 * 4];

      for (int var26 = 0; var26 < var24; var26++) {
         float var27 = (float)var26 / (float)var24;
         double var28 = rfU_2.id_protected((double)var27, var4, var6);
         double var30 = rfU_2.id_protected((double)var27, var12, var14);
         double var32 = rfU_2.id_protected((double)var27, var8, var10);
         double var34 = var2.nextDouble() * (double)var24 / 16.0;
         double var36 = ((double)(rfU_2.id_class((float) Math.PI * var27) + 1.0F) * var34 + 1.0) / 2.0;
         var25[var26 * 4 + 0] = var28;
         var25[var26 * 4 + 1] = var30;
         var25[var26 * 4 + 2] = var32;
         var25[var26 * 4 + 3] = var36;
      }

      for (int var51 = 0; var51 < var24 - 1; var51++) {
         if (!(var25[var51 * 4 + 3] <= 0.0)) {
            for (int var53 = var51 + 1; var53 < var24; var53++) {
               if (!(var25[var53 * 4 + 3] <= 0.0)) {
                  double var55 = var25[var51 * 4 + 0] - var25[var53 * 4 + 0];
                  double var56 = var25[var51 * 4 + 1] - var25[var53 * 4 + 1];
                  double var57 = var25[var51 * 4 + 2] - var25[var53 * 4 + 2];
                  double var58 = var25[var51 * 4 + 3] - var25[var53 * 4 + 3];
                  if (var58 * var58 > var55 * var55 + var56 * var56 + var57 * var57) {
                     if (var58 > 0.0) {
                        var25[var53 * 4 + 3] = -1.0;
                     } else {
                        var25[var51 * 4 + 3] = -1.0;
                     }
                  }
               }
            }
         }
      }

      for (int var52 = 0; var52 < var24; var52++) {
         double var54 = var25[var52 * 4 + 3];
         if (!(var54 < 0.0)) {
            double var29 = var25[var52 * 4 + 0];
            double var31 = var25[var52 * 4 + 1];
            double var33 = var25[var52 * 4 + 2];
            int var35 = Math.max(rfU_2.id_byte(var29 - var54), var16);
            int var59 = Math.max(rfU_2.id_byte(var31 - var54), var17);
            int var37 = Math.max(rfU_2.id_byte(var33 - var54), var18);
            int var38 = Math.max(rfU_2.id_byte(var29 + var54), var35);
            int var39 = Math.max(rfU_2.id_byte(var31 + var54), var59);
            int var40 = Math.max(rfU_2.id_byte(var33 + var54), var37);

            for (int var41 = var35; var41 <= var38; var41++) {
               double var42 = ((double)var41 + 0.5 - var29) / var54;
               if (var42 * var42 < 1.0) {
                  for (int var44 = var59; var44 <= var39; var44++) {
                     double var45 = ((double)var44 + 0.5 - var31) / var54;
                     if (var42 * var42 + var45 * var45 < 1.0) {
                        for (int var47 = var37; var47 <= var40; var47++) {
                           double var48 = ((double)var47 + 0.5 - var33) / var54;
                           if (var42 * var42 + var45 * var45 + var48 * var48 < 1.0) {
                              int var50 = var41 - var16 + (var44 - var17) * var19 + (var47 - var18) * var19 * var20;
                              if (!var22.get(var50)) {
                                 var22.set(var50);
                                 var23.id_class(var41, var44, var47);
                                 if (var3.id_break.id_class(var1.id_byte(var23), var2)) {
                                    var1.id_class(var23, var3.id_protected, 2);
                                    var21++;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var21 > 0;
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUf_1 var5) {
      float var6 = var3.nextFloat() * (float) Math.PI;
      float var7 = (float)var5.id_byte / 8.0F;
      int var8 = rfU_2.id_case(((float)var5.id_byte / 16.0F * 2.0F + 1.0F) / 2.0F);
      double var9 = (double)var4.b_() + Math.sin((double)var6) * (double)var7;
      double var11 = (double)var4.b_() - Math.sin((double)var6) * (double)var7;
      double var13 = (double)var4.d_() + Math.cos((double)var6) * (double)var7;
      double var15 = (double)var4.d_() - Math.cos((double)var6) * (double)var7;
      byte var17 = 2;
      double var18 = (double)(var4.c_() + var3.nextInt(3) - 2);
      double var20 = (double)(var4.c_() + var3.nextInt(3) - 2);
      int var22 = var4.b_() - rfU_2.id_case(var7) - var8;
      int var23 = var4.c_() - 2 - var8;
      int var24 = var4.d_() - rfU_2.id_case(var7) - var8;
      int var25 = 2 * (rfU_2.id_case(var7) + var8);
      int var26 = 2 * (2 + var8);

      for (int var27 = var22; var27 <= var22 + var25; var27++) {
         for (int var28 = var24; var28 <= var24 + var25; var28++) {
            if (var23 <= var1.id_class(rKv_1.OCEAN_FLOOR_WG, var27, var28)) {
               return this.id_class(var1, var3, var5, var9, var11, var13, var15, var18, var20, var22, var23, var24, var25, var26);
            }
         }
      }

      return false;
   }
}
