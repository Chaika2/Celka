package celestial;

public interface rrBH extends rrBn_1, rrBq_1 {
   int class_(rKC var1, int var2);

   @Override
   default int class_(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      return this.class_(var1, var2.class_(this.class_(var3), this.break_(var4)));
   }
}
