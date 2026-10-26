package celestial;

public class rxY_2 extends rdb_3 implements ee_3 {
   public rxY_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      if ((rhp_3)var2.id_implements[29] != null) {
         if (!var1.id_continue) {
            int var5 = ((rhp_3)var2.id_implements[29]).id_break(var4);
            var4.id_class(var5, var2, var1x -> var1x.id_byte(var3));
         }

         var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.Sz, rqL_2.NEUTRAL, 1.0F, 0.4F / (id_private.nextFloat() * 0.4F + 0.8F));
      } else {
         var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.SN, rqL_2.NEUTRAL, 0.5F, 0.4F / (id_private.nextFloat() * 0.4F + 0.8F));
         if (!var1.id_continue) {
            int var7 = eA_2.id_byte(var4);
            int var6 = eA_2.id_break(var4);
            var1.a_(new rhp_3(var2, var1, var6, var7));
         }

         var2.id_class(rlB_2.id_byte.id_break(this));
      }

      return rym_3.id_class(var4, var1.id_import());
   }

   @Override
   public int id_protected() {
      return 1;
   }
}
