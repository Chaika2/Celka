package celestial;

public class rBS extends rBp_1 {
   private final rbf_3 id_catch;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_catch.id_public(false);
   }

   public rBS(rbf_3 var1, double var2) {
      super(var1, var2, 8);
      this.id_catch = var1;
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      if (!var1.id_finally(var2.id_final())) {
         return false;
      } else {
         xc_3 var3 = var1.id_byte(var2);
         if (var3.id_class(xu_3.re)) {
            return rHu_1.id_class(var1, var2) < 1;
         } else {
            return var3.id_class(xu_3.Ps) && var3.id_byte(C_do.id_final)
               ? true
               : var3.id_class(rls_3.id_short, var0 -> var0.id_protected(xb_3.id_volatile).map(var0x -> var0x != rCp_1.HEAD).orElse(true));
         }
      }
   }

   @Override
   public boolean id_class() {
      return this.id_catch.sZ() && !this.id_catch.sL() && super.id_class();
   }

   @Override
   public void id_throws() {
      super.id_throws();
      this.id_catch.id_public(this.id_native());
   }

   @Override
   public void id_protected() {
      super.id_protected();
      this.id_catch.id_public(false);
   }
}
