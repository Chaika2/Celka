package celestial;

public class nh_3 extends lO_2 {
   nh_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.finally_ *= 0.1F;
      this.extends_ *= 0.1F;
      this.native_ *= 0.1F;
      this.finally_ += var8 * 0.4;
      this.extends_ += var10 * 0.4;
      this.native_ += var12 * 0.4;
      float var14 = (float)(Math.random() * 0.3F + 0.6F);
      this.synchronized_ = var14;
      this.return_ = var14;
      this.public_ = var14;
      this.throw_ *= 0.75F;
      this.this_ = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
      this.final_ = false;
      this.case_();
   }

   @Override
   public CJ class_() {
      return CJ.break_;
   }

   @Override
   public float class_(float var1) {
      return this.throw_ * rfU_2.class_(((float)this.super_ + var1) / (float)this.this_ * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.class_(this.finally_, this.extends_, this.native_);
         this.return_ = (float)((double)this.return_ * 0.96);
         this.public_ = (float)((double)this.public_ * 0.9);
         this.finally_ *= 0.7F;
         this.extends_ *= 0.7F;
         this.native_ *= 0.7F;
         this.extends_ -= 0.02F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
