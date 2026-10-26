package celestial;

public abstract class nW_2 extends lO_2 {
   protected nW_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.finally_ = this.finally_ * 0.01F + var8;
      this.extends_ = this.extends_ * 0.01F + var10;
      this.native_ = this.native_ * 0.01F + var12;
      this.catch_ = this.catch_ + (double)((this.continue_.nextFloat() - this.continue_.nextFloat()) * 0.05F);
      this.private_ = this.private_ + (double)((this.continue_.nextFloat() - this.continue_.nextFloat()) * 0.05F);
      this.implements_ = this.implements_ + (double)((this.continue_.nextFloat() - this.continue_.nextFloat()) * 0.05F);
      this.this_ = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
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
