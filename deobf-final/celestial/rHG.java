package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class rHG {
   private final List<Pair<rHE, rxL_2>> class_ = Lists.newArrayList();

   public rHG class_(rHE var1, rxL_2 var2) {
      this.class_.add(Pair.of(var1, var2));
      return this;
   }

   public rcy_3 class_() {
      rcy_3 var1 = new rcy_3();

      for (Pair var3 : this.class_) {
         rcd_3 var4 = new rcd_3();
         var4.class_("Pattern", ((rHE)var3.getLeft()).hashname);
         var4.break_("Color", ((rxL_2)var3.getRight()).break_());
         var1.add(var4);
      }

      return var1;
   }
}
