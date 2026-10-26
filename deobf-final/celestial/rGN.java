package celestial;

class rGN extends rBI<rhd_3> {
   public rGN(rGz_1 var1, rGz_1 var2) {
      super(var2, rhd_3.class, true);
      this.implements_ = var1;
   }

   @Override
   public boolean class_() {
      return ((rYB)this.implements_.throws_[7]).abstract_() == rRO.PEACEFUL ? false : super.class_();
   }

   @Override
   protected rfl_3 class_(double var1) {
      rpr_3 var3 = ((rGz_1)this.throws_).n();
      if (var3.final_() == rpB_2.X) {
         return this.throws_.rN().byte_(4.0, var1, var1);
      } else {
         return var3.final_() == rpB_2.Z ? this.throws_.rN().byte_(var1, var1, 4.0) : this.throws_.rN().byte_(var1, 4.0, var1);
      }
   }
}
