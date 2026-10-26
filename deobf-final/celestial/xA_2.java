package celestial;

public class xA_2 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.z;
   protected static final rjC_2[] final_ = new rjC_2[]{
      xd_3.class_(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.class_(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.class_(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.class_(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.class_(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.class_(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      xd_3.class_(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected xA_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_[var1.byte_(volatile_)];
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.byte_(var3.break_()).byte_().break_();
   }

   private ryZ_2 class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var4.else_(false)) {
         return ryZ_2.PASS;
      } else {
         var4.break_(rlB_2.switch_);
         var4.sk().class_(2, 0.1F);
         int var5 = var3.byte_(volatile_);
         if (var5 < 6) {
            var1.class_(var2, var3.class_(volatile_, Integer.valueOf(var5 + 1)), 3);
         } else {
            var1.class_(var2, false);
         }

         return ryZ_2.SUCCESS;
      }
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         rdn_3 var7 = var4.protected_(var5);
         if (this.class_(var2, var3, var1, var4).class_()) {
            return ryZ_2.SUCCESS;
         }

         if (var7.class_()) {
            return ryZ_2.CONSUME;
         }
      }

      return this.class_(var2, var3, var1, var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return (7 - var1.byte_(volatile_)) * 2;
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
