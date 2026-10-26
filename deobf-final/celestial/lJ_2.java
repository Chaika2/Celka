package celestial;

public class lJ_2 extends lO_2 {
   lJ_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.continue_.nextFloat() * 0.1F + 0.2F;
      this.synchronized_ = var14;
      this.return_ = var14;
      this.public_ = var14;
      this.class_(0.02F, 0.02F);
      this.throw_ = this.throw_ * (this.continue_.nextFloat() * 0.6F + 0.5F);
      this.finally_ *= 0.02F;
      this.extends_ *= 0.02F;
      this.native_ *= 0.02F;
      this.this_ = (int)(20.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void class_(double var1, double var3, double var5) {
      this.class_(this.volatile_().protected_(var1, var3, var5));
      this.extends_();
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
      if (this.this_-- <= 0) {
         this.finally_();
      } else {
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.99;
         this.extends_ *= 0.99;
         this.native_ *= 0.99;
      }
   }
}
