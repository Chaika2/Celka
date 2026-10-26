package celestial;

public enum rrBO implements rrBH {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2) {
      if (!rrBx_1.break_(var2) && var1.class_(13) == 0) {
         var2 |= 1 + var1.class_(15) << 8 & 3840;
      }

      return var2;
   }
}
