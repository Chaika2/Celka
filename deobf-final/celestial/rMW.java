package celestial;

import java.util.EnumSet;

class rMW extends rMr_1 {
   private int byte_;

   @Override
   public void byte_() {
      this.break_.this_(false);
      this.break_.synchronized_(false);
      this.break_.return_(false);
      this.break_.super_(false);
      this.break_.while_(true);
      this.break_.public_().final_();
      this.break_.super_().class_(this.break_.rx(), this.break_.re(), this.break_.BO(), 0.0);
   }

   public rMW(rba_3 var1) {
      super(var1);
      this.break_ = var1;
      this.byte_ = rba_3.throws_(this.break_).nextInt(140);
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
   }

   @Override
   public boolean class_() {
      return this.break_.private_[42] == 0.0F && this.break_.private_[43] == 0.0F && this.break_.private_[44] == 0.0F
         ? this.finally_() || this.break_.Sc()
         : false;
   }

   @Override
   public boolean break_() {
      return this.finally_();
   }

   private boolean finally_() {
      if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else {
         return ((rYB)this.break_.throws_[7]).strictfp_() && this.catch_() && !this.private_();
      }
   }

   @Override
   public void protected_() {
      this.byte_ = rba_3.case_(this.break_).nextInt(140);
      this.break_.sL();
   }
}
