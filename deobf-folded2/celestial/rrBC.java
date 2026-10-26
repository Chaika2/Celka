package celestial;

public interface rrBC extends rrBt_1 {
   int id_class(rKC var1, rKj_1 var2, rKj_1 var3, int var4, int var5);

   default <R extends rKj_1> rKV<R> id_class(rKA<R> var1, rKV<R> var2, rKV<R> var3) {
      return () -> {
         rKj_1 var4 = var2.make();
         rKj_1 var5 = var3.make();
         return (R)var1.id_class((var4x, var5x) -> {
            var1.id_class((long)var4x, (long)var5x);
            return this.id_class((rKC)var1, var4, var5, var4x, var5x);
         }, var4, var5);
      };
   }
}
