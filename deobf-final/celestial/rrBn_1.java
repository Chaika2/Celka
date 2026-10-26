package celestial;

public interface rrBn_1 extends rrBt_1 {
   int class_(rKA<?> var1, rKj_1 var2, int var3, int var4);

   default <R extends rKj_1> rKV<R> class_(rKA<R> var1, rKV<R> var2) {
      return () -> {
         rKj_1 var3 = var2.make();
         return (R)var1.class_((var3x, var4) -> {
            var1.class_((long)var3x, (long)var4);
            return this.class_(var1, var3, var3x, var4);
         }, var3);
      };
   }
}
