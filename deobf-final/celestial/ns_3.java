package celestial;

public class ns_3 extends lO_2 {
   ns_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, boolean var14) {
      super(var1, var2, var4, var6);
      this.protected_(3.0F);
      this.class_(0.25F, 0.25F);
      if (var14) {
         this.this_ = this.continue_.nextInt(50) + 280;
      } else {
         this.this_ = this.continue_.nextInt(50) + 80;
      }

      this.else_ = 3.0E-6F;
      this.finally_ = var8;
      this.extends_ = var10 + (double)(this.continue_.nextFloat() / 500.0F);
      this.native_ = var12;
   }

   @Override
   public CJ class_() {
      return CJ.byte_;
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ < this.this_ && !(this.goto_ <= 0.0F)) {
         this.finally_ = this.finally_ + (double)(this.continue_.nextFloat() / 5000.0F * (float)(this.continue_.nextBoolean() ? 1 : -1));
         this.native_ = this.native_ + (double)(this.continue_.nextFloat() / 5000.0F * (float)(this.continue_.nextBoolean() ? 1 : -1));
         this.extends_ = this.extends_ - (double)this.else_;
         this.class_(this.finally_, this.extends_, this.native_);
         if (this.super_ >= this.this_ - 60 && this.goto_ > 0.01F) {
            this.goto_ -= 0.015F;
         }
      } else {
         this.finally_();
      }
   }
}
