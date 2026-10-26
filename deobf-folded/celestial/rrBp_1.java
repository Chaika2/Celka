package celestial;

public interface rrBp_1 extends rrBT, rrBn_1 {
   int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6);

   @Override
   default int id_class(rKA<?> var1, rKj_1 var2, int var3, int var4) {
      return this.id_class(
         var1,
         var2.id_class(this.id_class(var3 + 1), this.id_break(var4 + 0)),
         var2.id_class(this.id_class(var3 + 2), this.id_break(var4 + 1)),
         var2.id_class(this.id_class(var3 + 1), this.id_break(var4 + 2)),
         var2.id_class(this.id_class(var3 + 0), this.id_break(var4 + 1)),
         var2.id_class(this.id_class(var3 + 1), this.id_break(var4 + 1))
      );
   }
}
