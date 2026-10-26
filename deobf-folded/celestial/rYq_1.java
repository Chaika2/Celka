package celestial;

public enum rYq_1 implements rYT {
   INSTANCE;

   ThreadLocal<double[]> DOUBLE8 = ThreadLocal.withInitial(() -> new double[8]);

   private static double id_class(double var0) {
      return var0 * var0;
   }

   private static double id_class(long var0) {
      double var2 = (double)((int)Math.floorMod(var0 >> 24, 1024L)) / 1024.0;
      return (var2 - 0.5) * 0.9;
   }

   private static double id_class(long var0, int var2, int var3, int var4, double var5, double var7, double var9) {
      long var11 = rpW_2.id_class(var0, (long)var2);
      var11 = rpW_2.id_class(var11, (long)var3);
      var11 = rpW_2.id_class(var11, (long)var4);
      var11 = rpW_2.id_class(var11, (long)var2);
      var11 = rpW_2.id_class(var11, (long)var3);
      var11 = rpW_2.id_class(var11, (long)var4);
      double var13 = id_class(var11);
      var11 = rpW_2.id_class(var11, var0);
      double var15 = id_class(var11);
      var11 = rpW_2.id_class(var11, var0);
      double var17 = id_class(var11);
      return id_class(var9 + var17) + id_class(var7 + var15) + id_class(var5 + var13);
   }

   @Override
   public rYG id_class(long var1, int var3, int var4, int var5, rYn_1 var6) {
      int var7 = var3 - 2;
      int var8 = var4 - 2;
      int var9 = var5 - 2;
      int var10 = var7 >> 2;
      int var11 = var8 >> 2;
      int var12 = var9 >> 2;
      double var13 = (double)(var7 & 3) / 4.0;
      double var15 = (double)(var8 & 3) / 4.0;
      double var17 = (double)(var9 & 3) / 4.0;
      double[] var19 = this.DOUBLE8.get();

      for (int var20 = 0; var20 < 8; var20++) {
         boolean var21 = (var20 & 4) == 0;
         boolean var22 = (var20 & 2) == 0;
         boolean var23 = (var20 & 1) == 0;
         int var24 = var21 ? var10 : var10 + 1;
         int var25 = var22 ? var11 : var11 + 1;
         int var26 = var23 ? var12 : var12 + 1;
         double var27 = var21 ? var13 : var13 - 1.0;
         double var29 = var22 ? var15 : var15 - 1.0;
         double var31 = var23 ? var17 : var17 - 1.0;
         var19[var20] = id_class(var1, var24, var25, var26, var27, var29, var31);
      }

      int var33 = 0;
      double var34 = var19[0];

      for (int var35 = 1; var35 < 8; var35++) {
         if (var34 > var19[var35]) {
            var33 = var35;
            var34 = var19[var35];
         }
      }

      int var36 = (var33 & 4) == 0 ? var10 : var10 + 1;
      int var37 = (var33 & 2) == 0 ? var11 : var11 + 1;
      int var38 = (var33 & 1) == 0 ? var12 : var12 + 1;
      return var6.id_protected(var36, var37, var38);
   }
}
