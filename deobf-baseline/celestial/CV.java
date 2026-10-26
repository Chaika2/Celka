package celestial;

public class CV extends lO_2 {
   private final Ch_1 id_class;

   CV(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, rLc_1 var14, Ch_1 var15) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.id_class = var15;
      this.id_finally *= 0.1F;
      this.id_extends *= 0.1F;
      this.id_native *= 0.1F;
      float var16 = (float)Math.random() * 0.4F + 0.6F;
      this.id_synchronized = ((float)(Math.random() * 0.2F) + 0.8F) * var14.id_class() * var16;
      this.id_return = ((float)(Math.random() * 0.2F) + 0.8F) * var14.id_break() * var16;
      this.id_public = ((float)(Math.random() * 0.2F) + 0.8F) * var14.id_throws() * var16;
      this.id_throw = this.id_throw * 0.75F * var14.id_case();
      int var17 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.id_this = (int)Math.max((float)var17 * var14.id_case(), 1.0F);
      this.id_break(var15);
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
