package celestial;

public class rdr_3 extends rdb_3 {
   @Override
   public rkc_3 byte_(rdn_3 var1) {
      return rkc_3.DRINK;
   }

   public rdr_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      return rpO_2.class_(var1, var2, var3);
   }

   @Override
   public rdn_3 class_(rdn_3 var1, rYB var2, iB_2 var3) {
      super.class_(var1, var2, var3);
      if (var3 instanceof rhN_2 var4) {
         Oo_1.while_.class_(var4, var1);
         var4.class_(rlB_2.byte_.break_(this));
      }

      if (!var2.continue_) {
         var3.protected_(rLD.super_);
      }

      if (var1.class_()) {
         return new rdn_3(rdy_3.Jn);
      } else {
         if (var3 instanceof rhd_3 && !((rhx_3)((rhd_3)var3).implements_[18]).protected_) {
            rdn_3 var6 = new rdn_3(rdy_3.Jn);
            rhd_3 var5 = (rhd_3)var3;
            if (!((rhz_3)var5.implements_[1]).throws_(var6)) {
               var5.class_(var6, false);
            }
         }

         return var1;
      }
   }

   @Override
   public int break_(rdn_3 var1) {
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
