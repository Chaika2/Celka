package celestial;

public interface rrBn_1 extends rrBt_1 {
   int id_class(rKA<?> var1, rKj_1 var2, int var3, int var4);

   default <R extends rKj_1> rKV<R> id_class(rKA<R> var1, rKV<R> var2) {
      return () -> {
         rKj_1 var3 = var2.make();
         return (R)var1.id_class((var3x, var4) -> {
            var1.id_class((long)var3x, (long)var4);
            return this.id_class(var1, var3, var3x, var4);
         }, var3);
      };
   }
}
