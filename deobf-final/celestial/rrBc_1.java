package celestial;

public enum rrBc_1 implements rrBp_1 {
   INSTANCE;

   private static int byte_(int var0) {
      return var0 >= 2 ? 2 + (var0 & 1) : var0;
   }

   @Override
   public int class_(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = byte_(var6);
      return var7 == byte_(var5) && var7 == byte_(var2) && var7 == byte_(var3) && var7 == byte_(var4) ? -1 : 7;
   }
}
