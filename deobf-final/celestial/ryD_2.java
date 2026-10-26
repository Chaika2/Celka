package celestial;

import javax.annotation.Nonnull;

public class ryD_2 {
   private static final double[] class_ = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

   @Nonnull
   public static rjU_2 class_(rjU_2 var0, ryU_2 var1) {
      int var2 = rfU_2.byte_(var0.class_());
      int var3 = rfU_2.byte_(var0.break_());
      int var4 = rfU_2.byte_(var0.byte_());
      double var5 = var0.class_() - (double)var2;
      double var7 = var0.break_() - (double)var3;
      double var9 = var0.byte_() - (double)var4;
      double var11 = 0.0;
      rjU_2 var13 = rjU_2.class_;

      for (int var14 = 0; var14 < 6; var14++) {
         double var15 = rfU_2.protected_(var5, class_[var14 + 1], class_[var14]);
         int var17 = var2 - 2 + var14;

         for (int var18 = 0; var18 < 6; var18++) {
            double var19 = rfU_2.protected_(var7, class_[var18 + 1], class_[var18]);
            int var21 = var3 - 2 + var18;

            for (int var22 = 0; var22 < 6; var22++) {
               double var23 = rfU_2.protected_(var9, class_[var22 + 1], class_[var22]);
               int var25 = var4 - 2 + var22;
               double var26 = var15 * var19 * var23;
               var11 += var26;
               var13 = var13.throws_(var1.fetch(var17, var21, var25).class_(var26));
            }
         }
      }

      return var13.class_(1.0 / var11);
   }
}
