package celestial;

import java.util.EnumSet;

public class rBj_1 extends rBk_1 {
   private final rRq_1 class_;
   private final is_3 break_;
   private iB_2 byte_;
   private int protected_;

   public rBj_1(is_3 var1) {
      this.break_ = var1;
      this.class_ = (rYB)var1.throws_[7];
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.break_.I_();
      if (var1 == null) {
         return false;
      } else {
         this.byte_ = var1;
         return true;
      }
   }

   @Override
   public boolean break_() {
      if (!this.byte_.BM()) {
         return false;
      } else {
         return this.break_.int_(this.byte_) > 225.0 ? false : !this.break_.public_().native_() || this.class_();
      }
   }

   @Override
   public void throws_() {
      this.break_.continue_().class_(this.byte_, 30.0F, 30.0F);
      double var1 = (double)(this.break_.PN() * 2.0F * this.break_.PN() * 2.0F);
      double var3 = this.break_.class_(this.byte_.rx(), this.byte_.re(), this.byte_.BO());
      double var5 = 0.8;
      if (var3 > var1 && var3 < 16.0) {
         var5 = 1.33;
      } else if (var3 < 225.0) {
         var5 = 0.6;
      }

      this.break_.public_().class_(this.byte_, var5);
      this.protected_ = Math.max(this.protected_ - 1, 0);
      if (!(var3 > var1) && this.protected_ <= 0) {
         this.protected_ = 20;
         this.break_.public_(this.byte_);
      }
   }

   @Override
   public void protected_() {
      this.byte_ = null;
      this.break_.public_().final_();
   }
}
