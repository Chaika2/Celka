package celestial;

public class rpO_2 {
   public static rdn_3 id_class(rdn_3 var0, rhd_3 var1, rdn_3 var2) {
      return id_class(var0, var1, var2, true);
   }

   public static rdn_3 id_class(rdn_3 var0, rhd_3 var1, rdn_3 var2, boolean var3) {
      boolean var4 = ((rhx_3)var1.id_implements[18]).id_protected;
      if (var3 && var4) {
         if (!((rhz_3)var1.id_implements[1]).id_implements(var2)) {
            ((rhz_3)var1.id_implements[1]).id_throws(var2);
         }

         return var0;
      } else {
         if (!var4) {
            var0.id_catch(1);
         }

         if (var0.id_class()) {
            return var2;
         } else {
            if (!((rhz_3)var1.id_implements[1]).id_throws(var2)) {
               var1.id_class(var2, false);
            }

            return var0;
         }
      }
   }

   public static rym_3<rdn_3> id_class(rYB var0, rhd_3 var1, rpm_3 var2) {
      var1.id_break(var2);
      return rym_3.id_break(var1.id_protected(var2));
   }
}
