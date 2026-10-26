package celestial;

public class AK extends lO_2 {
   private final float class_;
   private final float break_;

   @Override
   protected float byte_() {
      return this.instanceof_.class_((double)(this.class_ / 4.0F * 16.0F));
   }

   AK(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, rdn_3 var14) {
      this(var1, var2, var4, var6, var14);
      this.finally_ *= 0.1F;
      this.extends_ *= 0.1F;
      this.native_ *= 0.1F;
      this.finally_ += var8;
      this.extends_ += var10;
      this.native_ += var12;
   }

   protected AK(gm_3 var1, double var2, double var4, double var6, rdn_3 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.class_(QY.instanceof_().float_().class_(var8, var1, (iB_2)null).throws_());
      this.else_ = 1.0F;
      this.throw_ /= 2.0F;
      this.class_ = this.continue_.nextFloat() * 3.0F;
      this.break_ = this.continue_.nextFloat() * 3.0F;
   }

   @Override
   public CJ class_() {
      return CJ.class_;
   }

   @Override
   protected float break_() {
      return this.instanceof_.class_((double)((this.class_ + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   protected float throws_() {
      return this.instanceof_.break_((double)((this.break_ + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   protected float protected_() {
      return this.instanceof_.break_((double)(this.break_ / 4.0F * 16.0F));
   }
}
