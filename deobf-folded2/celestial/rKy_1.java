package celestial;

import java.util.Random;

public final class rKy_1 {
   private final byte[] id_protected;
   public final double id_class;
   public final double id_break;
   public final double id_byte;

   public rKy_1(Random var1) {
      this.id_class = var1.nextDouble() * 256.0;
      this.id_break = var1.nextDouble() * 256.0;
      this.id_byte = var1.nextDouble() * 256.0;
      this.id_protected = new byte[256];

      for (int var2 = 0; var2 < 256; var2++) {
         this.id_protected[var2] = (byte)var2;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         int var3 = var1.nextInt(256 - var5);
         byte var4 = this.id_protected[var5];
         this.id_protected[var5] = this.id_protected[var5 + var3];
         this.id_protected[var5 + var3] = var4;
      }
   }

   public double id_class(int var1, int var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      int var16 = this.id_class(var1) + var2;
      int var17 = this.id_class(var16) + var3;
      int var18 = this.id_class(var16 + 1) + var3;
      int var19 = this.id_class(var1 + 1) + var2;
      int var20 = this.id_class(var19) + var3;
      int var21 = this.id_class(var19 + 1) + var3;
      double var22 = id_class(this.id_class(var17), var4, var6, var8);
      double var24 = id_class(this.id_class(var20), var4 - 1.0, var6, var8);
      double var26 = id_class(this.id_class(var18), var4, var6 - 1.0, var8);
      double var28 = id_class(this.id_class(var21), var4 - 1.0, var6 - 1.0, var8);
      double var30 = id_class(this.id_class(var17 + 1), var4, var6, var8 - 1.0);
      double var32 = id_class(this.id_class(var20 + 1), var4 - 1.0, var6, var8 - 1.0);
      double var34 = id_class(this.id_class(var18 + 1), var4, var6 - 1.0, var8 - 1.0);
      double var36 = id_class(this.id_class(var21 + 1), var4 - 1.0, var6 - 1.0, var8 - 1.0);
      return rfU_2.id_class(var10, var12, var14, var22, var24, var26, var28, var30, var32, var34, var36);
   }

   private int id_class(int var1) {
      return this.id_protected[var1 & 0xFF] & 0xFF;
   }

   private static double id_class(int var0, double var1, double var3, double var5) {
      int var7 = var0 & 15;
      return rKI.id_class(rKI.id_class[var7], var1, var3, var5);
   }

   public double id_class(double var1, double var3, double var5, double var7, double var9) {
      double var11 = var1 + this.id_class;
      double var13 = var3 + this.id_break;
      double var15 = var5 + this.id_byte;
      int var17 = rfU_2.id_byte(var11);
      int var18 = rfU_2.id_byte(var13);
      int var19 = rfU_2.id_byte(var15);
      double var20 = var11 - (double)var17;
      double var22 = var13 - (double)var18;
      double var24 = var15 - (double)var19;
      double var26 = rfU_2.id_implements(var20);
      double var28 = rfU_2.id_implements(var22);
      double var30 = rfU_2.id_implements(var24);
      double var32;
      if (var7 != 0.0) {
         double var34 = Math.min(var9, var22);
         var32 = (double)rfU_2.id_byte(var34 / var7) * var7;
      } else {
         var32 = 0.0;
      }

      return this.id_class(var17, var18, var19, var20, var22 - var32, var24, var26, var28, var30);
   }
}
