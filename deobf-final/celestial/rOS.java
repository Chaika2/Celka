package celestial;

class rOS extends rPY {
   private final rMi_1 implements_;
   private double finally_;

   public rOS(rMi_1 var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      if (rMi_1.class_(this.implements_) && !rMi_1.break_(this.implements_) && !((rOB)rMi_1.byte_(this.implements_)).byte_()) {
         this.implements_.implements_(0.0);
      } else if (this.break_()) {
         this.implements_.implements_(this.finally_);
      }

      super.class_();
   }

   @Override
   public void class_(double var1, double var3, double var5, double var7) {
      if (this.implements_.rT()) {
         var7 = 1.5;
      }

      super.class_(var1, var3, var5, var7);
      if (var7 > 0.0) {
         this.finally_ = var7;
      }
   }
}
