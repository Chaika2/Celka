package celestial;

import java.util.BitSet;

public class roU_2 {
   private final BitSet class_ = new BitSet();

   public int class_(int var1) {
      int var2 = 0;

      while (true) {
         int var3 = this.class_.nextClearBit(var2);
         int var4 = this.class_.nextSetBit(var3);
         if (var4 == -1 || var4 - var3 >= var1) {
            this.class_(var3, var1);
            return var3;
         }

         var2 = var4;
      }
   }

   public void class_(int var1, int var2) {
      this.class_.set(var1, var1 + var2);
   }

   public void break_(int var1, int var2) {
      this.class_.clear(var1, var1 + var2);
   }
}
