package celestial;

public class kC_2 extends kE_2 {
   private static final rgP_2 volatile_ = new rgn_3("container.loom");

   protected kC_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(p, var1.case_().case_());
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         var4.class_(var1.break_(var2, var3));
         var4.break_(rlB_2.n);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rJZ class_(xc_3 var1, rYB var2, rfH_2 var3) {
      return new rJR((var2x, var3x, var4) -> new rJL(var2x, var3x, rpq_3.class_(var2, var3)), volatile_);
   }
}
