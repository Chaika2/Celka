package celestial;

public class Cv_1 extends lO_2 {
   Cv_1(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.finally_ *= 0.8F;
      this.extends_ *= 0.8F;
      this.native_ *= 0.8F;
      this.extends_ = (double)(this.continue_.nextFloat() * 0.4F + 0.05F);
      this.throw_ = this.throw_ * (this.continue_.nextFloat() * 2.0F + 0.2F);
      this.this_ = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public CJ class_() {
      return CJ.break_;
   }

   @Override
   public float class_(float var1) {
      float var2 = ((float)this.super_ + var1) / (float)this.this_;
      return this.throw_ * (1.0F - var2 * var2);
   }

   @Override
   public int break_(float var1) {
      int var2 = super.break_(var1);
      short var3 = 240;
      int var4 = var2 >> 16 & 0xFF;
      return 240 | var4 << 16;
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      float var1 = (float)this.super_ / (float)this.this_;
      if (this.continue_.nextFloat() > var1) {
         this.byte_.class_(rLQ.double_, this.catch_, this.private_, this.implements_, this.finally_, this.extends_, this.native_);
      }

      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.extends_ -= 0.03;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.999F;
         this.extends_ *= 0.999F;
         this.native_ *= 0.999F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
