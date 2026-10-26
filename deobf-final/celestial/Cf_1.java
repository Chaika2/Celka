package celestial;

public class Cf_1 extends lO_2 {
   protected Cf_1(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.finally_ *= 0.3F;
      this.extends_ = Math.random() * 0.2F + 0.1F;
      this.native_ *= 0.3F;
      this.class_(0.01F, 0.01F);
      this.else_ = 0.06F;
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
         this.extends_ = this.extends_ - (double)this.else_;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.98F;
         this.extends_ *= 0.98F;
         this.native_ *= 0.98F;
         if (this.volatile_) {
            if (Math.random() < 0.5) {
               this.finally_();
            }

            this.finally_ *= 0.7F;
            this.native_ *= 0.7F;
         }

         rfH_2 var1 = new rfH_2(this.catch_, this.private_, this.implements_);
         double var2 = Math.max(
            this.byte_.byte_(var1).extends_(this.byte_, var1).class_(rpB_2.Y, this.catch_ - (double)var1.b_(), this.implements_ - (double)var1.d_()),
            (double)this.byte_.break_(var1).class_((rRq_1)this.byte_, var1)
         );
         if (var2 > 0.0 && this.private_ < (double)var1.c_() + var2) {
            this.finally_();
         }
      }
   }
}
