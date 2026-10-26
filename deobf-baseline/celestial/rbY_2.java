package celestial;

public class rbY_2 extends rbZ_2 {
   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.PW;
   }

   public rbY_2(aI_2<? extends rbY_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.hg && !this.n_()) {
         var1.id_class(rqn_3.Pz, 1.0F, 1.0F);
         rdn_3 var4 = rpO_2.id_class(var3, var1, rdy_3.hi.id_continue());
         var1.id_class(var2, var4);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   public rbY_2 id_break(rrEm_1 var1, au_3 var2) {
      return aI_2.id_native.id_class(var1);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.id_break * 0.95F : 1.3F;
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.PQ, 0.15F, 1.0F);
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.2F);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Pd;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rBY(this, 2.0));
      this.id_package.id_class(2, new rBP(this, 1.0));
      this.id_package.id_class(3, new rSO(this, 1.25, rkg_3.id_class(rdy_3.hB), false));
      this.id_package.id_class(4, new rBx_1(this, 1.25));
      this.id_package.id_class(5, new rSk_1(this, 1.0));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(7, new rBC(this));
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
