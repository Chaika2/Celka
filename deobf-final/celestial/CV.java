package celestial;

public class CV extends lO_2 {
   private final Ch_1 class_;

   CV(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, rLc_1 var14, Ch_1 var15) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.class_ = var15;
      this.finally_ *= 0.1F;
      this.extends_ *= 0.1F;
      this.native_ *= 0.1F;
      float var16 = (float)Math.random() * 0.4F + 0.6F;
      this.synchronized_ = ((float)(Math.random() * 0.2F) + 0.8F) * var14.class_() * var16;
      this.return_ = ((float)(Math.random() * 0.2F) + 0.8F) * var14.break_() * var16;
      this.public_ = ((float)(Math.random() * 0.2F) + 0.8F) * var14.throws_() * var16;
      this.throw_ = this.throw_ * 0.75F * var14.case_();
      int var17 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.this_ = (int)Math.max((float)var17 * var14.case_(), 1.0F);
      this.break_(var15);
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
