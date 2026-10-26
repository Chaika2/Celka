package celestial;

public class Co_1 extends lO_2 {
   private final Ch_1 class_;
   private final double break_;

   protected Co_1(
      gm_3 var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      float var10,
      double var11,
      double var13,
      double var15,
      float var17,
      Ch_1 var18,
      float var19,
      int var20,
      double var21,
      boolean var23
   ) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.break_ = var21;
      this.class_ = var18;
      this.finally_ *= (double)var8;
      this.extends_ *= (double)var9;
      this.native_ *= (double)var10;
      this.finally_ += var11;
      this.extends_ += var13;
      this.native_ += var15;
      float var24 = var1.int_.nextFloat() * var19;
      this.synchronized_ = var24;
      this.return_ = var24;
      this.public_ = var24;
      this.throw_ *= 0.75F * var17;
      this.this_ = (int)((double)var20 / ((double)var1.int_.nextFloat() * 0.8 + 0.2));
      this.this_ = (int)((float)this.this_ * var17);
      this.this_ = Math.max(this.this_, 1);
      this.break_(var18);
      this.final_ = var23;
   }

   @Override
   public float class_(float var1) {
      return this.throw_ * rfU_2.class_(((float)this.super_ + var1) / (float)this.this_ * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public CJ class_() {
      return CJ.break_;
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
         this.extends_ = this.extends_ + this.break_;
         this.class_(this.finally_, this.extends_, this.native_);
         if (this.private_ == this.throws_) {
            this.finally_ *= 1.1;
            this.native_ *= 1.1;
         }

         this.finally_ *= 0.96F;
         this.extends_ *= 0.96F;
         this.native_ *= 0.96F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
