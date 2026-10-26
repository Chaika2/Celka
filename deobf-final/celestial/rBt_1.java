package celestial;

import java.util.EnumSet;

public class rBt_1 extends rBk_1 {
   private final aA_2 class_;
   private iB_2 break_;
   private double byte_;
   private double protected_;
   private double throws_;
   private final double case_;
   private final float catch_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.byte_, this.protected_, this.throws_, this.case_);
   }

   public rBt_1(aA_2 var1, double var2, float var4) {
      this.class_ = var1;
      this.case_ = var2;
      this.catch_ = var4;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      this.break_ = this.class_.I_();
      if (this.break_ == null) {
         return false;
      } else if (this.break_.int_(this.class_) > (double)(this.catch_ * this.catch_)) {
         return false;
      } else {
         rjU_2 var1 = iX_2.break_(this.class_, 16, 7, this.break_.Ps());
         if (var1 == null) {
            return false;
         } else {
            this.byte_ = var1.break_;
            this.protected_ = var1.byte_;
            this.throws_ = var1.protected_;
            return true;
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_() && this.break_.BM() && this.break_.int_(this.class_) < (double)(this.catch_ * this.catch_);
   }

   @Override
   public void protected_() {
      this.break_ = null;
   }
}
