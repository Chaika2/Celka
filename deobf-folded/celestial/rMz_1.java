package celestial;

class rMz_1 extends rBH {
   @Override
   public void id_byte() {
      this.id_class.sL();
      super.id_byte();
   }

   public rMz_1(rba_3 var1, int var2, int var3) {
      super(var1, var3);
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      return super.id_class() && this.id_catch();
   }

   @Override
   public boolean id_break() {
      return super.id_break() && this.id_catch();
   }

   private boolean id_catch() {
      return !this.id_class.Sc() && !this.id_class.sJ() && !this.id_class.sv() && this.id_class.I_() == null;
   }
}
