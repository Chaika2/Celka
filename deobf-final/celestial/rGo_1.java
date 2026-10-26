package celestial;

class rGo_1 extends rPY {
   public rGo_1(rGg_1 var1, rGg_1 var2) {
      super(var2);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      if (this.private_ == rPo_1.MOVE_TO) {
         rjU_2 var1 = new rjU_2(this.break_ - this.implements_.rx(), this.byte_ - this.implements_.re(), this.protected_ - this.implements_.BO());
         double var2 = var1.case_();
         if (var2 < this.implements_.rN().class_()) {
            this.private_ = rPo_1.WAIT;
            this.implements_.byte_(this.implements_.rv().class_(0.5));
         } else {
            this.implements_.byte_(this.implements_.rv().throws_(var1.class_(this.throws_ * 0.05 / var2)));
            if (this.implements_.I_() == null) {
               rjU_2 var4 = this.implements_.rv();
               rGg_1 var10000 = this.implements_;
               Float var12 = -((float)rfU_2.protected_(var4.break_, var4.protected_)) * (180.0F / (float)Math.PI);
               var10000.throws_[15] = var12;
               var10000 = this.implements_;
               Float var13 = (Float)this.implements_.throws_[15];
               var10000.private_[23] = var13;
            } else {
               double var16 = this.implements_.I_().rx() - this.implements_.rx();
               double var6 = this.implements_.I_().BO() - this.implements_.BO();
               rGg_1 var18 = this.implements_;
               Float var14 = -((float)rfU_2.protected_(var16, var6)) * (180.0F / (float)Math.PI);
               var18.throws_[15] = var14;
               var18 = this.implements_;
               Float var15 = (Float)this.implements_.throws_[15];
               var18.private_[23] = var15;
            }
         }
      }
   }
}
