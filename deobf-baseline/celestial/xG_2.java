package celestial;

public class xG_2 extends dB_2 implements kO_2 {
   public xG_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.id_class(var3);
         if (var7 instanceof rHO) {
            var4.id_class((rHO)var7);
            var4.id_break(rlB_2.G);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHO) {
            ((rHO)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHO();
   }

   @Override
   public rxL_2 id_break() {
      return rxL_2.WHITE;
   }
}
