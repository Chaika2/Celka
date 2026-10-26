package celestial;

import java.util.Comparator;

public class rrFh_1 implements Comparator<rrFX> {
   public int id_class(rrFX var1, rrFX var2) {
      int var3 = Integer.compare(var1.id_class().V(), var2.id_class().V());
      return var3 == 0 ? Integer.compare(-var1.id_case(), -var2.id_case()) : var3;
   }
}
