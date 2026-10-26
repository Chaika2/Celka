package celestial;

class rOu_1 extends rBp_1 {
   private final rON id_catch;

   rOu_1(rON var1, double var2) {
      super(var1, var1.n_() ? 2.0 : var2, 24);
      this.id_catch = var1;
      this.id_case = -1;
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      return var1.id_byte(var2).id_class(xu_3.id_try);
   }

   @Override
   public boolean id_class() {
      if (this.id_catch.n_() && !this.id_catch.rT()) {
         return super.id_class();
      } else {
         return !this.id_catch.sc() && !this.id_catch.rT() && !this.id_catch.L() ? super.id_class() : false;
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_catch.rT() && this.id_protected <= 1200 && this.id_class((rYB)this.id_catch.id_throws[7], this.id_throws);
   }

   @Override
   public boolean id_extends() {
      return this.id_protected % 160 == 0;
   }
}
