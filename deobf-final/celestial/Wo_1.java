package celestial;

public class Wo_1 extends dM_2 {
   private static final rgP_2 volatile_ = new rgn_3("container.upgrade");

   protected Wo_1(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rJZ class_(xc_3 var1, rYB var2, rfH_2 var3) {
      return new rJR((var2x, var3x, var4) -> new rJo_1(var2x, var3x, rpq_3.class_(var2, var3)), volatile_);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         var4.class_(var1.break_(var2, var3));
         var4.break_(rlB_2.t);
         return ryZ_2.CONSUME;
      }
   }
}
