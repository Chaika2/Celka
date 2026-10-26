package celestial;

public class nK_2 extends lO_2 {
   private final float class_;
   private final Ch_1 break_;

   nK_2(gm_3 var1, double var2, double var4, double var6, float var8, float var9, float var10, Ch_1 var11) {
      super(var1, var2, var4, var6);
      this.break_ = var11;
      this.synchronized_ = var8;
      this.return_ = var9;
      this.public_ = var10;
      float var12 = 0.9F;
      this.throw_ *= 0.67499995F;
      int var13 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
      this.this_ = (int)Math.max((float)var13 * 0.9F, 1.0F);
      this.break_(var11);
      this.class_ = ((float)Math.random() - 0.5F) * 0.1F;
      this.while_ = (float)Math.random() * (float) (Math.PI * 2);
   }

   @Override
   public float class_(float var1) {
      return this.throw_ * rfU_2.class_(((float)this.super_ + var1) / (float)this.this_ * 32.0F, 0.0F, 1.0F);
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
         this.break_(this.break_);
         this.try_ = this.while_;
         this.while_ = this.while_ + (float) Math.PI * this.class_ * 2.0F;
         if (this.volatile_) {
            this.try_ = this.while_ = 0.0F;
         }

         this.class_(this.finally_, this.extends_, this.native_);
         this.extends_ -= 0.003F;
         this.extends_ = Math.max(this.extends_, -0.14F);
      }
   }
}
