package celestial;

public class rrbi_3 {
   private rrbQ_2 id_class = null;
   private float[][] id_break = new float[16][3];
   private float[][] id_byte = new float[16][3];

   public rrbi_3(rrbQ_2 var1) {
      this.id_class = var1;
   }

   private static void id_class(String var0) {
      rrbb_3.id_byte("CustomColors: " + var0);
   }

   private void id_class(float[][] var1, float var2, int var3, int var4, float[][] var5) {
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

   public boolean id_class(gm_3 var1, float var2, int[] var3, boolean var4) {
      if (this.id_class == null) {
         return false;
      } else {
         int var5 = this.id_class.id_case();
         if (var4 && var5 < 64) {
            return false;
         } else {
            int var6 = this.id_class.id_throws();
            if (var6 < 16) {
               id_break("Invalid lightmap width: " + var6);
               this.id_class = null;
               return false;
            } else {
               int var7 = 0;
               if (var4) {
                  var7 = var6 * 16 * 2;
               }

               float var8 = 1.1666666F * (var1.id_class(1.0F) - 0.2F);
               if (var1.id_super() > 0) {
                  var8 = 1.0F;
               }

               var8 = rrbb_3.id_class(var8);
               float var9 = var8 * (float)(var6 - 1);
               float var10 = rrbb_3.id_class(var2 + 0.5F) * (float)(var6 - 1);
               float var11 = rrbb_3.id_class((float)rrbb_3.rE().a);
               boolean var12 = var11 > 1.0E-4F;
               float[][] var13 = this.id_class.id_break();
               this.id_class(var13, var9, var7, var6, this.id_break);
               this.id_class(var13, var10, var7 + 16 * var6, var6, this.id_byte);
               float[] var14 = new float[3];

               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     for (int var17 = 0; var17 < 3; var17++) {
                        float var18 = rrbb_3.id_class(this.id_break[var15][var17] + this.id_byte[var16][var17]);
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

   public rrbQ_2 id_class() {
      return this.id_class;
   }

   private static void id_break(String var0) {
      rrbb_3.id_protected("CustomColors: " + var0);
   }
}
