package celestial;

public interface rrBA {
   int class_(rKC var1, int var2, int var3);

   default <R extends rKj_1> rKV<R> class_(rKA<R> var1) {
      return () -> (R)var1.class_((var2, var3) -> {
            var1.class_((long)var2, (long)var3);
            return this.class_((rKC)var1, var2, var3);
         });
   }
}
