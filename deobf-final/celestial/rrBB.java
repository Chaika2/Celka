package celestial;

public enum rrBB implements rrBy_1 {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2) {
      if (rrBx_1.break_(var2)) {
         return var2;
      } else {
         int var3 = var1.class_(6);
         if (var3 == 0) {
            return 4;
         } else {
            return var3 == 1 ? 3 : 1;
         }
      }
   }
}
