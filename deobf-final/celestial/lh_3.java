package celestial;

public class lh_3 extends CK {
   lh_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, var14, 0.0F);
      this.throw_ = 0.5F;
      this.throws_(1.0F);
      this.class_(0.0F, 0.0F, 0.0F);
      this.this_ = (int)((double)(this.throw_ * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.break_(var14);
      this.final_ = false;
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.case_(0.0F);
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.break_(this.class_);
         if (this.super_ > this.this_ / 2) {
            this.throws_(1.0F - ((float)this.super_ - (float)(this.this_ / 2)) / (float)this.this_);
         }

         this.class_(this.finally_, this.extends_, this.native_);
         if (this.byte_.byte_(new rfH_2(this.catch_, this.private_, this.implements_)).catch_()) {
            this.extends_ -= 0.008F;
         }

         this.finally_ *= 0.92F;
         this.extends_ *= 0.92F;
         this.native_ *= 0.92F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
