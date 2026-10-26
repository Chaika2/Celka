package celestial;

import java.util.Random;

public class rSy_1 extends rSp_1 {
   private rjU_2 break_;

   @Override
   public void byte_() {
      this.break_ = null;
   }

   public rSy_1(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void class_() {
      rjU_2 var1 = this.class_.byte_(1.0F).protected_();
      var1.break_((float) (-Math.PI / 4));
      double var2 = this.class_.super_.rx();
      double var4 = this.class_.super_.byte_(0.5);
      double var6 = this.class_.super_.BO();

      for (int var8 = 0; var8 < 8; var8++) {
         Random var9 = this.class_.Sa();
         double var10 = var2 + var9.nextGaussian() / 2.0;
         double var12 = var4 + var9.nextGaussian() / 2.0;
         double var14 = var6 + var9.nextGaussian() / 2.0;
         rjU_2 var16 = this.class_.rv();
         ((rYB)this.class_.throws_[7])
            .class_(
               rLQ.implements_,
               var10,
               var12,
               var14,
               -var1.break_ * 0.08F + var16.break_,
               -var1.byte_ * 0.3F + var16.byte_,
               -var1.protected_ * 0.08F + var16.protected_
            );
         var1.break_((float) (Math.PI / 16));
      }
   }

   @Override
   public void break_() {
      if (this.break_ == null) {
         this.break_ = rjU_2.protected_(((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.class_));
      }

      if (this.break_.protected_(this.class_.rx(), this.class_.re(), this.class_.BO()) < 1.0) {
         this.class_.L().break_(rST.case_).private_();
         this.class_.L().class_(rST.catch_);
      }
   }

   @Override
   public float throws_() {
      return 1.5F;
   }

   @Override
   public rjU_2 case_() {
      return this.break_;
   }

   @Override
   public float implements_() {
      float var1 = rfU_2.class_(an_3.case_(this.class_.rv())) + 1.0F;
      float var2 = Math.min(var1, 40.0F);
      return var2 / var1;
   }

   @Override
   public rST<rSy_1> protected_() {
      return rST.protected_;
   }
}
