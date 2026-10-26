package celestial;

class rOu_1 extends rBp_1 {
   private final rON catch_;

   rOu_1(rON var1, double var2) {
      super(var1, var1.n_() ? 2.0 : var2, 24);
      this.catch_ = var1;
      this.case_ = -1;
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      return var1.byte_(var2).class_(xu_3.try_);
   }

   @Override
   public boolean class_() {
      if (this.catch_.n_() && !this.catch_.rT()) {
         return super.class_();
      } else {
         return !this.catch_.sc() && !this.catch_.rT() && !this.catch_.L() ? super.class_() : false;
      }
   }

   @Override
   public boolean break_() {
      return !this.catch_.rT() && this.protected_ <= 1200 && this.class_((rYB)this.catch_.throws_[7], this.throws_);
   }

   @Override
   public boolean extends_() {
      return this.protected_ % 160 == 0;
   }
}
