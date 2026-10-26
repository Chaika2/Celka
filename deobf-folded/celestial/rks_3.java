package celestial;

public class rks_3 extends rku_3 {
   public rks_3(rdO_2 var1, xd_3 var2, xd_3 var3) {
      super(var2, var3, var1);
   }

   @Override
   protected boolean id_class(rfH_2 var1, rYB var2, rhd_3 var3, rdn_3 var4, xc_3 var5) {
      boolean var6 = super.id_class(var1, var2, var3, var4, var5);
      if (!var2.id_continue && !var6 && var3 != null) {
         var3.id_class((ryS_2)var2.id_class(var1));
      }

      return var6;
   }
}
