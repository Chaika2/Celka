package celestial;

public class Co_1 extends lO_2 {
   private final Ch_1 id_class;
   private final double id_break;

   protected Co_1(
      gm_3 var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      float var10,
      double var11,
      double var13,
      double var15,
      float var17,
      Ch_1 var18,
      float var19,
      int var20,
      double var21,
      boolean var23
   ) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_break = var21;
      this.id_class = var18;
      this.id_finally *= (double)var8;
      this.id_extends *= (double)var9;
      this.id_native *= (double)var10;
      this.id_finally += var11;
      this.id_extends += var13;
      this.id_native += var15;
      float var24 = var1.id_int.nextFloat() * var19;
      this.id_synchronized = var24;
      this.id_return = var24;
      this.id_public = var24;
      this.id_throw *= 0.75F * var17;
      this.id_this = (int)((double)var20 / ((double)var1.id_int.nextFloat() * 0.8 + 0.2));
      this.id_this = (int)((float)this.id_this * var17);
      this.id_this = Math.max(this.id_this, 1);
      this.id_break(var18);
      this.id_final = var23;
   }

   @Override
   public float id_class(float var1) {
      return this.id_throw * rfU_2.id_class(((float)this.id_super + var1) / (float)this.id_this * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public CJ id_class() {
      return CJ.id_break;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_break(this.id_class);
         this.id_extends = this.id_extends + this.id_break;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         if (this.id_private == this.id_throws) {
            this.id_finally *= 1.1;
            this.id_native *= 1.1;
         }

         this.id_finally *= 0.96F;
         this.id_extends *= 0.96F;
         this.id_native *= 0.96F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
