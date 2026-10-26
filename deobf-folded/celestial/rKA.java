package celestial;

public interface rKA<R extends rKj_1> extends rKC {
   default int id_class(int var1, int var2, int var3, int var4) {
      int var5 = this.id_class(4);
      if (var5 == 0) {
         return var1;
      } else if (var5 == 1) {
         return var2;
      } else {
         return var5 == 2 ? var3 : var4;
      }
   }

   default int id_class(int var1, int var2) {
      return this.id_class(2) == 0 ? var1 : var2;
   }

   default R id_class(rrBw_1 var1, R var2, R var3) {
      return this.id_class(var1);
   }

   default R id_class(rrBw_1 var1, R var2) {
      return this.id_class(var1);
   }

   R id_class(rrBw_1 var1);

   void id_class(long var1, long var3);
}
