package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class rHG {
   private final List<Pair<rHE, rxL_2>> id_class = Lists.newArrayList();

   public rHG id_class(rHE var1, rxL_2 var2) {
      this.id_class.add(Pair.of(var1, var2));
      return this;
   }

   public rcy_3 id_class() {
      rcy_3 var1 = new rcy_3();

      for (Pair var3 : this.id_class) {
         rcd_3 var4 = new rcd_3();
         var4.id_class("Pattern", ((rHE)var3.getLeft()).hashname);
         var4.id_break("Color", ((rxL_2)var3.getRight()).id_break());
         var1.add(var4);
      }

      return var1;
   }
}
