package celestial;

public class rdT_2 extends rxJ_2 {
   public rdT_2(xd_3 var1, rdO_2 var2) {
      super(var1, var2);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      return ryZ_2.PASS;
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rff_3 var4 = id_class(var1, var2, rjs_3.SOURCE_ONLY);
      rff_3 var5 = var4.id_class(var4.id_class().id_final());
      ryZ_2 var6 = super.id_class(new rdH_2(var2, var3, var5));
      return new rym_3<>(var6, var2.id_protected(var3));
   }
}
