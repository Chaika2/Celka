package celestial;

class rOm_1 extends rBp_1 {
   private final rON catch_;

   rOm_1(rON var1, double var2) {
      super(var1, var2, 16);
      this.catch_ = var1;
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      return !var1.finally_(var2.final_()) ? false : zH_2.break_(var1, var2);
   }

   @Override
   public boolean class_() {
      return this.catch_.L() && this.catch_.sx().class_(this.catch_.Ps(), 9.0) ? super.class_() : false;
   }

   @Override
   public boolean break_() {
      return super.break_() && this.catch_.L() && this.catch_.sx().class_(this.catch_.Ps(), 9.0);
   }

   @Override
   public void throws_() {
      super.throws_();
      rfH_2 var1 = this.catch_.Bs();
      if (!this.catch_.rT() && this.native_()) {
         if (this.catch_.while_ < 1) {
            this.catch_.else_(true);
         } else if (this.catch_.while_ > 200) {
            rYB var2 = (rYB)this.catch_.throws_[7];
            var2.class_((rhd_3)null, var1, rqn_3.dp, rqL_2.BLOCKS, 0.3F, 0.9F + var2.int_.nextFloat() * 0.2F);
            var2.class_(this.throws_.final_(), xu_3.OX.continue_().class_(zH_2.final_, Integer.valueOf(rON.class_(this.catch_).nextInt(4) + 1)), 3);
            this.catch_.this_(false);
            this.catch_.else_(false);
            this.catch_.this_(600);
         }

         if (this.catch_.n()) {
            this.catch_.while_++;
         }
      }
   }
}
