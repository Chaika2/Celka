package celestial;

public class rrMr_1 {
   private rrbi_3 class_;
   private rrbi_3 break_;
   private rrbi_3 byte_;
   private int[] protected_ = new int[0];
   private int[] throws_ = new int[0];
   private int[] case_ = new int[0];

   public rrMr_1(rrbi_3 var1, rrbi_3 var2, rrbi_3 var3) {
      if (var2 != null || var3 != null) {
         if (var2 == null) {
            var2 = var1;
         }

         if (var3 == null) {
            var3 = var2;
         }
      }

      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   private boolean class_(int[] var1, float var2, int[] var3, float var4, int[] var5, float var6) {
      if (var3.length == var1.length && var5.length == var1.length) {
         for (int var7 = 0; var7 < var1.length; var7++) {
            int var8 = var1[var7];
            int var9 = var8 >> 16 & 0xFF;
            int var10 = var8 >> 8 & 0xFF;
            int var11 = var8 & 0xFF;
            int var12 = var3[var7];
            int var13 = var12 >> 16 & 0xFF;
            int var14 = var12 >> 8 & 0xFF;
            int var15 = var12 & 0xFF;
            int var16 = var5[var7];
            int var17 = var16 >> 16 & 0xFF;
            int var18 = var16 >> 8 & 0xFF;
            int var19 = var16 & 0xFF;
            int var20 = (int)((float)var9 * var2 + (float)var13 * var4 + (float)var17 * var6);
            int var21 = (int)((float)var10 * var2 + (float)var14 * var4 + (float)var18 * var6);
            int var22 = (int)((float)var11 * var2 + (float)var15 * var4 + (float)var19 * var6);
            var1[var7] = 0xFF000000 | var20 << 16 | var21 << 8 | var22;
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean class_(int[] var1, float var2, int[] var3, float var4) {
      if (var3.length != var1.length) {
         return false;
      } else {
         for (int var5 = 0; var5 < var1.length; var5++) {
            int var6 = var1[var5];
            int var7 = var6 >> 16 & 0xFF;
            int var8 = var6 >> 8 & 0xFF;
            int var9 = var6 & 0xFF;
            int var10 = var3[var5];
            int var11 = var10 >> 16 & 0xFF;
            int var12 = var10 >> 8 & 0xFF;
            int var13 = var10 & 0xFF;
            int var14 = (int)((float)var7 * var2 + (float)var11 * var4);
            int var15 = (int)((float)var8 * var2 + (float)var12 * var4);
            int var16 = (int)((float)var9 * var2 + (float)var13 * var4);
            var1[var5] = 0xFF000000 | var14 << 16 | var15 << 8 | var16;
         }

         return true;
      }
   }

   public boolean class_(gm_3 var1, float var2, int[] var3, boolean var4, float var5) {
      if (this.break_ == null && this.byte_ == null) {
         return this.class_.class_(var1, var2, var3, var4);
      } else if (!rrzc_3.protected_(var1) && !rrzc_3.break_(var1)) {
         float var6 = var1.private_(var5);
         float var7 = var1.case_(var5);
         float var8 = 1.0E-4F;
         boolean var9 = var6 > var8;
         boolean var10 = var7 > var8;
         if (!var9 && !var10) {
            return this.class_.class_(var1, var2, var3, var4);
         } else {
            if (var6 > 0.0F) {
               var7 /= var6;
            }

            float var11 = 1.0F - var6;
            float var12 = var6 - var7;
            if (this.protected_.length != var3.length) {
               this.protected_ = new int[var3.length];
               this.throws_ = new int[var3.length];
            }

            int var13 = 0;
            int[][] var14 = new int[][]{var3, this.protected_, this.throws_};
            float[] var15 = new float[3];
            if (var11 > var8 && this.class_.class_(var1, var2, var14[var13], var4)) {
               var15[var13] = var11;
               var13++;
            }

            if (var12 > var8 && this.break_ != null && this.break_.class_(var1, var2, var14[var13], var4)) {
               var15[var13] = var12;
               var13++;
            }

            if (var7 > var8 && this.byte_ != null && this.byte_.class_(var1, var2, var14[var13], var4)) {
               var15[var13] = var7;
               var13++;
            }

            if (var13 == 2) {
               return this.class_(var14[0], var15[0], var14[1], var15[1]);
            } else {
               return var13 == 3 ? this.class_(var14[0], var15[0], var14[1], var15[1], var14[2], var15[2]) : true;
            }
         }
      } else {
         return this.class_.class_(var1, var2, var3, var4);
      }
   }

   public boolean class_(gm_3 var1, float var2, fN_2 var3, boolean var4, float var5) {
      int var6 = var3.class_() * var3.break_();
      if (this.case_.length != var6) {
         this.case_ = new int[var6];
      }

      var3.private_().get(this.case_);
      boolean var7 = this.class_(var1, var2, this.case_, var4, var5);
      if (var7) {
         var3.private_().put(this.case_);
      }

      return var7;
   }
}
