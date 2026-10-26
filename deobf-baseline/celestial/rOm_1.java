package celestial;

class rOm_1 extends rBp_1 {
   private final rON id_catch;

   rOm_1(rON var1, double var2) {
      super(var1, var2, 16);
      this.id_catch = var1;
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      return !var1.id_finally(var2.id_final()) ? false : zH_2.id_break(var1, var2);
   }

   @Override
   public boolean id_class() {
      return this.id_catch.L() && this.id_catch.sx().id_class(this.id_catch.Ps(), 9.0) ? super.id_class() : false;
   }

   @Override
   public boolean id_break() {
      return super.id_break() && this.id_catch.L() && this.id_catch.sx().id_class(this.id_catch.Ps(), 9.0);
   }

   @Override
   public void id_throws() {
      super.id_throws();
      rfH_2 var1 = this.id_catch.Bs();
      if (!this.id_catch.rT() && this.id_native()) {
         if (this.id_catch.id_while < 1) {
            this.id_catch.id_else(true);
         } else if (this.id_catch.id_while > 200) {
            rYB var2 = (rYB)this.id_catch.id_throws[7];
            var2.id_class((rhd_3)null, var1, rqn_3.dp, rqL_2.BLOCKS, 0.3F, 0.9F + var2.id_int.nextFloat() * 0.2F);
            var2.id_class(
               this.id_throws.id_final(), xu_3.OX.id_continue().id_class(zH_2.id_final, Integer.valueOf(rON.id_class(this.id_catch).nextInt(4) + 1)), 3
            );
            this.id_catch.id_this(false);
            this.id_catch.id_else(false);
            this.id_catch.id_this(600);
         }

         if (this.id_catch.n()) {
            this.id_catch.id_while++;
         }
      }
   }
}
