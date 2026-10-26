package celestial;

public class rbY_2 extends rbZ_2 {
   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.PW;
   }

   public rbY_2(aI_2<? extends rbY_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.hg && !this.n_()) {
         var1.class_(rqn_3.Pz, 1.0F, 1.0F);
         rdn_3 var4 = rpO_2.class_(var3, var1, rdy_3.hi.continue_());
         var1.class_(var2, var4);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   public rbY_2 break_(rrEm_1 var1, au_3 var2) {
      return aI_2.native_.class_(var1);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.break_ * 0.95F : 1.3F;
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.PQ, 0.15F, 1.0F);
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 10.0).class_(iQ_2.protected_, 0.2F);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Pd;
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rBY(this, 2.0));
      this.package_.class_(2, new rBP(this, 1.0));
      this.package_.class_(3, new rSO(this, 1.25, rkg_3.class_(rdy_3.hB), false));
      this.package_.class_(4, new rBx_1(this, 1.25));
      this.package_.class_(5, new rSk_1(this, 1.0));
      this.package_.class_(6, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(7, new rBC(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Pk;
   }

   @Override
   protected float Si() {
      return 0.4F;
   }
}
