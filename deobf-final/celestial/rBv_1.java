package celestial;

import java.util.EnumSet;

public class rBv_1 extends rBk_1 {
   private final is_3 class_;
   private iB_2 break_;
   private final float byte_;

   @Override
   public void byte_() {
      rjU_2 var1 = this.class_.rv();
      rjU_2 var2 = new rjU_2(this.break_.rx() - this.class_.rx(), 0.0, this.break_.BO() - this.class_.BO());
      if (var2.catch_() > 1.0E-7) {
         var2 = var2.protected_().class_(0.4).throws_(var1.class_(0.2));
      }

      this.class_.catch_(var2.break_, (double)this.byte_, var2.protected_);
   }

   public rBv_1(is_3 var1, float var2) {
      this.class_ = var1;
      this.byte_ = var2;
      this.class_(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.class_.BP()) {
         return false;
      } else {
         this.break_ = this.class_.I_();
         if (this.break_ == null) {
            return false;
         } else {
            double var1 = this.class_.int_(this.break_);
            if (var1 < 4.0 || var1 > 16.0) {
               return false;
            } else {
               return !this.class_.BL() ? false : this.class_.Sa().nextInt(5) == 0;
            }
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.BL();
   }
}
