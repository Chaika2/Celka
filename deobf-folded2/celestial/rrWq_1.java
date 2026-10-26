package celestial;

import java.util.UUID;

public class rrWq_1 {
   public static ryO_2 id_class(rfH_2 var0) {
      rrEm_1 var1 = id_class();
      if (var1 == null) {
         return null;
      } else {
         roC_2 var2 = var1.id_else().id_break(var0.b_() >> 4, var0.d_() >> 4, roN_2.id_volatile, false);
         return var2 == null ? null : var2.id_class(var0);
      }
   }

   public static an_3 id_class(UUID var0) {
      rrEm_1 var1 = id_class();
      return var1 == null ? null : var1.id_break(var0);
   }

   public static rrEm_1 id_class() {
      QY var0 = rrbb_3.X();
      gm_3 var1 = (gm_3)var0.id_class[56];
      if (var1 == null) {
         return null;
      } else if (!var0.id_switch()) {
         return null;
      } else {
         rng_3 var2 = var0.id_this();
         if (var2 == null) {
            return null;
         } else {
            rqM_2 var3 = var1.E();
            if (var3 == null) {
               return null;
            } else {
               try {
                  return var2.id_class(var3);
               } catch (NullPointerException var5) {
                  return null;
               }
            }
         }
      }
   }
}
