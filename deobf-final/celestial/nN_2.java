package celestial;

public class nN_2 extends lO_2 {
   private boolean class_;
   private final Ch_1 break_;

   nN_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6);
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.synchronized_ = rfU_2.class_(this.continue_, 0.7176471F, 0.8745098F);
      this.return_ = rfU_2.class_(this.continue_, 0.0F, 0.0F);
      this.public_ = rfU_2.class_(this.continue_, 0.8235294F, 0.9764706F);
      this.throw_ *= 0.75F;
      this.this_ = (int)(20.0 / ((double)this.continue_.nextFloat() * 0.8 + 0.2));
      this.class_ = false;
      this.final_ = false;
      this.break_ = var14;
      this.break_(var14);
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
         this.break_(this.break_);
         if (this.volatile_) {
            this.extends_ = 0.0;
            this.class_ = true;
         }

         if (this.class_) {
            this.extends_ += 0.002;
         }

         this.class_(this.finally_, this.extends_, this.native_);
         if (this.private_ == this.throws_) {
            this.finally_ *= 1.1;
            this.native_ *= 1.1;
         }

         this.finally_ *= 0.96F;
         this.native_ *= 0.96F;
         if (this.class_) {
            this.extends_ *= 0.96F;
         }
      }
   }
}
