package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjF_2 extends AbstractDoubleList {
   private final DoubleList class_;
   private final double break_;

   public rjF_2(DoubleList var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public int size() {
      return this.class_.size();
   }

   public double getDouble(int var1) {
      return this.class_.getDouble(var1) + this.break_;
   }
}
