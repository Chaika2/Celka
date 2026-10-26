package celestial;

public class rbr_3 extends rEb_1 {
   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.WS;
   }

   public rbr_3(aI_2<? extends rbr_3> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.LAVA, 8.0F);
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);
      if (var1.id_extends() instanceof rEJ var5 && var5.sd()) {
         var5.sk();
         this.id_class(rdy_3.dX);
      }
   }

   @Override
   protected void id_class(rRh_1 var1) {
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Om));
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      aU_2 var6 = super.id_class(var1, var2, var3, var4, var5);
      this.id_byte(iQ_2.id_case).id_class(4.0);
      this.sJ();
      return var6;
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 2.1F;
   }

   @Override
   protected rhm_3 id_break(rdn_3 var1, float var2) {
      rhm_3 var3 = super.id_break(var1, var2);
      var3.id_case(100);
      return var3;
   }

   @Override
   protected void id_break(rRh_1 var1) {
   }

   @Override
   public boolean id_throws(rLY var1) {
      return var1.id_class() == rLD.id_this ? false : super.id_throws(var1);
   }

   @Override
   rqA_2 L() {
      return rqn_3.Ws;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.WP;
   }

   @Override
   public boolean id_public(an_3 var1) {
      if (!super.id_public(var1)) {
         return false;
      } else {
         if (var1 instanceof iB_2) {
            ((iB_2)var1).id_break(new rLY(rLD.id_this, 200));
         }

         return true;
      }
   }

   @Override
   protected void id_final() {
      this.id_int.id_class(3, new rBI<>(this, rbM_2.class, true));
      super.id_final();
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.WB;
   }
}
