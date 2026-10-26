package celestial;

public enum rrBX implements rrBA {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2, int var3) {
      if (var2 == 0 && var3 == 0) {
         return 1;
      } else {
         return var1.class_(10) == 0 ? 1 : 0;
      }
   }
}
