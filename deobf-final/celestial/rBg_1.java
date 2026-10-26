package celestial;

import java.util.EnumSet;

public class rBg_1 extends rSM {
   private final rOQ class_;
   private iB_2 break_;
   private int byte_;

   @Override
   public void byte_() {
      this.throws_.byte_(this.break_);
      iB_2 var1 = this.class_.sF();
      if (var1 != null) {
         this.byte_ = var1.Sb();
      }

      super.byte_();
   }

   public rBg_1(rOQ var1) {
      super(var1, false);
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.TARGET));
   }

   @Override
   public boolean class_() {
      if (this.class_.sZ() && !this.class_.sL()) {
         iB_2 var1 = this.class_.sF();
         if (var1 == null) {
            return false;
         } else {
            this.break_ = var1.Sr();
            int var2 = var1.Sb();
            return var2 != this.byte_ && this.class_(this.break_, ay_3.class_) && this.class_.class_(this.break_, var1);
         }
      } else {
         return false;
      }
   }
}
