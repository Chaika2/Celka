package celestial;

public class nr_3 extends lO_2 {
   nr_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.class_(0.02F, 0.02F);
      this.throw_ = this.throw_ * (this.continue_.nextFloat() * 0.6F + 0.2F);
      this.finally_ = var8 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.extends_ = var10 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.native_ = var12 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.this_ = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
         this.extends_ += 0.002;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.85F;
         this.extends_ *= 0.85F;
         this.native_ *= 0.85F;
         if (!this.byte_.break_(new rfH_2(this.catch_, this.private_, this.implements_)).class_(rlG_2.break_)) {
            this.finally_();
         }
      }
   }
}
