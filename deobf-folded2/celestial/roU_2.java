package celestial;

import java.util.BitSet;

public class roU_2 {
   private final BitSet id_class = new BitSet();

   public int id_class(int var1) {
      int var2 = 0;

      while (true) {
         int var3 = this.id_class.nextClearBit(var2);
         int var4 = this.id_class.nextSetBit(var3);
         if (var4 == -1 || var4 - var3 >= var1) {
            this.id_class(var3, var1);
            return var3;
         }

         var2 = var4;
      }
   }

   public void id_class(int var1, int var2) {
      this.id_class.set(var1, var1 + var2);
   }

   public void id_break(int var1, int var2) {
      this.id_class.clear(var1, var1 + var2);
   }
}
