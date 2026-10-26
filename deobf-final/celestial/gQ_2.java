package celestial;

import it.unimi.dsi.fastutil.ints.IntComparator;

class gQ_2 implements IntComparator {
   gQ_2(gz_3 var1, int[] var2, int[] var3) {
      this.class_ = var2;
      this.break_ = var3;
   }

   public int compare(Integer var1, Integer var2) {
      return this.compare(var1.intValue(), var2.intValue());
   }

   public int compare(int var1, int var2) {
      return this.class_[var1] == this.class_[var2]
         ? Integer.compare(this.break_[var1], this.break_[var2])
         : Integer.compare(this.class_[var1], this.class_[var2]);
   }
}
