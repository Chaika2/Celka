package celestial;

class rOv_1 extends rPY {
   private final rON implements_;

   rOv_1(rON var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      this.catch_();
      if (this.private_ == rPo_1.MOVE_TO && !this.implements_.public_().native_()) {
         double var1 = this.break_ - this.implements_.rx();
         double var3 = this.byte_ - this.implements_.re();
         double var5 = this.protected_ - this.implements_.BO();
         double var7 = (double)rfU_2.class_(var1 * var1 + var3 * var3 + var5 * var5);
         var3 /= var7;
         float var9 = (float)(rfU_2.protected_(var5, var1) * 180.0F / (float)Math.PI) - 90.0F;
         rON var10000 = this.implements_;
         Float var15 = this.class_((Float)this.implements_.throws_[15], var9, 90.0F);
         var10000.throws_[15] = var15;
         var10000 = this.implements_;
         Float var16 = (Float)this.implements_.throws_[15];
         var10000.private_[23] = var16;
         float var10 = (float)(this.throws_ * this.implements_.class_(iQ_2.protected_));
         this.implements_.super_(rfU_2.catch_(0.125F, this.implements_.sB(), var10));
         this.implements_.byte_(this.implements_.rv().break_(0.0, (double)this.implements_.sB() * var3 * 0.1, 0.0));
      } else {
         this.implements_.super_(0.0F);
      }
   }

   private void catch_() {
      if (this.implements_.rT()) {
         this.implements_.byte_(this.implements_.rv().break_(0.0, 0.005, 0.0));
         if (!this.implements_.sx().class_(this.implements_.Ps(), 16.0)) {
            this.implements_.super_(Math.max(this.implements_.sB() / 2.0F, 0.08F));
         }

         if (this.implements_.n_()) {
            this.implements_.super_(Math.max(this.implements_.sB() / 3.0F, 0.06F));
         }
      } else if (rON.break_(this.implements_)) {
         this.implements_.super_(Math.max(this.implements_.sB() / 2.0F, 0.06F));
      }
   }
}
