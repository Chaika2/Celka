package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjF_2 extends AbstractDoubleList {
   private final DoubleList id_class;
   private final double id_break;

   public rjF_2(DoubleList var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public int size() {
      return this.id_class.size();
   }

   public double getDouble(int var1) {
      return this.id_class.getDouble(var1) + this.id_break;
   }
}
