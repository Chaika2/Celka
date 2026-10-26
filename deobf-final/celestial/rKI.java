package celestial;

import java.util.Random;

public class rKI {
   protected static final int[][] class_ = new int[][]{
      {1, 1, 0},
      {-1, 1, 0},
      {1, -1, 0},
      {-1, -1, 0},
      {1, 0, 1},
      {-1, 0, 1},
      {1, 0, -1},
      {-1, 0, -1},
      {0, 1, 1},
      {0, -1, 1},
      {0, 1, -1},
      {0, -1, -1},
      {1, 1, 0},
      {0, -1, 1},
      {-1, 1, 0},
      {0, -1, -1}
   };
   private static final double throws_ = Math.sqrt(3.0);
   private static final double case_ = 0.5 * (throws_ - 1.0);
   private static final double catch_ = (3.0 - throws_) / 6.0;
   private final int[] private_ = new int[512];
   public final double break_;
   public final double byte_;
   public final double protected_;

   public rKI(Random var1) {
      this.break_ = var1.nextDouble() * 256.0;
      this.byte_ = var1.nextDouble() * 256.0;
      this.protected_ = var1.nextDouble() * 256.0;
      int var2 = 0;

      while (var2 < 256) {
         this.private_[var2] = var2++;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5);
         int var4 = this.private_[var5];
         this.private_[var5] = this.private_[var3 + var5];
         this.private_[var3 + var5] = var4;
      }
   }

   private double class_(int var1, double var2, double var4, double var6, double var8) {
      double var10 = var8 - var2 * var2 - var4 * var4 - var6 * var6;
      double var12;
      if (var10 < 0.0) {
         var12 = 0.0;
      } else {
         var10 *= var10;
         var12 = var10 * var10 * class_(class_[var1], var2, var4, var6);
      }

      return var12;
   }

   public double class_(double var1, double var3, double var5) {
      double var7 = 0.3333333333333333;
      double var9 = (var1 + var3 + var5) * 0.3333333333333333;
      int var11 = rfU_2.byte_(var1 + var9);
      int var12 = rfU_2.byte_(var3 + var9);
      int var13 = rfU_2.byte_(var5 + var9);
      double var14 = 0.16666666666666666;
      double var16 = (double)(var11 + var12 + var13) * 0.16666666666666666;
      double var18 = (double)var11 - var16;
      double var20 = (double)var12 - var16;
      double var22 = (double)var13 - var16;
      double var24 = var1 - var18;
      double var26 = var3 - var20;
      double var28 = var5 - var22;
      byte var30;
      byte var31;
      byte var32;
      byte var33;
      byte var34;
      byte var35;
      if (var24 >= var26) {
         if (var26 >= var28) {
            var30 = 1;
            var31 = 0;
            var32 = 0;
            var33 = 1;
            var34 = 1;
            var35 = 0;
         } else if (var24 >= var28) {
            var30 = 1;
            var31 = 0;
            var32 = 0;
            var33 = 1;
            var34 = 0;
            var35 = 1;
         } else {
            var30 = 0;
            var31 = 0;
            var32 = 1;
            var33 = 1;
            var34 = 0;
            var35 = 1;
         }
      } else if (var26 < var28) {
         var30 = 0;
         var31 = 0;
         var32 = 1;
         var33 = 0;
         var34 = 1;
         var35 = 1;
      } else if (var24 < var28) {
         var30 = 0;
         var31 = 1;
         var32 = 0;
         var33 = 0;
         var34 = 1;
         var35 = 1;
      } else {
         var30 = 0;
         var31 = 1;
         var32 = 0;
         var33 = 1;
         var34 = 1;
         var35 = 0;
      }

      double var36 = var24 - (double)var30 + 0.16666666666666666;
      double var38 = var26 - (double)var31 + 0.16666666666666666;
      double var40 = var28 - (double)var32 + 0.16666666666666666;
      double var42 = var24 - (double)var33 + 0.3333333333333333;
      double var44 = var26 - (double)var34 + 0.3333333333333333;
      double var46 = var28 - (double)var35 + 0.3333333333333333;
      double var48 = var24 - 1.0 + 0.5;
      double var50 = var26 - 1.0 + 0.5;
      double var52 = var28 - 1.0 + 0.5;
      int var54 = var11 & 0xFF;
      int var55 = var12 & 0xFF;
      int var56 = var13 & 0xFF;
      int var57 = this.class_(var54 + this.class_(var55 + this.class_(var56))) % 12;
      int var58 = this.class_(var54 + var30 + this.class_(var55 + var31 + this.class_(var56 + var32))) % 12;
      int var59 = this.class_(var54 + var33 + this.class_(var55 + var34 + this.class_(var56 + var35))) % 12;
      int var60 = this.class_(var54 + 1 + this.class_(var55 + 1 + this.class_(var56 + 1))) % 12;
      double var61 = this.class_(var57, var24, var26, var28, 0.6);
      double var63 = this.class_(var58, var36, var38, var40, 0.6);
      double var65 = this.class_(var59, var42, var44, var46, 0.6);
      double var67 = this.class_(var60, var48, var50, var52, 0.6);
      return 32.0 * (var61 + var63 + var65 + var67);
   }

   public double class_(double var1, double var3) {
      double var5 = (var1 + var3) * case_;
      int var7 = rfU_2.byte_(var1 + var5);
      int var8 = rfU_2.byte_(var3 + var5);
      double var9 = (double)(var7 + var8) * catch_;
      double var11 = (double)var7 - var9;
      double var13 = (double)var8 - var9;
      double var15 = var1 - var11;
      double var17 = var3 - var13;
      byte var19;
      byte var20;
      if (var15 > var17) {
         var19 = 1;
         var20 = 0;
      } else {
         var19 = 0;
         var20 = 1;
      }

      double var21 = var15 - (double)var19 + catch_;
      double var23 = var17 - (double)var20 + catch_;
      double var25 = var15 - 1.0 + 2.0 * catch_;
      double var27 = var17 - 1.0 + 2.0 * catch_;
      int var29 = var7 & 0xFF;
      int var30 = var8 & 0xFF;
      int var31 = this.class_(var29 + this.class_(var30)) % 12;
      int var32 = this.class_(var29 + var19 + this.class_(var30 + var20)) % 12;
      int var33 = this.class_(var29 + 1 + this.class_(var30 + 1)) % 12;
      double var34 = this.class_(var31, var15, var17, 0.0, 0.5);
      double var36 = this.class_(var32, var21, var23, 0.0, 0.5);
      double var38 = this.class_(var33, var25, var27, 0.0, 0.5);
      return 70.0 * (var34 + var36 + var38);
   }

   private int class_(int var1) {
      return this.private_[var1 & 0xFF];
   }

   protected static double class_(int[] var0, double var1, double var3, double var5) {
      return (double)var0[0] * var1 + (double)var0[1] * var3 + (double)var0[2] * var5;
   }
}
