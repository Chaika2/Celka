package celestial;

class rEk_1 extends rBp_1 {
   private final rEx_1 id_catch;

   @Override
   public void id_byte() {
      this.id_catch.id_this(false);
      rEx_1.id_class(this.id_catch, this.id_catch.id_break);
      super.id_byte();
   }

   public rEk_1(rEx_1 var1, double var2) {
      super(var1, var2, 8, 2);
      this.id_catch = var1;
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.id_final();
      return var1.id_finally(var3) && var1.id_finally(var3.id_final()) ? var1.id_byte(var2).id_class(var1, var2, this.id_catch) : false;
   }

   @Override
   public boolean id_class() {
      return super.id_class()
         && !((rYB)this.id_catch.id_throws[7]).id_strictfp()
         && this.id_catch.rT()
         && this.id_catch.re() >= (double)(((rYB)this.id_catch.id_throws[7]).id_short() - 3);
   }

   @Override
   public boolean id_break() {
      return super.id_break();
   }

   @Override
   public void id_protected() {
      super.id_protected();
   }
}
