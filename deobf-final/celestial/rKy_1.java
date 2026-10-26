package celestial;

import java.util.Random;

public final class rKy_1 {
   private final byte[] protected_;
   public final double class_;
   public final double break_;
   public final double byte_;

   public rKy_1(Random var1) {
      this.class_ = var1.nextDouble() * 256.0;
      this.break_ = var1.nextDouble() * 256.0;
      this.byte_ = var1.nextDouble() * 256.0;
      this.protected_ = new byte[256];

      for (int var2 = 0; var2 < 256; var2++) {
         this.protected_[var2] = (byte)var2;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5);
         byte var4 = this.protected_[var5];
         this.protected_[var5] = this.protected_[var5 + var3];
         this.protected_[var5 + var3] = var4;
      }
   }

   public double class_(int var1, int var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      int var16 = this.class_(var1) + var2;
      int var17 = this.class_(var16) + var3;
      int var18 = this.class_(var16 + 1) + var3;
      int var19 = this.class_(var1 + 1) + var2;
      int var20 = this.class_(var19) + var3;
      int var21 = this.class_(var19 + 1) + var3;
      double var22 = class_(this.class_(var17), var4, var6, var8);
      double var24 = class_(this.class_(var20), var4 - 1.0, var6, var8);
      double var26 = class_(this.class_(var18), var4, var6 - 1.0, var8);
      double var28 = class_(this.class_(var21), var4 - 1.0, var6 - 1.0, var8);
      double var30 = class_(this.class_(var17 + 1), var4, var6, var8 - 1.0);
      double var32 = class_(this.class_(var20 + 1), var4 - 1.0, var6, var8 - 1.0);
      double var34 = class_(this.class_(var18 + 1), var4, var6 - 1.0, var8 - 1.0);
      double var36 = class_(this.class_(var21 + 1), var4 - 1.0, var6 - 1.0, var8 - 1.0);
      return rfU_2.class_(var10, var12, var14, var22, var24, var26, var28, var30, var32, var34, var36);
   }

   private int class_(int var1) {
      return this.protected_[var1 & 0xFF] & 0xFF;
   }

   private static double class_(int var0, double var1, double var3, double var5) {
      int var7 = var0 & 15;
      return rKI.class_(rKI.class_[var7], var1, var3, var5);
   }

   public double class_(double var1, double var3, double var5, double var7, double var9) {
      double var11 = var1 + this.class_;
      double var13 = var3 + this.break_;
      double var15 = var5 + this.byte_;
      int var17 = rfU_2.byte_(var11);
      int var18 = rfU_2.byte_(var13);
      int var19 = rfU_2.byte_(var15);
      double var20 = var11 - (double)var17;
      double var22 = var13 - (double)var18;
      double var24 = var15 - (double)var19;
      double var26 = rfU_2.implements_(var20);
      double var28 = rfU_2.implements_(var22);
      double var30 = rfU_2.implements_(var24);
      double var32;
      if (var7 != 0.0) {
         double var34 = Math.min(var9, var22);
         var32 = (double)rfU_2.byte_(var34 / var7) * var7;
      } else {
         var32 = 0.0;
      }

      return this.class_(var17, var18, var19, var20, var22 - var32, var24, var26, var28, var30);
   }
}
