package celestial;

public class rrMr_1 {
   private rrbi_3 id_class;
   private rrbi_3 id_break;
   private rrbi_3 id_byte;
   private int[] id_protected = new int[0];
   private int[] id_throws = new int[0];
   private int[] id_case = new int[0];

   public rrMr_1(rrbi_3 var1, rrbi_3 var2, rrbi_3 var3) {
      if (var2 != null || var3 != null) {
         if (var2 == null) {
            var2 = var1;
         }

         if (var3 == null) {
            var3 = var2;
         }
      }

      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   private boolean id_class(int[] var1, float var2, int[] var3, float var4, int[] var5, float var6) {
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

   private boolean id_class(int[] var1, float var2, int[] var3, float var4) {
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

   public boolean id_class(gm_3 var1, float var2, int[] var3, boolean var4, float var5) {
      if (this.id_break == null && this.id_byte == null) {
         return this.id_class.id_class(var1, var2, var3, var4);
      } else if (!rrzc_3.id_protected(var1) && !rrzc_3.id_break(var1)) {
         float var6 = var1.id_private(var5);
         float var7 = var1.id_case(var5);
         float var8 = 1.0E-4F;
         boolean var9 = var6 > var8;
         boolean var10 = var7 > var8;
         if (!var9 && !var10) {
            return this.id_class.id_class(var1, var2, var3, var4);
         } else {
            if (var6 > 0.0F) {
               var7 /= var6;
            }

            float var11 = 1.0F - var6;
            float var12 = var6 - var7;
            if (this.id_protected.length != var3.length) {
               this.id_protected = new int[var3.length];
               this.id_throws = new int[var3.length];
            }

            int var13 = 0;
            int[][] var14 = new int[][]{var3, this.id_protected, this.id_throws};
            float[] var15 = new float[3];
            if (var11 > var8 && this.id_class.id_class(var1, var2, var14[var13], var4)) {
               var15[var13] = var11;
               var13++;
            }

            if (var12 > var8 && this.id_break != null && this.id_break.id_class(var1, var2, var14[var13], var4)) {
               var15[var13] = var12;
               var13++;
            }

            if (var7 > var8 && this.id_byte != null && this.id_byte.id_class(var1, var2, var14[var13], var4)) {
               var15[var13] = var7;
               var13++;
            }

            if (var13 == 2) {
               return this.id_class(var14[0], var15[0], var14[1], var15[1]);
            } else {
               return var13 == 3 ? this.id_class(var14[0], var15[0], var14[1], var15[1], var14[2], var15[2]) : true;
            }
         }
      } else {
         return this.id_class.id_class(var1, var2, var3, var4);
      }
   }

   public boolean id_class(gm_3 var1, float var2, fN_2 var3, boolean var4, float var5) {
      int var6 = var3.id_class() * var3.id_break();
      if (this.id_case.length != var6) {
         this.id_case = new int[var6];
      }

      var3.id_private().get(this.id_case);
      boolean var7 = this.id_class(var1, var2, this.id_case, var4, var5);
      if (var7) {
         var3.id_private().put(this.id_case);
      }

      return var7;
   }
}
