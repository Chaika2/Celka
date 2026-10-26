package celestial;

class rMU extends rBc_1 {
   @Override
   public void id_byte() {
      super.id_byte();
      if (this.id_class.n_()) {
         this.id_catch();
         this.id_protected();
      }
   }

   public rMU(rMK var1) {
      super(var1);
      this.id_class = var1;
   }

   @Override
   protected void id_class(is_3 var1, iB_2 var2) {
      if (var1 instanceof rMK && !var1.n_()) {
         super.id_class(var1, var2);
      }
   }
}
