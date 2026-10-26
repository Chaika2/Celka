package celestial;

import java.util.EnumSet;

class rbe_3 extends rBk_1 {
   private final rbo_3 class_;
   private final double break_;
   private rhd_3 byte_;

   @Override
   public void byte_() {
      this.byte_.break_(new rLY(rLD.interface_, 100));
   }

   rbe_3(rbo_3 var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      this.byte_ = ((rYB)this.class_.throws_[7]).class_(rbo_3.this_, this.class_);
      return this.byte_ == null ? false : this.byte_.Py() && this.class_.I_() != this.byte_;
   }

   @Override
   public boolean break_() {
      return this.byte_ != null && this.byte_.Py() && this.class_.int_(this.byte_) < 256.0;
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.byte_, (float)(this.class_.S() + 20), (float)this.class_.r());
      if (this.class_.int_(this.byte_) < 6.25) {
         this.class_.public_().final_();
      } else {
         this.class_.public_().class_(this.byte_, this.break_);
      }

      if (this.byte_.Py() && ((rYB)this.byte_.throws_[7]).int_.nextInt(6) == 0) {
         this.byte_.break_(new rLY(rLD.interface_, 100));
      }
   }

   @Override
   public void protected_() {
      this.byte_ = null;
      this.class_.public_().final_();
   }
}
