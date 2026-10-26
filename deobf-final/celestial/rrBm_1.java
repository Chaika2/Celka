package celestial;

public enum rrBm_1 implements rrBp_1 {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = var3 == var5;
      boolean var8 = var2 == var4;
      if (var7 == var8) {
         if (var7) {
            return var1.class_(2) == 0 ? var5 : var2;
         } else {
            return var6;
         }
      } else {
         return var7 ? var5 : var2;
      }
   }
}
