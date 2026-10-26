package celestial;

public class nu_3 extends lO_2 {
   private final rXs_1 break_;
   protected boolean class_;

   nu_3(gm_3 var1, double var2, double var4, double var6, rXs_1 var8) {
      super(var1, var2, var4, var6);
      this.class_(0.01F, 0.01F);
      this.else_ = 0.06F;
      this.break_ = var8;
   }

   @Override
   public CJ class_() {
      return CJ.break_;
   }

   @Override
   public int break_(float var1) {
      return this.class_ ? 240 : super.break_(var1);
   }

   protected void catch_() {
      if (this.this_-- <= 0) {
         this.finally_();
      }
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      this.catch_();
      if (!this.package_) {
         this.extends_ = this.extends_ - (double)this.else_;
         this.class_(this.finally_, this.extends_, this.native_);
         this.private_();
         if (!this.package_) {
            this.finally_ *= 0.98F;
            this.extends_ *= 0.98F;
            this.native_ *= 0.98F;
            rfH_2 var1 = new rfH_2(this.catch_, this.private_, this.implements_);
            rXE var2 = this.byte_.break_(var1);
            if (var2.class_() == this.break_ && this.private_ < (double)((float)var1.c_() + var2.class_((rRq_1)this.byte_, var1))) {
               this.finally_();
            }
         }
      }
   }

   protected void private_() {
   }
}
