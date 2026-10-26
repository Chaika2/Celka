package celestial;

public class rdw_3 extends rxP_2 {
   public rdw_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = rxI_2.id_class(var1, rfU_2.id_byte(var2.rx()), rfU_2.id_byte(var2.BO()), (byte)0, true, false);
      rdn_3 var5 = var2.id_protected(var3);
      if (!((rhx_3)var2.id_implements[18]).id_protected) {
         var5.id_catch(1);
      }

      var2.id_class(rlB_2.id_byte.id_break(this));
      var2.id_class(rqn_3.dj, 1.0F, 1.0F);
      if (var5.id_class()) {
         return rym_3.id_class(var4, var1.id_import());
      } else {
         if (!((rhz_3)var2.id_implements[1]).id_throws(var4.id_implements())) {
            var2.id_class(var4, false);
         }

         return rym_3.id_class(var5, var1.id_import());
      }
   }
}
