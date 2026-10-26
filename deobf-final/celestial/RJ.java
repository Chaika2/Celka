package celestial;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

class RJ implements Predicate<ryw_3> {
   private final rlb_3<xd_3> class_;
   private final rcd_3 break_;
   private final Map<String, String> byte_;

   RJ(rlb_3<xd_3> var1, Map<String, String> var2, rcd_3 var3) {
      this.class_ = var1;
      this.byte_ = var2;
      this.break_ = var3;
   }

   public boolean class_(ryw_3 var1) {
      xc_3 var2 = var1.class_();
      if (!var2.class_(this.class_)) {
         return false;
      } else {
         for (Entry var4 : this.byte_.entrySet()) {
            rCZ var5 = var2.break_().new_().class_((String)var4.getKey());
            if (var5 == null) {
               return false;
            }

            Comparable var6 = (Comparable)var5.break_((String)var4.getValue()).orElse(null);
            if (var6 == null) {
               return false;
            }

            if (var2.byte_(var5) != var6) {
               return false;
            }
         }

         if (this.break_ == null) {
            return true;
         } else {
            ryO_2 var7 = var1.break_();
            return var7 != null && rco_3.class_(this.break_, var7.class_(new rcd_3()), true);
         }
      }
   }
}
