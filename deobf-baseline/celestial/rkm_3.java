package celestial;

public class rkm_3 extends rdb_3 {
   public rkm_3(rdO_2 var1) {
      super(var1);
   }

   public static boolean id_class(rcd_3 var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.id_byte("pages", 9)) {
         return false;
      } else {
         rcy_3 var1 = var0.id_protected("pages", 8);

         for (int var2 = 0; var2 < var1.size(); var2++) {
            String var3 = var1.id_implements(var2);
            if (var3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      var2.id_class(var4, var3);
      var2.id_class(rlB_2.id_byte.id_break(this));
      return rym_3.id_class(var4, var1.id_import());
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (var4.id_class(xu_3.Xs)) {
         return kv_3.id_class(var2, var3, var4, var1.id_volatile()) ? ryZ_2.id_class(var2.id_continue) : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }
}
