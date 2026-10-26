package celestial;

public final class rRE implements rRq_1 {
   private final xc_3[] id_class;

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      int var2 = var1.c_();
      return var2 >= 0 && var2 < this.id_class.length ? this.id_class[var2] : xu_3.id_class.id_continue();
   }

   public rRE(xc_3[] var1) {
      this.id_class = var1;
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return null;
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      return this.id_byte(var1).id_volatile();
   }
}
