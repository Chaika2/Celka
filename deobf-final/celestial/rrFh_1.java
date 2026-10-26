package celestial;

import java.util.Comparator;

public class rrFh_1 implements Comparator<rrFX> {
   public int class_(rrFX var1, rrFX var2) {
      int var3 = Integer.compare(var1.class_().V(), var2.class_().V());
      return var3 == 0 ? Integer.compare(-var1.case_(), -var2.case_()) : var3;
   }
}
