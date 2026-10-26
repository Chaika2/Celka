package celestial;

class rGu_1 extends rBI<iB_2> {
   public rGu_1(rGz_1 var1) {
      super(var1, iB_2.class, 10, true, false, var0 -> var0 instanceof rEK);
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

   @Override
   public boolean id_class() {
      return this.id_throws.BG() == null ? false : super.id_class();
   }
}
