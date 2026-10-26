package celestial;

import it.unimi.dsi.fastutil.ints.IntComparator;

class gQ_2 implements IntComparator {
   gQ_2(gz_3 var1, int[] var2, int[] var3) {
      this.id_class = var2;
      this.id_break = var3;
   }

   public int compare(Integer var1, Integer var2) {
      return this.compare(var1.intValue(), var2.intValue());
   }

   public int compare(int var1, int var2) {
      return this.id_class[var1] == this.id_class[var2]
         ? Integer.compare(this.id_break[var1], this.id_break[var2])
         : Integer.compare(this.id_class[var1], this.id_class[var2]);
   }
}
