package celestial;

public class rxY_2 extends rdb_3 implements ee_3 {
   public rxY_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      if ((rhp_3)var2.implements_[29] != null) {
         if (!var1.continue_) {
            int var5 = ((rhp_3)var2.implements_[29]).break_(var4);
            var4.class_(var5, var2, var1x -> var1x.byte_(var3));
         }

         var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.Sz, rqL_2.NEUTRAL, 1.0F, 0.4F / (private_.nextFloat() * 0.4F + 0.8F));
      } else {
         var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.SN, rqL_2.NEUTRAL, 0.5F, 0.4F / (private_.nextFloat() * 0.4F + 0.8F));
         if (!var1.continue_) {
            int var7 = eA_2.byte_(var4);
            int var6 = eA_2.break_(var4);
            var1.a_(new rhp_3(var2, var1, var6, var7));
         }

         var2.class_(rlB_2.byte_.break_(this));
      }

      return rym_3.class_(var4, var1.import_());
   }

   @Override
   public int protected_() {
      return 1;
   }
}
