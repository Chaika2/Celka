package celestial;

import java.util.Set;
import java.util.function.Predicate;

class Rh_1 implements Predicate<ryw_3> {
   private final xc_3 class_;
   private final Set<rCZ<?>> break_;
   private final rcd_3 byte_;

   public Rh_1(xc_3 var1, Set<rCZ<?>> var2, rcd_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public boolean class_(ryw_3 var1) {
      xc_3 var2 = var1.class_();
      if (!var2.class_(this.class_.break_())) {
         return false;
      } else {
         for (rCZ var4 : this.break_) {
            if (var2.byte_(var4) != this.class_.byte_(var4)) {
               return false;
            }
         }

         if (this.byte_ == null) {
            return true;
         } else {
            ryO_2 var5 = var1.break_();
            return var5 != null && rco_3.class_(this.byte_, var5.class_(new rcd_3()), true);
         }
      }
   }
}
