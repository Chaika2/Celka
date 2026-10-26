package celestial;

class rOz_1 extends rBp_1 {
   private final rOk_1 catch_;

   rOz_1(rOk_1 var1, double var2) {
      super(var1, var2, 8, 2);
      this.catch_ = var1;
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      return var1.byte_(var2).class_(xu_3.instanceof_) && var1.byte_(var2.final_()).class_(var1, var2, rLT.LAND);
   }

   @Override
   public boolean class_() {
      return !this.catch_.ry() && super.class_();
   }

   @Override
   public boolean break_() {
      return !this.catch_.ry() && this.class_((rYB)this.catch_.throws_[7], this.throws_);
   }

   @Override
   public rfH_2 finally_() {
      return this.throws_;
   }

   @Override
   public boolean extends_() {
      return this.protected_ % 20 == 0;
   }
}
