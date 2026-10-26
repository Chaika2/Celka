package celestial;

class rOc_1 extends rBk_1 {
   private final rON class_;
   private final double break_;
   private boolean byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.class_.synchronized_(true);
      this.byte_ = false;
      this.protected_ = 0;
   }

   rOc_1(rON var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean class_() {
      if (this.class_.n_()) {
         return false;
      } else if (this.class_.L()) {
         return true;
      } else {
         return this.class_.Sa().nextInt(700) != 0 ? false : !this.class_.sx().class_(this.class_.Ps(), 64.0);
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.sx().class_(this.class_.Ps(), 7.0) && !this.byte_ && this.protected_ <= 600;
   }

   @Override
   public void throws_() {
      rfH_2 var1 = this.class_.sx();
      boolean var2 = var1.class_(this.class_.Ps(), 16.0);
      if (var2) {
         this.protected_++;
      }

      if (this.class_.public_().native_()) {
         rjU_2 var3 = rjU_2.protected_(var1);
         rjU_2 var4 = iX_2.class_(this.class_, 16, 3, var3, (float) (Math.PI / 10));
         if (var4 == null) {
            var4 = iX_2.break_(this.class_, 8, 7, var3);
         }

         if (var4 != null && !var2 && !((rYB)this.class_.throws_[7]).byte_(new rfH_2(var4)).class_(xu_3.try_)) {
            var4 = iX_2.break_(this.class_, 16, 5, var3);
         }

         if (var4 == null) {
            this.byte_ = true;
            return;
         }

         this.class_.public_().class_(var4.break_, var4.byte_, var4.protected_, this.break_);
      }
   }

   @Override
   public void protected_() {
      this.class_.synchronized_(false);
   }
}
