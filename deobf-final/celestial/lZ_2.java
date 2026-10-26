package celestial;

public class lZ_2 extends lO_2 {
   lZ_2(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4 - 0.125, var6);
      this.synchronized_ = 0.4F;
      this.return_ = 0.4F;
      this.public_ = 0.7F;
      this.class_(0.01F, 0.01F);
      this.throw_ = this.throw_ * (this.continue_.nextFloat() * 0.6F + 0.2F);
      this.this_ = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.final_ = false;
   }

   lZ_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125, var6, var8, var10, var12);
      this.class_(0.01F, 0.01F);
      this.throw_ = this.throw_ * (this.continue_.nextFloat() * 0.6F + 0.6F);
      this.this_ = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.final_ = false;
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
      }
   }
}
