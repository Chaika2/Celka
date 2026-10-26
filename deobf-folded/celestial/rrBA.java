package celestial;

public interface rrBA {
   int id_class(rKC var1, int var2, int var3);

   default <R extends rKj_1> rKV<R> id_class(rKA<R> var1) {
      return () -> (R)var1.id_class((var2, var3) -> {
            var1.id_class((long)var2, (long)var3);
            return this.id_class((rKC)var1, var2, var3);
         });
   }
}
