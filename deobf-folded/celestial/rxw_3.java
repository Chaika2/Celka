package celestial;

public class rxw_3 extends rdb_3 {
   public rxw_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.SP, rqL_2.NEUTRAL, 0.5F, 0.4F / (id_private.nextFloat() * 0.4F + 0.8F));
      if (!var1.id_continue) {
         rsr_3 var5 = new rsr_3(var1, var2);
         var5.id_break(var4);
         var5.id_class(var2, (Float)var2.id_throws[16], (Float)var2.id_throws[15], -20.0F, 0.7F, 1.0F);
         var1.a_(var5);
      }

      var2.id_class(rlB_2.id_byte.id_break(this));
      if (!((rhx_3)var2.id_implements[18]).id_protected) {
         var4.id_catch(1);
      }

      return rym_3.id_class(var4, var1.id_import());
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return true;
   }
}
