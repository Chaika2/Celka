package celestial;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

class uY_2 implements Comparator<Aw_1> {
   public int id_class(Aw_1 var1, Aw_1 var2) {
      rnB_2 var3 = var1.id_implements();
      rnB_2 var4 = var2.id_implements();
      return ComparisonChain.start()
         .compareTrueFirst(var1.id_break() != rRl_1.SPECTATOR, var2.id_break() != rRl_1.SPECTATOR)
         .compare(var3 != null ? var3.id_class() : "", var4 != null ? var4.id_class() : "")
         .compare(var1.id_class().getName(), var2.id_class().getName(), String::compareToIgnoreCase)
         .result();
   }
}
