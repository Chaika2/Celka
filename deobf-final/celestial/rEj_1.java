package celestial;

class rEj_1 extends rPY {
   private final rEI implements_;

   public rEj_1(rEI var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      if (this.private_ == rPo_1.MOVE_TO && !this.implements_.public_().native_()) {
         rjU_2 var1 = new rjU_2(this.break_ - this.implements_.rx(), this.byte_ - this.implements_.re(), this.protected_ - this.implements_.BO());
         double var2 = var1.case_();
         double var4 = var1.break_ / var2;
         double var6 = var1.byte_ / var2;
         double var8 = var1.protected_ / var2;
         float var10 = (float)(rfU_2.protected_(var1.protected_, var1.break_) * 180.0F / (float)Math.PI) - 90.0F;
         rEI var10000 = this.implements_;
         Float var38 = this.class_((Float)this.implements_.throws_[15], var10, 90.0F);
         var10000.throws_[15] = var38;
         var10000 = this.implements_;
         Float var39 = (Float)this.implements_.throws_[15];
         var10000.private_[23] = var39;
         float var11 = (float)(this.throws_ * this.implements_.class_(iQ_2.protected_));
         float var12 = rfU_2.catch_(0.125F, this.implements_.sB(), var11);
         this.implements_.super_(var12);
         double var13 = Math.sin((double)((Integer)this.implements_.throws_[41] + this.implements_.V()) * 0.5) * 0.05;
         double var15 = Math.cos((double)((Float)this.implements_.throws_[15] * (float) (Math.PI / 180.0)));
         double var17 = Math.sin((double)((Float)this.implements_.throws_[15] * (float) (Math.PI / 180.0)));
         double var19 = Math.sin((double)((Integer)this.implements_.throws_[41] + this.implements_.V()) * 0.75) * 0.05;
         this.implements_.byte_(this.implements_.rv().break_(var13 * var15, var19 * (var17 + var15) * 0.25 + (double)var12 * var6 * 0.1, var13 * var17));
         rPR var21 = this.implements_.continue_();
         double var22 = this.implements_.rx() + var4 * 2.0;
         double var24 = this.implements_.rH() + var6 / var2;
         double var26 = this.implements_.BO() + var8 * 2.0;
         double var28 = var21.protected_();
         double var30 = var21.throws_();
         double var32 = var21.case_();
         if (!var21.byte_()) {
            var28 = var22;
            var30 = var24;
            var32 = var26;
         }

         this.implements_
            .continue_()
            .class_(rfU_2.protected_(0.125, var28, var22), rfU_2.protected_(0.125, var30, var24), rfU_2.protected_(0.125, var32, var26), 10.0F, 40.0F);
         this.implements_.this_(true);
      } else {
         this.implements_.super_(0.0F);
         this.implements_.this_(false);
      }
   }
}
