package celestial;

public interface rEo_1 {
   int n();

   static boolean class_(iB_2 var0, iB_2 var1) {
      float var2 = (float)var0.class_(iQ_2.case_);
      float var3;
      if (!var0.n_() && (int)var2 > 0) {
         var3 = var2 / 2.0F + (float)((rYB)var0.throws_[7]).int_.nextInt((int)var2);
      } else {
         var3 = var2;
      }

      boolean var4 = var1.break_(rye_3.byte_(var0), var3);
      if (var4) {
         var0.class_(var0, var1);
         if (!var0.n_()) {
            break_(var0, var1);
         }
      }

      return var4;
   }

   static void break_(iB_2 var0, iB_2 var1) {
      double var2 = var0.class_(iQ_2.catch_);
      double var4 = var1.class_(iQ_2.byte_);
      double var6 = var2 - var4;
      if (!(var6 <= 0.0)) {
         double var8 = var1.rx() - var0.rx();
         double var10 = var1.BO() - var0.BO();
         float var12 = (float)(((rYB)var0.throws_[7]).int_.nextInt(21) - 10);
         double var13 = var6 * (double)(((rYB)var0.throws_[7]).int_.nextFloat() * 0.5F + 0.2F);
         rjU_2 var15 = new rjU_2(var8, 0.0, var10).protected_().class_(var13).break_(var12);
         double var16 = var6 * (double)((rYB)var0.throws_[7]).int_.nextFloat() * 0.5;
         var1.implements_(var15.break_, var16, var15.protected_);
         Boolean var22 = true;
         var1.throws_[25] = var22;
      }
   }
}
