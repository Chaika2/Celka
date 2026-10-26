package celestial;

public class xG_2 extends dB_2 implements kO_2 {
   public xG_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.class_(var3);
         if (var7 instanceof rHO) {
            var4.class_((rHO)var7);
            var4.break_(rlB_2.G);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHO) {
            ((rHO)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHO();
   }

   @Override
   public rxL_2 break_() {
      return rxL_2.WHITE;
   }
}
