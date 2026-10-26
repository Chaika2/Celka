package celestial;

public class CC extends lO_2 {
   CC(gm_3 var1, double var2, double var4, double var6, double var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.finally_ *= 0.01F;
      this.extends_ *= 0.01F;
      this.native_ *= 0.01F;
      this.extends_ += 0.2;
      this.synchronized_ = Math.max(0.0F, rfU_2.class_(((float)var8 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.return_ = Math.max(0.0F, rfU_2.class_(((float)var8 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.public_ = Math.max(0.0F, rfU_2.class_(((float)var8 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.throw_ *= 1.5F;
      this.this_ = 6;
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
         this.class_(this.finally_, this.extends_, this.native_);
         if (this.private_ == this.throws_) {
            this.finally_ *= 1.1;
            this.native_ *= 1.1;
         }

         this.finally_ *= 0.66F;
         this.extends_ *= 0.66F;
         this.native_ *= 0.66F;
         if (this.volatile_) {
            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }
      }
   }
}
