package celestial;

import java.util.Random;

public class qx_3 extends pV_2<rSg_1> {
   public qx_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 class_(rSg_1 var1) {
      return fJ_2.class_;
   }

   private static void class_(
      rjV_2 var0,
      Ok_1 var1,
      float var2,
      float var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      var1.class_(var0, var2 + (var12 ? var11 : -var11), (float)(var4 * 16), var3 + (var13 ? var11 : -var11)).class_(var7, var8, var9, 0.3F).class_();
      var1.class_(var0, var5 + (var12 ? var10 : -var10), (float)((var4 + 1) * 16), var6 + (var13 ? var10 : -var10)).class_(var7, var8, var9, 0.3F).class_();
      var1.class_(var0, var5 + (var14 ? var10 : -var10), (float)((var4 + 1) * 16), var6 + (var15 ? var10 : -var10)).class_(var7, var8, var9, 0.3F).class_();
      var1.class_(var0, var2 + (var14 ? var11 : -var11), (float)(var4 * 16), var3 + (var15 ? var11 : -var11)).class_(var7, var8, var9, 0.3F).class_();
   }

   public void class_(rSg_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      float[] var7 = new float[8];
      float[] var8 = new float[8];
      float var9 = 0.0F;
      float var10 = 0.0F;
      Random var11 = new Random(var1.class_);

      for (int var12 = 7; var12 >= 0; var12--) {
         var7[var12] = var9;
         var8[var12] = var10;
         var9 += (float)(var11.nextInt(11) - 5);
         var10 += (float)(var11.nextInt(11) - 5);
      }

      Ok_1 var34 = var5.getBuffer(HU.else_());
      rjV_2 var13 = var4.byte_().class_();

      for (int var14 = 0; var14 < 4; var14++) {
         Random var15 = new Random(var1.class_);

         for (int var16 = 0; var16 < 3; var16++) {
            int var17 = 7;
            int var18 = 0;
            if (var16 > 0) {
               var17 = 7 - var16;
            }

            if (var16 > 0) {
               var18 = var17 - 2;
            }

            float var19 = var7[var17] - var9;
            float var20 = var8[var17] - var10;

            for (int var21 = var17; var21 >= var18; var21--) {
               float var22 = var19;
               float var23 = var20;
               if (var16 == 0) {
                  var19 += (float)(var15.nextInt(11) - 5);
                  var20 += (float)(var15.nextInt(11) - 5);
               } else {
                  var19 += (float)(var15.nextInt(31) - 15);
                  var20 += (float)(var15.nextInt(31) - 15);
               }

               float var24 = 0.5F;
               float var25 = 0.45F;
               float var26 = 0.45F;
               float var27 = 0.5F;
               float var28 = 0.1F + (float)var14 * 0.2F;
               if (var16 == 0) {
                  var28 = (float)((double)var28 * ((double)var21 * 0.1 + 1.0));
               }

               float var29 = 0.1F + (float)var14 * 0.2F;
               if (var16 == 0) {
                  var29 *= (float)(var21 - 1) * 0.1F + 1.0F;
               }

               int var30 = ColorHelper.class_(0.0F, 255);
               float var31 = (float)ColorHelper.byte_(var30) / 255.0F;
               float var32 = (float)ColorHelper.protected_(var30) / 255.0F;
               float var33 = (float)ColorHelper.break_(var30) / 255.0F;
               class_(var13, var34, var19, var20, var21, var22, var23, var31, var32, var33, var28, var29, false, false, true, false);
               class_(var13, var34, var19, var20, var21, var22, var23, var31, var32, var33, var28, var29, true, false, true, true);
               class_(var13, var34, var19, var20, var21, var22, var23, var31, var32, var33, var28, var29, true, true, false, true);
               class_(var13, var34, var19, var20, var21, var22, var23, var31, var32, var33, var28, var29, false, true, false, false);
            }
         }
      }
   }
}
