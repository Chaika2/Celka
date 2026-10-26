package celestial;

public enum rrBM implements rrBp_1 {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      return var6 == 4 && (var2 == 1 || var3 == 1 || var5 == 1 || var4 == 1 || var2 == 2 || var3 == 2 || var5 == 2 || var4 == 2) ? 3 : var6;
   }
}
