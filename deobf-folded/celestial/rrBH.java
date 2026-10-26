package celestial;

public interface rrBH extends rrBn_1, rrBq_1 {
   int id_class(rKC var1, int var2);

   @Override
   default int id_class(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      return this.id_class(var1, var2.id_class(this.id_class(var3), this.id_break(var4)));
   }
}
