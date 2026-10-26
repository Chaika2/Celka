package celestial;

class rEz_1 extends rPY {
   private final rEx_1 implements_;

   public rEz_1(rEx_1 var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      iB_2 var1 = this.implements_.I_();
      if (this.implements_.su() && this.implements_.rT()) {
         if (var1 != null && var1.re() > this.implements_.re() || this.implements_.protected_) {
            this.implements_.byte_(this.implements_.rv().break_(0.0, 0.002, 0.0));
         }

         if (this.private_ != rPo_1.MOVE_TO || this.implements_.public_().native_()) {
            this.implements_.super_(0.0F);
            return;
         }

         double var2 = this.break_ - this.implements_.rx();
         double var4 = this.byte_ - this.implements_.re();
         double var6 = this.protected_ - this.implements_.BO();
         double var8 = (double)rfU_2.class_(var2 * var2 + var4 * var4 + var6 * var6);
         var4 /= var8;
         float var10 = (float)(rfU_2.protected_(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
         rEx_1 var10000 = this.implements_;
         Float var17 = this.class_((Float)this.implements_.throws_[15], var10, 90.0F);
         var10000.throws_[15] = var17;
         var10000 = this.implements_;
         Float var18 = (Float)this.implements_.throws_[15];
         var10000.private_[23] = var18;
         float var11 = (float)(this.throws_ * this.implements_.class_(iQ_2.protected_));
         float var12 = rfU_2.catch_(0.125F, this.implements_.sB(), var11);
         this.implements_.super_(var12);
         this.implements_.byte_(this.implements_.rv().break_((double)var12 * var2 * 0.005, (double)var12 * var4 * 0.1, (double)var12 * var6 * 0.005));
      } else {
         if (!rEx_1.class_(this.implements_)) {
            this.implements_.byte_(this.implements_.rv().break_(0.0, -0.008, 0.0));
         }

         super.class_();
      }
   }
}
