package celestial;

class rEk_1 extends rBp_1 {
   private final rEx_1 catch_;

   @Override
   public void byte_() {
      this.catch_.this_(false);
      rEx_1.class_(this.catch_, this.catch_.break_);
      super.byte_();
   }

   public rEk_1(rEx_1 var1, double var2) {
      super(var1, var2, 8, 2);
      this.catch_ = var1;
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.final_();
      return var1.finally_(var3) && var1.finally_(var3.final_()) ? var1.byte_(var2).class_(var1, var2, this.catch_) : false;
   }

   @Override
   public boolean class_() {
      return super.class_()
         && !((rYB)this.catch_.throws_[7]).strictfp_()
         && this.catch_.rT()
         && this.catch_.re() >= (double)(((rYB)this.catch_.throws_[7]).short_() - 3);
   }

   @Override
   public boolean break_() {
      return super.break_();
   }

   @Override
   public void protected_() {
      super.protected_();
   }
}
