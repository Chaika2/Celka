package celestial;

import java.util.EnumSet;

public class rBT extends rBk_1 {
   private final aA_2 class_;
   private double break_;
   private double byte_;
   private double protected_;
   private final double throws_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.break_, this.byte_, this.protected_, this.throws_);
   }

   public rBT(aA_2 var1, double var2) {
      this.class_ = var1;
      this.throws_ = var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.class_.X()) {
         return false;
      } else {
         rjU_2 var1 = iX_2.break_(this.class_, 16, 7, rjU_2.protected_(this.class_.J()));
         if (var1 == null) {
            return false;
         } else {
            this.break_ = var1.break_;
            this.byte_ = var1.byte_;
            this.protected_ = var1.protected_;
            return true;
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_();
   }
}
