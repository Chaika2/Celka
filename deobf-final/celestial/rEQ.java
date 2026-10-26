package celestial;

class rEQ extends rBk_1 {
   private final rEx_1 class_;
   private final double break_;
   private final int byte_;
   private boolean protected_;

   @Override
   public void byte_() {
      this.class_.this_(true);
      this.protected_ = false;
   }

   public rEQ(rEx_1 var1, double var2, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
   }

   @Override
   public boolean class_() {
      return !((rYB)this.class_.throws_[7]).strictfp_() && this.class_.rT() && this.class_.re() < (double)(this.byte_ - 2);
   }

   @Override
   public boolean break_() {
      return this.class_() && !this.protected_;
   }

   @Override
   public void throws_() {
      if (this.class_.re() < (double)(this.byte_ - 1) && (this.class_.public_().native_() || this.class_.sk())) {
         rjU_2 var1 = iX_2.break_(this.class_, 4, 8, new rjU_2(this.class_.rx(), (double)(this.byte_ - 1), this.class_.BO()));
         if (var1 == null) {
            this.protected_ = true;
            return;
         }

         this.class_.public_().class_(var1.break_, var1.byte_, var1.protected_, this.break_);
      }
   }

   @Override
   public void protected_() {
      this.class_.this_(false);
   }
}
