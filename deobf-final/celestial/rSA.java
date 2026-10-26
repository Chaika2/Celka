package celestial;

public class rSA extends rSw_1 {
   private int break_;
   private int byte_;
   private aZ_2 protected_;

   @Override
   public void byte_() {
      this.break_ = 0;
      this.byte_++;
   }

   public rSA(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void class_() {
      this.break_++;
      if (this.break_ % 2 == 0 && this.break_ < 10) {
         rjU_2 var1 = this.class_.byte_(1.0F).protected_();
         var1.break_((float) (-Math.PI / 4));
         double var2 = this.class_.super_.rx();
         double var4 = this.class_.super_.byte_(0.5);
         double var6 = this.class_.super_.BO();

         for (int var8 = 0; var8 < 8; var8++) {
            double var9 = var2 + this.class_.Sa().nextGaussian() / 2.0;
            double var11 = var4 + this.class_.Sa().nextGaussian() / 2.0;
            double var13 = var6 + this.class_.Sa().nextGaussian() / 2.0;

            for (int var15 = 0; var15 < 6; var15++) {
               ((rYB)this.class_.throws_[7])
                  .class_(
                     rLQ.implements_, var9, var11, var13, -var1.break_ * 0.08F * (double)var15, -var1.byte_ * 0.6F, -var1.protected_ * 0.08F * (double)var15
                  );
            }

            var1.break_((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void break_() {
      this.break_++;
      if (this.break_ >= 200) {
         if (this.byte_ >= 4) {
            this.class_.L().class_(rST.throws_);
         } else {
            this.class_.L().class_(rST.catch_);
         }
      } else if (this.break_ == 10) {
         rjU_2 var1 = new rjU_2(this.class_.super_.rx() - this.class_.rx(), 0.0, this.class_.super_.BO() - this.class_.BO()).protected_();
         float var2 = 5.0F;
         double var3 = this.class_.super_.rx() + var1.break_ * 5.0 / 2.0;
         double var5 = this.class_.super_.BO() + var1.protected_ * 5.0 / 2.0;
         double var7 = this.class_.super_.byte_(0.5);
         double var9 = var7;
         rfw_3 var11 = new rfw_3(var3, var7, var5);

         while (((rYB)this.class_.throws_[7]).finally_(var11)) {
            if (--var9 < 0.0) {
               var9 = var7;
               break;
            }

            var11.break_(var3, var9, var5);
         }

         var9 = (double)(rfU_2.byte_(var9) + 1);
         this.protected_ = new aZ_2((rYB)this.class_.throws_[7], var3, var9, var5);
         this.protected_.class_(this.class_);
         this.protected_.byte_(5.0F);
         this.protected_.break_(200);
         this.protected_.class_(rLQ.implements_);
         this.protected_.class_(new rLY(rLD.catch_));
         ((rYB)this.class_.throws_[7]).a_(this.protected_);
      }
   }

   @Override
   public void catch_() {
      if (this.protected_ != null) {
         this.protected_.PD();
         this.protected_ = null;
      }
   }

   @Override
   public rST<rSA> protected_() {
      return rST.case_;
   }

   public void private_() {
      this.byte_ = 0;
   }
}
