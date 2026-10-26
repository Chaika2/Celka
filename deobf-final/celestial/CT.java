package celestial;

public class CT extends lO_2 {
   private final Ch_1 class_;

   protected CT(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6);
      this.class_ = var14;
      this.finally_ = var8 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.extends_ = var10 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.native_ = var12 + (Math.random() * 2.0 - 1.0) * 0.05F;
      float var15 = this.continue_.nextFloat() * 0.3F + 0.7F;
      this.synchronized_ = var15;
      this.return_ = var15;
      this.public_ = var15;
      this.throw_ = 0.1F * (this.continue_.nextFloat() * this.continue_.nextFloat() * 6.0F + 1.0F);
      this.this_ = (int)(16.0 / ((double)this.continue_.nextFloat() * 0.8 + 0.2)) + 2;
      this.break_(var14);
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
         this.extends_ += 0.004;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.9F;
         this.extends_ *= 0.9F;
         this.native_ *= 0.9F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
