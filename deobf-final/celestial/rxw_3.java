package celestial;

public class rxw_3 extends rdb_3 {
   public rxw_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.SP, rqL_2.NEUTRAL, 0.5F, 0.4F / (private_.nextFloat() * 0.4F + 0.8F));
      if (!var1.continue_) {
         rsr_3 var5 = new rsr_3(var1, var2);
         var5.break_(var4);
         var5.class_(var2, (Float)var2.throws_[16], (Float)var2.throws_[15], -20.0F, 0.7F, 1.0F);
         var1.a_(var5);
      }

      var2.class_(rlB_2.byte_.break_(this));
      if (!((rhx_3)var2.implements_[18]).protected_) {
         var4.catch_(1);
      }

      return rym_3.class_(var4, var1.import_());
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return true;
   }
}
