package celestial;

class nm_3 extends nu_3 {
   private final rLx_1 id_break;

   nm_3(gm_3 var1, double var2, double var4, double var6, rXs_1 var8, rLx_1 var9) {
      super(var1, var2, var4, var6, var8);
      this.id_break = var9;
      this.id_else *= 0.02F;
      this.id_this = 40;
   }

   @Override
   protected void id_catch() {
      if (this.id_this-- <= 0) {
         this.id_finally();
         this.id_byte.id_class(this.id_break, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
      }
   }

   @Override
   protected void id_private() {
      this.id_finally *= 0.02;
      this.id_extends *= 0.02;
      this.id_native *= 0.02;
   }
}
