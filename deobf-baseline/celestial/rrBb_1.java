package celestial;

public enum rrBb_1 implements rrBp_1 {
   INSTANCE;

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      return var6 == 1 && (var2 == 3 || var3 == 3 || var5 == 3 || var4 == 3 || var2 == 4 || var3 == 4 || var5 == 4 || var4 == 4) ? 2 : var6;
   }
}
