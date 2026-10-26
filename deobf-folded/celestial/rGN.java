package celestial;

class rGN extends rBI<rhd_3> {
   public rGN(rGz_1 var1, rGz_1 var2) {
      super(var2, rhd_3.class, true);
      this.id_implements = var1;
   }

   @Override
   public boolean id_class() {
      return ((rYB)this.id_implements.id_throws[7]).id_abstract() == rRO.PEACEFUL ? false : super.id_class();
   }

   @Override
   protected rfl_3 id_class(double var1) {
      rpr_3 var3 = ((rGz_1)this.id_throws).n();
      if (var3.id_final() == rpB_2.X) {
         return this.id_throws.rN().id_byte(4.0, var1, var1);
      } else {
         return var3.id_final() == rpB_2.Z ? this.id_throws.rN().id_byte(var1, var1, 4.0) : this.id_throws.rN().id_byte(var1, 4.0, var1);
      }
   }
}
