package celestial;

public enum rrBO implements rrBH {
   INSTANCE;

   @Override
   public int id_class(rKC var1, int var2) {
      if (!rrBx_1.id_break(var2) && var1.id_class(13) == 0) {
         var2 |= 1 + var1.id_class(15) << 8 & 3840;
      }

      return var2;
   }
}
