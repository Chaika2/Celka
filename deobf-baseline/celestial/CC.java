package celestial;

public class CC extends lO_2 {
   CC(gm_3 var1, double var2, double var4, double var6, double var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_finally *= 0.01F;
      this.id_extends *= 0.01F;
      this.id_native *= 0.01F;
      this.id_extends += 0.2;
      this.id_synchronized = Math.max(0.0F, rfU_2.id_class(((float)var8 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.id_return = Math.max(0.0F, rfU_2.id_class(((float)var8 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.id_public = Math.max(0.0F, rfU_2.id_class(((float)var8 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.id_throw *= 1.5F;
      this.id_this = 6;
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
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         if (this.id_private == this.id_throws) {
            this.id_finally *= 1.1;
            this.id_native *= 1.1;
         }

         this.id_finally *= 0.66F;
         this.id_extends *= 0.66F;
         this.id_native *= 0.66F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
