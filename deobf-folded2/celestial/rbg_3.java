package celestial;

class rbg_3 extends rSO {
   private rhd_3 id_byte;
   private final rbf_3 id_protected;

   public rbg_3(rbf_3 var1, double var2, rkg_3 var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.id_protected = var1;
   }

   @Override
   public boolean id_class() {
      return super.id_class() && !this.id_protected.sZ();
   }

   @Override
   public void id_throws() {
      super.id_throws();
      if (this.id_byte == null && this.id_class.Sa().nextInt(600) == 0) {
         this.id_byte = this.id_break;
      } else if (this.id_class.Sa().nextInt(500) == 0) {
         this.id_byte = null;
      }
   }

   @Override
   protected boolean id_catch() {
      return this.id_byte != null && this.id_byte.equals(this.id_break) ? false : super.id_catch();
   }
}
