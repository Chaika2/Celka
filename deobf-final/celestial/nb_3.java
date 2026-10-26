package celestial;

public class nb_3 extends lO_2 {
   private final Ch_1 class_;

   nb_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.class_ = var14;
      float var15 = 2.5F;
      this.finally_ *= 0.1F;
      this.extends_ *= 0.1F;
      this.native_ *= 0.1F;
      this.finally_ += var8;
      this.extends_ += var10;
      this.native_ += var12;
      float var16 = 1.0F - (float)(Math.random() * 0.3F);
      this.synchronized_ = var16;
      this.return_ = var16;
      this.public_ = var16;
      this.throw_ *= 1.875F;
      int var17 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
      this.this_ = (int)Math.max((float)var17 * 2.5F, 1.0F);
      this.final_ = false;
      this.break_(var14);
   }

   @Override
   public float class_(float var1) {
      return this.throw_ * rfU_2.class_(((float)this.super_ + var1) / (float)this.this_ * 32.0F, 0.0F, 1.0F);
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
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.break_(this.class_);
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.96F;
         this.extends_ *= 0.96F;
         this.native_ *= 0.96F;
         rhd_3 var1 = this.byte_.class_(this.catch_, this.private_, this.implements_, 2.0, false);
         if (var1 != null) {
            double var2 = var1.re();
            if (this.private_ > var2) {
               this.private_ = this.private_ + (var2 - this.private_) * 0.2;
               this.extends_ = this.extends_ + (var1.rv().byte_ - this.extends_) * 0.2;
               this.break_(this.catch_, this.private_, this.implements_);
            }
         }

         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
