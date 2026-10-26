package celestial;

public class nz_3 extends lO_2 {
   private final xc_3 class_;
   private rfH_2 break_;
   private final float interface_;
   private final float char_;

   @Override
   protected float byte_() {
      return this.instanceof_.class_((double)(this.interface_ / 4.0F * 16.0F));
   }

   public nz_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, xc_3 var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.class_ = var14;
      this.class_(QY.instanceof_().synchronized_().break_().class_(var14));
      this.else_ = 1.0F;
      this.synchronized_ = 0.6F;
      this.return_ = 0.6F;
      this.public_ = 0.6F;
      this.throw_ /= 2.0F;
      this.interface_ = this.continue_.nextFloat() * 3.0F;
      this.char_ = this.continue_.nextFloat() * 3.0F;
   }

   @Override
   public CJ class_() {
      return CJ.class_;
   }

   public nz_3 class_(rfH_2 var1) {
      this.break_ = var1;
      if (this.class_.class_(xu_3.implements_)) {
         return this;
      } else {
         this.break_(var1);
         return this;
      }
   }

   @Override
   protected float break_() {
      return this.instanceof_.class_((double)((this.interface_ + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public int break_(float var1) {
      int var2 = super.break_(var1);
      int var3 = 0;
      if (this.byte_.int_(this.break_)) {
         var3 = yX_2.class_(this.byte_, this.break_);
      }

      return var2 == 0 ? var3 : var2;
   }

   protected void break_(rfH_2 var1) {
      int var2 = QY.instanceof_().s().class_(this.class_, this.byte_, var1, 0);
      this.synchronized_ *= (float)(var2 >> 16 & 0xFF) / 255.0F;
      this.return_ *= (float)(var2 >> 8 & 0xFF) / 255.0F;
      this.public_ *= (float)(var2 & 0xFF) / 255.0F;
   }

   @Override
   protected float throws_() {
      return this.instanceof_.break_((double)((this.char_ + 1.0F) / 4.0F * 16.0F));
   }

   public nz_3 catch_() {
      this.break_ = new rfH_2(this.catch_, this.private_, this.implements_);
      if (this.class_.class_(xu_3.implements_)) {
         return this;
      } else {
         this.break_(this.break_);
         return this;
      }
   }

   @Override
   protected float protected_() {
      return this.instanceof_.break_((double)(this.char_ / 4.0F * 16.0F));
   }
}
