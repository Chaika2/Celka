package celestial;

class rJy_1 extends rJY {
   rJy_1(rJL var1, rXu_1 var2, int var3, int var4, int var5, rpq_3 var6) {
      super(var2, var3, var4, var5);
      this.id_break = var1;
      this.id_class = var6;
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      this.id_break.id_protected.id_class(1);
      this.id_break.id_catch.id_class(1);
      if (!this.id_break.id_protected.id_break() || !this.id_break.id_catch.id_break()) {
         this.id_break.id_break.id_class(0);
      }

      this.id_class.id_class((var1x, var2x) -> {
         long var3 = var1x.r();
         if (this.id_break.id_finally != var3) {
            var1x.id_class((rhd_3)null, var2x, rqn_3.df, rqL_2.BLOCKS, 1.0F, 1.0F);
            this.id_break.id_finally = var3;
         }
      });
      return super.id_class(var1, var2);
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return false;
   }
}
