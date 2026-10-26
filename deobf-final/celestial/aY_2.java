package celestial;

public interface aY_2 extends aa_3 {
   default void class_(iB_2 var1, iB_2 var2, rhf_3 var3, float var4, float var5) {
      double var6 = var2.rx() - var1.rx();
      double var8 = var2.BO() - var1.BO();
      double var10 = (double)rfU_2.class_(var6 * var6 + var8 * var8);
      double var12 = var2.byte_(0.3333333333333333) - var3.re() + var10 * 0.2F;
      rje_3 var14 = this.class_(var1, new rjU_2(var6, var12, var8), var4);
      var3.byte_((double)var14.class_(), (double)var14.break_(), (double)var14.byte_(), var5, (float)(14 - ((rYB)var1.throws_[7]).abstract_().class_() * 4));
      var1.class_(rqn_3.PH, 1.0F, 1.0F / (var1.Sa().nextFloat() * 0.4F + 0.8F));
   }

   default void class_(iB_2 var1, float var2) {
      rpm_3 var3 = rhj_3.class_(var1, rdy_3.kU);
      rdn_3 var4 = var1.protected_(var3);
      if (var1.class_(rdy_3.kU)) {
         rxm_3.class_((rYB)var1.throws_[7], var1, var3, var4, var2, (float)(14 - ((rYB)var1.throws_[7]).abstract_().class_() * 4));
      }

      this.class_();
   }

   default rje_3 class_(iB_2 var1, rjU_2 var2, float var3) {
      rjU_2 var4 = var2.protected_();
      rjU_2 var5 = var4.byte_(new rjU_2(0.0, 1.0, 0.0));
      if (var5.catch_() <= 1.0E-7) {
         var5 = var4.byte_(var1.continue_(1.0F));
      }

      rjY_2 var6 = new rjY_2(new rje_3(var5), 90.0F, true);
      rje_3 var7 = new rje_3(var4);
      var7.class_(var6);
      rjY_2 var8 = new rjY_2(var7, var3, true);
      rje_3 var9 = new rje_3(var4);
      var9.class_(var8);
      return var9;
   }

   void class_();

   void class_(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4);

   void break_(boolean var1);

   iB_2 I_();
}
