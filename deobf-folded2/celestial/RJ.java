package celestial;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

class RJ implements Predicate<ryw_3> {
   private final rlb_3<xd_3> id_class;
   private final rcd_3 id_break;
   private final Map<String, String> id_byte;

   RJ(rlb_3<xd_3> var1, Map<String, String> var2, rcd_3 var3) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_break = var3;
   }

   public boolean id_class(ryw_3 var1) {
      xc_3 var2 = var1.id_class();
      if (!var2.id_class(this.id_class)) {
         return false;
      } else {
         for (Entry var4 : this.id_byte.entrySet()) {
            rCZ var5 = var2.id_break().id_new().id_class((String)var4.getKey());
            if (var5 == null) {
               return false;
            }

            Comparable var6 = (Comparable)var5.id_break((String)var4.getValue()).orElse(null);
            if (var6 == null) {
               return false;
            }

            if (var2.id_byte(var5) != var6) {
               return false;
            }
         }

         if (this.id_break == null) {
            return true;
         } else {
            ryO_2 var7 = var1.id_break();
            return var7 != null && rco_3.id_class(this.id_break, var7.id_class(new rcd_3()), true);
         }
      }
   }
}
