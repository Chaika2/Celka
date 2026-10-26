package celestial;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

class uY_2 implements Comparator<Aw_1> {
   public int class_(Aw_1 var1, Aw_1 var2) {
      rnB_2 var3 = var1.implements_();
      rnB_2 var4 = var2.implements_();
      return ComparisonChain.start()
         .compareTrueFirst(var1.break_() != rRl_1.SPECTATOR, var2.break_() != rRl_1.SPECTATOR)
         .compare(var3 != null ? var3.class_() : "", var4 != null ? var4.class_() : "")
         .compare(var1.class_().getName(), var2.class_().getName(), String::compareToIgnoreCase)
         .result();
   }
}
