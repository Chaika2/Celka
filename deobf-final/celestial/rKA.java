package celestial;

public interface rKA<R extends rKj_1> extends rKC {
   default int class_(int var1, int var2, int var3, int var4) {
      int var5 = this.class_(4);
      if (var5 == 0) {
         return var1;
      } else if (var5 == 1) {
         return var2;
      } else {
         return var5 == 2 ? var3 : var4;
      }
   }

   default int class_(int var1, int var2) {
      return this.class_(2) == 0 ? var1 : var2;
   }

   default R class_(rrBw_1 var1, R var2, R var3) {
      return this.class_(var1);
   }

   default R class_(rrBw_1 var1, R var2) {
      return this.class_(var1);
   }

   R class_(rrBw_1 var1);

   void class_(long var1, long var3);
}
