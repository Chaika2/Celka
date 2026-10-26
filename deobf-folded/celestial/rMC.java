package celestial;

class rMC extends rSO {
   private final rMA id_byte;

   public rMC(rMA var1, double var2, rkg_3 var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.id_byte = var1;
   }

   @Override
   protected boolean id_catch() {
      return super.id_catch() && !this.id_byte.sJ();
   }
}
