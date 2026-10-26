package celestial;

public class dM_2 extends xd_3 {
   private static final rgP_2 id_volatile = new rgn_3("container.crafting");

   protected dM_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         var4.id_class(var1.id_break(var2, var3));
         var4.id_break(rlB_2.Q);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rJZ id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      return new rJR((var2x, var3x, var4) -> new rJa_1(var2x, var3x, rpq_3.id_class(var2, var3)), id_volatile);
   }
}
