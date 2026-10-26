package celestial;

class rEp_1 extends rBk_1 {
   private final rEy_1 break_;
   public int class_;

   @Override
   public void byte_() {
      this.class_ = 0;
   }

   public rEp_1(rEy_1 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      return this.break_.I_() != null;
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.break_.I_();
      double var2 = 64.0;
      if (var1.int_(this.break_) < 4096.0 && this.break_.while_(var1)) {
         rYB var4 = (rYB)this.break_.throws_[7];
         this.class_++;
         if (this.class_ == 10 && !this.break_.BF()) {
            var4.class_((rhd_3)null, 1015, this.break_.Bs(), 0);
         }

         if (this.class_ == 20) {
            double var5 = 4.0;
            rjU_2 var7 = this.break_.break_(1.0F);
            double var8 = var1.rx() - (this.break_.rx() + var7.break_ * 4.0);
            double var10 = var1.byte_(0.5) - (0.5 + this.break_.byte_(0.5));
            double var12 = var1.BO() - (this.break_.BO() + var7.protected_ * 4.0);
            if (!this.break_.BF()) {
               var4.class_((rhd_3)null, 1016, this.break_.Bs(), 0);
            }

            rhH_2 var14 = new rhH_2(var4, this.break_, var8, var10, var12);
            var14.catch_ = this.break_.catch_();
            var14.new_(this.break_.rx() + var7.break_ * 4.0, this.break_.byte_(0.5) + 0.5, var14.BO() + var7.protected_ * 4.0);
            var4.a_(var14);
            this.class_ = -40;
         }
      } else if (this.class_ > 0) {
         this.class_--;
      }

      this.break_.this_(this.class_ > 10);
   }

   @Override
   public void protected_() {
      this.break_.this_(false);
   }
}
