package celestial;

class rOz_1 extends rBp_1 {
   private final rOk_1 id_catch;

   rOz_1(rOk_1 var1, double var2) {
      super(var1, var2, 8, 2);
      this.id_catch = var1;
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      return var1.id_byte(var2).id_class(xu_3.id_instanceof) && var1.id_byte(var2.id_final()).id_class(var1, var2, rLT.LAND);
   }

   @Override
   public boolean id_class() {
      return !this.id_catch.ry() && super.id_class();
   }

   @Override
   public boolean id_break() {
      return !this.id_catch.ry() && this.id_class((rYB)this.id_catch.id_throws[7], this.id_throws);
   }

   @Override
   public rfH_2 id_finally() {
      return this.id_throws;
   }

   @Override
   public boolean id_extends() {
      return this.id_protected % 20 == 0;
   }
}
