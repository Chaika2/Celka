package celestial;

public class nK_2 extends lO_2 {
   private final float id_class;
   private final Ch_1 id_break;

   nK_2(gm_3 var1, double var2, double var4, double var6, float var8, float var9, float var10, Ch_1 var11) {
      super(var1, var2, var4, var6);
      this.id_break = var11;
      this.id_synchronized = var8;
      this.id_return = var9;
      this.id_public = var10;
      float var12 = 0.9F;
      this.id_throw *= 0.67499995F;
      int var13 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
      this.id_this = (int)Math.max((float)var13 * 0.9F, 1.0F);
      this.id_break(var11);
      this.id_class = ((float)Math.random() - 0.5F) * 0.1F;
      this.id_while = (float)Math.random() * (float) (Math.PI * 2);
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
         this.id_break(this.id_break);
         this.id_try = this.id_while;
         this.id_while = this.id_while + (float) Math.PI * this.id_class * 2.0F;
         if (this.id_volatile) {
            this.id_try = this.id_while = 0.0F;
         }

         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_extends -= 0.003F;
         this.id_extends = Math.max(this.id_extends, -0.14F);
      }
   }
}
