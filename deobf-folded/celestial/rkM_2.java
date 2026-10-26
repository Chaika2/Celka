package celestial;

public class rkM_2 extends rdb_3 {
   public rkM_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rdn_3 id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      rdn_3 var4 = super.id_class(var1, var2, var3);
      return var3 instanceof rhd_3 && ((rhx_3)((rhd_3)var3).id_implements[18]).id_protected ? var4 : new rdn_3(rdy_3.OU);
   }
}
