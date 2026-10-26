package celestial;

class rGu_1 extends rBI<iB_2> {
   public rGu_1(rGz_1 var1) {
      super(var1, iB_2.class, 10, true, false, var0 -> var0 instanceof rEK);
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

   @Override
   public boolean class_() {
      return this.throws_.BG() == null ? false : super.class_();
   }
}
