package celestial;

public class lA_2 extends lO_2 {
   private final Ch_1 class_;

   lA_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.class_ = var14;
      this.finally_ *= 0.3F;
      this.extends_ = Math.random() * 0.2F + 0.1F;
      this.native_ *= 0.3F;
      this.class_(0.01F, 0.01F);
      this.this_ = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.break_(var14);
      this.else_ = 0.0F;
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
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
      int var1 = 60 - this.this_;
      if (this.this_-- <= 0) {
         this.finally_();
      } else {
         this.extends_ = this.extends_ - (double)this.else_;
         this.class_(this.finally_, this.extends_, this.native_);
         this.finally_ *= 0.98F;
         this.extends_ *= 0.98F;
         this.native_ *= 0.98F;
         float var2 = (float)var1 * 0.001F;
         this.class_(var2, var2);
         this.class_(this.class_.class_(var1 % 4, 4));
      }
   }
}
