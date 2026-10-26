package celestial;

import java.util.List;

public interface rq_3 {
   int id_byte();

   xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5);

   default boolean id_class(int var1, int var2, int var3, xc_3 var4) {
      return var1 >= 0 && var1 < this.id_break() && var2 >= 0 && var2 < this.id_class() && var3 >= 0 && var3 < this.id_byte();
   }

   default int id_class(rpB_2 var1) {
      switch (((int[])rT_2.id_class[0])[var1.ordinal()]) {
         case 1:
            return this.id_break();
         case 2:
            return this.id_class();
         case 3:
            return this.id_byte();
         default:
            throw new UnsupportedOperationException(var1 + "");
      }
   }

   int id_class();

   int id_break();

   default void id_protected() {
   }
}
