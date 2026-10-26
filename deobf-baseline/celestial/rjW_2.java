package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class rjW_2 extends AbstractDoubleList {
   private final int id_class;

   rjW_2(int var1) {
      this.id_class = var1;
   }

   public int size() {
      return this.id_class + 1;
   }

   public double getDouble(int var1) {
      return (double)var1 / (double)this.id_class;
   }
}
