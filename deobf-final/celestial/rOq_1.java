package celestial;

class rOq_1 extends rPY {
   private final rOp_1 implements_;

   rOq_1(rOp_1 var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      if (this.implements_.class_(rlG_2.break_)) {
         this.implements_.byte_(this.implements_.rv().break_(0.0, 0.005, 0.0));
      }

      if (this.private_ == rPo_1.MOVE_TO && !this.implements_.public_().native_()) {
         float var1 = (float)(this.throws_ * this.implements_.class_(iQ_2.protected_));
         this.implements_.super_(rfU_2.catch_(0.125F, this.implements_.sB(), var1));
         double var2 = this.break_ - this.implements_.rx();
         double var4 = this.byte_ - this.implements_.re();
         double var6 = this.protected_ - this.implements_.BO();
         if (var4 != 0.0) {
            double var8 = (double)rfU_2.class_(var2 * var2 + var4 * var4 + var6 * var6);
            this.implements_.byte_(this.implements_.rv().break_(0.0, (double)this.implements_.sB() * (var4 / var8) * 0.1, 0.0));
         }

         if (var2 != 0.0 || var6 != 0.0) {
            float var16 = (float)(rfU_2.protected_(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
            rOp_1 var10000 = this.implements_;
            Float var14 = this.class_((Float)this.implements_.throws_[15], var16, 90.0F);
            var10000.throws_[15] = var14;
            var10000 = this.implements_;
            Float var15 = (Float)this.implements_.throws_[15];
            var10000.private_[23] = var15;
         }
      } else {
         this.implements_.super_(0.0F);
      }
   }
}
