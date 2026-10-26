package celestial;

public class nh_3 extends lO_2 {
   nh_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_finally *= 0.1F;
      this.id_extends *= 0.1F;
      this.id_native *= 0.1F;
      this.id_finally += var8 * 0.4;
      this.id_extends += var10 * 0.4;
      this.id_native += var12 * 0.4;
      float var14 = (float)(Math.random() * 0.3F + 0.6F);
      this.id_synchronized = var14;
      this.id_return = var14;
      this.id_public = var14;
      this.id_throw *= 0.75F;
      this.id_this = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
      this.id_final = false;
      this.id_case();
   }

   @Override
   public CJ id_class() {
      return CJ.id_break;
   }

   @Override
   public float id_class(float var1) {
      return this.id_throw * rfU_2.id_class(((float)this.id_super + var1) / (float)this.id_this * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_return = (float)((double)this.id_return * 0.96);
         this.id_public = (float)((double)this.id_public * 0.9);
         this.id_finally *= 0.7F;
         this.id_extends *= 0.7F;
         this.id_native *= 0.7F;
         this.id_extends -= 0.02F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
