package celestial;

public abstract class JV extends dB_2 {
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCN final_ = rCT.continue_;

   protected JV(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         this.class_(var2, var3, var4);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   protected abstract void class_(rYB var1, rfH_2 var2, rhd_3 var3);

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.case_().case_());
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHS) {
            ((rHS)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.class_(var2.class_(var3));
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rHS) {
            rXn_1.class_(var2, var3, (rHS)var6);
            ((rHS)var6).class_(var2, rjU_2.class_((rja_3)var3));
            var2.byte_(var3, this);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
