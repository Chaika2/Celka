package celestial;

public interface rrBl_1 extends rrBT, rrBn_1 {
   int class_(rKC var1, int var2, int var3, int var4, int var5, int var6);

   @Override
   default int class_(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      return this.class_(
         var1,
         var2.class_(this.class_(var3 + 0), this.break_(var4 + 2)),
         var2.class_(this.class_(var3 + 2), this.break_(var4 + 2)),
         var2.class_(this.class_(var3 + 2), this.break_(var4 + 0)),
         var2.class_(this.class_(var3 + 0), this.break_(var4 + 0)),
         var2.class_(this.class_(var3 + 1), this.break_(var4 + 1))
      );
   }
}
