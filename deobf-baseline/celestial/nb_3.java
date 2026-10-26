package celestial;

public class nb_3 extends lO_2 {
   private final Ch_1 id_class;

   nb_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_class = var14;
      float var15 = 2.5F;
      this.id_finally *= 0.1F;
      this.id_extends *= 0.1F;
      this.id_native *= 0.1F;
      this.id_finally += var8;
      this.id_extends += var10;
      this.id_native += var12;
      float var16 = 1.0F - (float)(Math.random() * 0.3F);
      this.id_synchronized = var16;
      this.id_return = var16;
      this.id_public = var16;
      this.id_throw *= 1.875F;
      int var17 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
      this.id_this = (int)Math.max((float)var17 * 2.5F, 1.0F);
      this.id_final = false;
      this.id_break(var14);
   }

   @Override
   public float id_class(float var1) {
      return this.id_throw * rfU_2.id_class(((float)this.id_super + var1) / (float)this.id_this * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public CJ id_class() {
      return CJ.id_byte;
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
         this.id_finally *= 0.96F;
         this.id_extends *= 0.96F;
         this.id_native *= 0.96F;
         rhd_3 var1 = this.id_byte.id_class(this.id_catch, this.id_private, this.id_implements, 2.0, false);
         if (var1 != null) {
            double var2 = var1.re();
            if (this.id_private > var2) {
               this.id_private = this.id_private + (var2 - this.id_private) * 0.2;
               this.id_extends = this.id_extends + (var1.rv().id_byte - this.id_extends) * 0.2;
               this.id_break(this.id_catch, this.id_private, this.id_implements);
            }
         }

         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
