package celestial;

public class rbr_3 extends rEb_1 {
   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.WS;
   }

   public rbr_3(aI_2<? extends rbr_3> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.LAVA, 8.0F);
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);
      if (var1.extends_() instanceof rEJ var5 && var5.sd()) {
         var5.sk();
         this.class_(rdy_3.dX);
      }
   }

   @Override
   protected void class_(rRh_1 var1) {
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Om));
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      aU_2 var6 = super.class_(var1, var2, var3, var4, var5);
      this.byte_(iQ_2.case_).class_(4.0);
      this.sJ();
      return var6;
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 2.1F;
   }

   @Override
   protected rhm_3 break_(rdn_3 var1, float var2) {
      rhm_3 var3 = super.break_(var1, var2);
      var3.case_(100);
      return var3;
   }

   @Override
   protected void break_(rRh_1 var1) {
   }

   @Override
   public boolean throws_(rLY var1) {
      return var1.class_() == rLD.this_ ? false : super.throws_(var1);
   }

   @Override
   rqA_2 L() {
      return rqn_3.Ws;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.WP;
   }

   @Override
   public boolean public_(an_3 var1) {
      if (!super.public_(var1)) {
         return false;
      } else {
         if (var1 instanceof iB_2) {
            ((iB_2)var1).break_(new rLY(rLD.this_, 200));
         }

         return true;
      }
   }

   @Override
   protected void final_() {
      this.int_.class_(3, new rBI<>(this, rbM_2.class, true));
      super.final_();
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.WB;
   }
}
