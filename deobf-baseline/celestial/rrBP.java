package celestial;

public enum rrBP implements rrBl_1 {
   INSTANCE;

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      return rrBx_1.id_break(var6)
            && rrBx_1.id_break(var5)
            && rrBx_1.id_break(var2)
            && rrBx_1.id_break(var4)
            && rrBx_1.id_break(var3)
            && var1.id_class(100) == 0
         ? 14
         : var6;
   }
}
