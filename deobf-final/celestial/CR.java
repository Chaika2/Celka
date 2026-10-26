package celestial;

public class CR extends Cw_1 {
   CR(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.throw_ = (float)((double)this.throw_ * 1.5);
      this.this_ = (int)(Math.random() * 2.0) + 60;
   }

   @Override
   public float class_(float var1) {
      float var2 = 1.0F - ((float)this.super_ + var1) / ((float)this.this_ * 1.5F);
      return this.throw_ * var2;
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         float var1 = (float)this.super_ / (float)this.this_;
         this.catch_ = this.catch_ + this.finally_ * (double)var1;
         this.private_ = this.private_ + this.extends_ * (double)var1;
         this.implements_ = this.implements_ + this.native_ * (double)var1;
      }
   }
}
