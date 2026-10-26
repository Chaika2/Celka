package celestial;

public interface rrBy_1 extends rrBT, rrBn_1 {
   int id_class(rKC var1, int var2);

   @Override
   default int id_class(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      int var5 = var2.id_class(this.id_class(var3 + 1), this.id_break(var4 + 1));
      return this.id_class(var1, var5);
   }
}
