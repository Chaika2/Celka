package celestial;

import java.util.Set;
import java.util.function.Predicate;

public class Rd_1 implements Predicate<ryw_3> {
   private final xc_3 class_;
   private final Set<rCZ<?>> break_;
   private final rcd_3 byte_;

   public Rd_1(xc_3 var1, Set<rCZ<?>> var2, rcd_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public xc_3 class_() {
      return this.class_;
   }

   public boolean class_(rrEm_1 var1, rfH_2 var2, int var3) {
      xc_3 var4 = xd_3.break_(this.class_, var1, var2);
      if (var4.catch_()) {
         var4 = this.class_;
      }

      if (!var1.class_(var2, var4, var3)) {
         return false;
      } else {
         if (this.byte_ != null) {
            ryO_2 var5 = var1.class_(var2);
            if (var5 != null) {
               rcd_3 var6 = this.byte_.catch_();
               var6.break_("x", var2.b_());
               var6.break_("y", var2.c_());
               var6.break_("z", var2.d_());
               var5.class_(var4, var6);
            }
         }

         return true;
      }
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
