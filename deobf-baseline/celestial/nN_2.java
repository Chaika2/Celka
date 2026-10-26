package celestial;

public class nN_2 extends lO_2 {
   private boolean id_class;
   private final Ch_1 id_break;

   nN_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6);
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
      this.id_synchronized = rfU_2.id_class(this.id_continue, 0.7176471F, 0.8745098F);
      this.id_return = rfU_2.id_class(this.id_continue, 0.0F, 0.0F);
      this.id_public = rfU_2.id_class(this.id_continue, 0.8235294F, 0.9764706F);
      this.id_throw *= 0.75F;
      this.id_this = (int)(20.0 / ((double)this.id_continue.nextFloat() * 0.8 + 0.2));
      this.id_class = false;
      this.id_final = false;
      this.id_break = var14;
      this.id_break(var14);
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
         if (this.id_volatile) {
            this.id_extends = 0.0;
            this.id_class = true;
         }

         if (this.id_class) {
            this.id_extends += 0.002;
         }

         this.id_class(this.id_finally, this.id_extends, this.id_native);
         if (this.id_private == this.id_throws) {
            this.id_finally *= 1.1;
            this.id_native *= 1.1;
         }

         this.id_finally *= 0.96F;
         this.id_native *= 0.96F;
         if (this.id_class) {
            this.id_extends *= 0.96F;
         }
      }
   }
}
