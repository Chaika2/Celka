package celestial;

class rbK_2 extends rPY {
   private final rbo_3 implements_;

   public rbK_2(rbo_3 var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      if (this.implements_.rT()) {
         this.implements_.byte_(this.implements_.rv().break_(0.0, 0.005, 0.0));
      }

      if (this.private_ == rPo_1.MOVE_TO && !this.implements_.public_().native_()) {
         double var1 = this.break_ - this.implements_.rx();
         double var3 = this.byte_ - this.implements_.re();
         double var5 = this.protected_ - this.implements_.BO();
         double var7 = var1 * var1 + var3 * var3 + var5 * var5;
         if (var7 < 2.5000003E-7F) {
            this.class_.catch_(0.0F);
         } else {
            float var9 = (float)(rfU_2.protected_(var5, var1) * 180.0F / (float)Math.PI) - 90.0F;
            rbo_3 var10000 = this.implements_;
            Float var18 = this.class_((Float)this.implements_.throws_[15], var9, 10.0F);
            var10000.throws_[15] = var18;
            var10000 = this.implements_;
            Float var19 = (Float)this.implements_.throws_[15];
            var10000.private_[23] = var19;
            var10000 = this.implements_;
            Float var20 = (Float)this.implements_.throws_[15];
            var10000.private_[25] = var20;
            float var10 = (float)(this.throws_ * this.implements_.class_(iQ_2.protected_));
            if (this.implements_.rT()) {
               this.implements_.super_(var10 * 0.02F);
               float var11 = -((float)(rfU_2.protected_(var3, (double)rfU_2.class_(var1 * var1 + var5 * var5)) * 180.0F / (float)Math.PI));
               var11 = rfU_2.class_(rfU_2.catch_(var11), -85.0F, 85.0F);
               var10000 = this.implements_;
               Float var21 = this.class_((Float)this.implements_.throws_[16], var11, 5.0F);
               var10000.throws_[16] = var21;
               float var12 = rfU_2.break_((Float)this.implements_.throws_[16] * (float) (Math.PI / 180.0));
               float var13 = rfU_2.class_((Float)this.implements_.throws_[16] * (float) (Math.PI / 180.0));
               var10000 = this.implements_;
               Float var22 = var12 * var10;
               var10000.private_[44] = var22;
               var10000 = this.implements_;
               Float var23 = -var13 * var10;
               var10000.private_[43] = var23;
            } else {
               this.implements_.super_(var10 * 0.1F);
            }
         }
      } else {
         this.implements_.super_(0.0F);
         this.implements_.try_(0.0F);
         this.implements_.while_(0.0F);
         this.implements_.catch_(0.0F);
      }
   }
}
