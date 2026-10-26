package celestial;

public class nd_3 extends lO_2 {
   private float class_;

   nd_3(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.this_ = (int)(Math.random() * 60.0) + 30;
      this.final_ = false;
      this.finally_ = 0.0;
      this.extends_ = -0.05;
      this.native_ = 0.0;
      this.class_(0.02F, 0.02F);
      this.throw_ = this.throw_ * (this.continue_.nextFloat() * 0.6F + 0.2F);
      this.else_ = 0.002F;
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
         float var1 = 0.6F;
         this.finally_ = this.finally_ + (double)(0.6F * rfU_2.break_(this.class_));
         this.native_ = this.native_ + (double)(0.6F * rfU_2.class_(this.class_));
         this.finally_ *= 0.07;
         this.native_ *= 0.07;
         this.class_(this.finally_, this.extends_, this.native_);
         if (!this.byte_.break_(new rfH_2(this.catch_, this.private_, this.implements_)).class_(rlG_2.break_) || this.volatile_) {
            this.finally_();
         }

         this.class_ = (float)((double)this.class_ + 0.08);
      }
   }
}
