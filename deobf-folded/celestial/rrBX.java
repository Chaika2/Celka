package celestial;

public enum rrBX implements rrBA {
   INSTANCE;

   @Override
   public int id_class(rKC var1, int var2, int var3) {
      if (var2 == 0 && var3 == 0) {
         return 1;
      } else {
         return var1.id_class(10) == 0 ? 1 : 0;
      }
   }
}
