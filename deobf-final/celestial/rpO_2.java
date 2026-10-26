package celestial;

public class rpO_2 {
   public static rdn_3 class_(rdn_3 var0, rhd_3 var1, rdn_3 var2) {
      return class_(var0, var1, var2, true);
   }

   public static rdn_3 class_(rdn_3 var0, rhd_3 var1, rdn_3 var2, boolean var3) {
      boolean var4 = ((rhx_3)var1.implements_[18]).protected_;
      if (var3 && var4) {
         if (!((rhz_3)var1.implements_[1]).implements_(var2)) {
            ((rhz_3)var1.implements_[1]).throws_(var2);
         }

         return var0;
      } else {
         if (!var4) {
            var0.catch_(1);
         }

         if (var0.class_()) {
            return var2;
         } else {
            if (!((rhz_3)var1.implements_[1]).throws_(var2)) {
               var1.class_(var2, false);
            }

            return var0;
         }
      }
   }

   public static rym_3<rdn_3> class_(rYB var0, rhd_3 var1, rpm_3 var2) {
      var1.break_(var2);
      return rym_3.break_(var1.protected_(var2));
   }
}
