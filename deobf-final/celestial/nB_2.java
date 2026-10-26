package celestial;

public class nB_2 extends lO_2 {
   private final Ch_1 class_;

   nB_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6);
      this.class_ = var14;
      this.this_ = 4;
      this.else_ = 0.008F;
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.break_(var14);
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
         this.extends_ = this.extends_ - (double)this.else_;
         this.class_(this.finally_, this.extends_, this.native_);
         this.break_(this.class_);
      }
   }
}
