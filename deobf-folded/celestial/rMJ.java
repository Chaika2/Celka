package celestial;

class rMJ extends rBY {
   public rMJ(rba_3 var1, double var2) {
      super(var1, var2);
      this.id_catch = var1;
   }

   @Override
   public boolean id_class() {
      return !this.id_catch.sv() && super.id_class();
   }
}
