package celestial;

public class rkm_3 extends rdb_3 {
   public rkm_3(rdO_2 var1) {
      super(var1);
   }

   public static boolean class_(rcd_3 var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.byte_("pages", 9)) {
         return false;
      } else {
         rcy_3 var1 = var0.protected_("pages", 8);

         for (int var2 = 0; var2 < var1.size(); var2++) {
            String var3 = var1.implements_(var2);
            if (var3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      var2.class_(var4, var3);
      var2.class_(rlB_2.byte_.break_(this));
      return rym_3.class_(var4, var1.import_());
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (var4.class_(xu_3.Xs)) {
         return kv_3.class_(var2, var3, var4, var1.volatile_()) ? ryZ_2.class_(var2.continue_) : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }
}
