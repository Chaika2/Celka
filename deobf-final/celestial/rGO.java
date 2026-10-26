package celestial;

class rGO extends rGb_1 {
   private float byte_;
   private float protected_;
   private float throws_;
   private float case_;

   @Override
   public void byte_() {
      this.protected_ = 5.0F + rGB.class_(this.break_).nextFloat() * 10.0F;
      this.throws_ = -4.0F + rGB.break_(this.break_).nextFloat() * 9.0F;
      this.case_ = rGB.byte_(this.break_).nextBoolean() ? 1.0F : -1.0F;
      this.private_();
   }

   rGO(rGB var1) {
      super(var1);
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      return this.break_.I_() == null || this.break_.super_ == rGS.CIRCLE;
   }

   @Override
   public void throws_() {
      if (rGB.protected_(this.break_).nextInt(350) == 0) {
         this.throws_ = -4.0F + rGB.throws_(this.break_).nextFloat() * 9.0F;
      }

      if (rGB.case_(this.break_).nextInt(250) == 0) {
         this.protected_++;
         if (this.protected_ > 15.0F) {
            this.protected_ = 5.0F;
            this.case_ = -this.case_;
         }
      }

      if (rGB.catch_(this.break_).nextInt(450) == 0) {
         this.byte_ = rGB.private_(this.break_).nextFloat() * 2.0F * (float) Math.PI;
         this.private_();
      }

      if (this.catch_()) {
         this.private_();
      }

      if (this.break_.break_.byte_ < this.break_.re() && !((rYB)this.break_.throws_[7]).finally_(this.break_.Bs().catch_(1))) {
         this.throws_ = Math.max(1.0F, this.throws_);
         this.private_();
      }

      if (this.break_.break_.byte_ > this.break_.re() && !((rYB)this.break_.throws_[7]).finally_(this.break_.Bs().break_(1))) {
         this.throws_ = Math.min(-1.0F, this.throws_);
         this.private_();
      }
   }

   private void private_() {
      if (rfH_2.protected_.equals(this.break_.protected_)) {
         this.break_.protected_ = this.break_.Bs();
      }

      this.byte_ = this.byte_ + this.case_ * 15.0F * (float) (Math.PI / 180.0);
      this.break_.break_ = rjU_2.byte_(this.break_.protected_)
         .break_((double)(this.protected_ * rfU_2.break_(this.byte_)), (double)(-4.0F + this.throws_), (double)(this.protected_ * rfU_2.class_(this.byte_)));
   }
}
