package celestial;

public interface rrBy_1 extends rrBT, rrBn_1 {
   int class_(rKC var1, int var2);

   @Override
   default int class_(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      int var5 = var2.class_(this.class_(var3 + 1), this.break_(var4 + 1));
      return this.class_(var1, var5);
   }
}
