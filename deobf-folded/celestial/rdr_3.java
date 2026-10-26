package celestial;

public class rdr_3 extends rdb_3 {
   @Override
   public rkc_3 id_byte(rdn_3 var1) {
      return rkc_3.DRINK;
   }

   public rdr_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      return rpO_2.id_class(var1, var2, var3);
   }

   @Override
   public rdn_3 id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      super.id_class(var1, var2, var3);
      if (var3 instanceof rhN_2 var4) {
         Oo_1.id_while.id_class(var4, var1);
         var4.id_class(rlB_2.id_byte.id_break(this));
      }

      if (!var2.id_continue) {
         var3.id_protected(rLD.id_super);
      }

      if (var1.id_class()) {
         return new rdn_3(rdy_3.Jn);
      } else {
         if (var3 instanceof rhd_3 && !((rhx_3)((rhd_3)var3).id_implements[18]).id_protected) {
            rdn_3 var6 = new rdn_3(rdy_3.Jn);
            rhd_3 var5 = (rhd_3)var3;
            if (!((rhz_3)var5.id_implements[1]).id_throws(var6)) {
               var5.id_class(var6, false);
            }
         }

         return var1;
      }
   }

   @Override
   public int id_break(rdn_3 var1) {
      return 40;
   }

   @Override
   public rqA_2 U_() {
      return rqn_3.sD;
   }

   @Override
   public rqA_2 V_() {
      return rqn_3.sD;
   }
}
