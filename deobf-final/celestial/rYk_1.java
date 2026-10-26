package celestial;

enum rYk_1 {
   rYk_1(String var3) {
   }

   @Override
   public float class_(rfH_2 var1, float var2) {
      double var3 = rYG.implements_.class_((double)var1.b_() * 0.05, (double)var1.d_() * 0.05, false) * 7.0;
      double var5 = rYG.case_.class_((double)var1.b_() * 0.2, (double)var1.d_() * 0.2, false);
      double var7 = var3 + var5;
      if (var7 < 0.3) {
         double var9 = rYG.case_.class_((double)var1.b_() * 0.09, (double)var1.d_() * 0.09, false);
         if (var9 < 0.8) {
            return 0.2F;
         }
      }

      return var2;
   }
}
