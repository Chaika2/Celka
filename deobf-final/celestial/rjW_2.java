package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class rjW_2 extends AbstractDoubleList {
   private final int class_;

   rjW_2(int var1) {
      this.class_ = var1;
   }

   public int size() {
      return this.class_ + 1;
   }

   public double getDouble(int var1) {
      return (double)var1 / (double)this.class_;
   }
}
