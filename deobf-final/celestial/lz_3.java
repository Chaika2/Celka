package celestial;

public class lz_3 extends lO_2 {
   private final Ch_1 class_;

   lz_3(gm_3 var1, double var2, double var4, double var6, double var8, Ch_1 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.class_ = var10;
      this.this_ = 4;
      float var11 = this.continue_.nextFloat() * 0.6F + 0.4F;
      this.synchronized_ = var11;
      this.return_ = var11;
      this.public_ = var11;
      this.throw_ = 1.0F - (float)var8 * 0.5F;
      this.break_(var10);
   }

   @Override
   public CJ class_() {
      return CJ.protected_;
   }

   @Override
   public int break_(float var1) {
      return 15728880;
   }

   @Override
   public void case_() {
      this.protected_ = this.catch_;
      this.throws_ = this.private_;
      this.case_ = this.implements_;
      if (this.super_++ >= this.this_) {
         this.finally_();
      } else {
         this.break_(this.class_);
      }
   }
}
