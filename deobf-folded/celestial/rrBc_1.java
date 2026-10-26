package celestial;

public enum rrBc_1 implements rrBp_1 {
   INSTANCE;

   private static int id_byte(int var0) {
      return var0 >= 2 ? 2 + (var0 & 1) : var0;
   }

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = id_byte(var6);
      return var7 == id_byte(var5) && var7 == id_byte(var2) && var7 == id_byte(var3) && var7 == id_byte(var4) ? -1 : 7;
   }
}
