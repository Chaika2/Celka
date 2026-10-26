package celestial;

import java.util.List;
import java.util.Optional;

public class rfY_2 implements rfD_2 {
   private final an_3 class_;
   private final boolean break_;

   public rfY_2(an_3 var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.class_;
   }

   @Override
   public rjU_2 class_() {
      return this.break_ ? this.class_.Ps().break_(0.0, (double)this.class_.Bx(), 0.0) : this.class_.Ps();
   }

   @Override
   public boolean class_(iB_2 var1) {
      if (!(this.class_ instanceof iB_2)) {
         return true;
      } else {
         Optional var2 = var1.SF().byte_(il_3.private_);
         return this.class_.BM() && var2.isPresent() && ((List)var2.get()).contains(this.class_);
      }
   }

   @Override
   public rfH_2 break_() {
      return this.class_.Bs();
   }
}
