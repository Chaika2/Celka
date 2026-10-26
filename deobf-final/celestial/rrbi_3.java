package celestial;

public class rrbi_3 {
   private rrbQ_2 class_ = null;
   private float[][] break_ = new float[16][3];
   private float[][] byte_ = new float[16][3];

   public rrbi_3(rrbQ_2 var1) {
      this.class_ = var1;
   }

   private static void class_(String var0) {
      rrbb_3.byte_("CustomColors: " + var0);
   }

   private void class_(float[][] var1, float var2, int var3, int var4, float[][] var5) {
      int var6 = (int)Math.floor((double)var2);
      int var7 = (int)Math.ceil((double)var2);
      if (var6 == var7) {
         for (int var8 = 0; var8 < 16; var8++) {
            float[] var9 = var1[var3 + var8 * var4 + var6];
            float[] var10 = var5[var8];

            for (int var11 = 0; var11 < 3; var11++) {
               var10[var11] = var9[var11];
            }
         }
      } else {
         float var15 = 1.0F - (var2 - (float)var6);
         float var16 = 1.0F - ((float)var7 - var2);

         for (int var17 = 0; var17 < 16; var17++) {
            float[] var18 = var1[var3 + var17 * var4 + var6];
            float[] var12 = var1[var3 + var17 * var4 + var7];
            float[] var13 = var5[var17];

            for (int var14 = 0; var14 < 3; var14++) {
               var13[var14] = var18[var14] * var15 + var12[var14] * var16;
            }
         }
      }
   }

   public boolean class_(gm_3 var1, float var2, int[] var3, boolean var4) {
      if (this.class_ == null) {
         return false;
      } else {
         int var5 = this.class_.case_();
         if (var4 && var5 < 64) {
            return false;
         } else {
            int var6 = this.class_.throws_();
            if (var6 < 16) {
               break_("Invalid lightmap width: " + var6);
               this.class_ = null;
               return false;
            } else {
               int var7 = 0;
               if (var4) {
                  var7 = var6 * 16 * 2;
               }

               float var8 = 1.1666666F * (var1.class_(1.0F) - 0.2F);
               if (var1.super_() > 0) {
                  var8 = 1.0F;
               }

               var8 = rrbb_3.class_(var8);
               float var9 = var8 * (float)(var6 - 1);
               float var10 = rrbb_3.class_(var2 + 0.5F) * (float)(var6 - 1);
               float var11 = rrbb_3.class_((float)rrbb_3.rE().a);
               boolean var12 = var11 > 1.0E-4F;
               float[][] var13 = this.class_.break_();
               this.class_(var13, var9, var7, var6, this.break_);
               this.class_(var13, var10, var7 + 16 * var6, var6, this.byte_);
               float[] var14 = new float[3];

               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     for (int var17 = 0; var17 < 3; var17++) {
                        float var18 = rrbb_3.class_(this.break_[var15][var17] + this.byte_[var16][var17]);
                        if (var12) {
                           float var19 = 1.0F - var18;
                           var19 = 1.0F - var19 * var19 * var19 * var19;
                           var18 = var11 * var19 + (1.0F - var11) * var18;
                        }

                        var14[var17] = var18;
                     }

                     int var21 = (int)(var14[0] * 255.0F);
                     int var22 = (int)(var14[1] * 255.0F);
                     int var24 = (int)(var14[2] * 255.0F);
                     var3[var15 * 16 + var16] = 0xFF000000 | var24 << 16 | var22 << 8 | var21;
                  }
               }

               return true;
            }
         }
      }
   }

   public rrbQ_2 class_() {
      return this.class_;
   }

   private static void break_(String var0) {
      rrbb_3.protected_("CustomColors: " + var0);
   }
}
