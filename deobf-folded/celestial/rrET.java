package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rrET {
   private final List<rrEt_1> id_class = Lists.newArrayList();

   public void id_class(rfH_2 var1, double var2) {
      if (var2 != 0.0) {
         this.id_class.add(new rrEt_1(var1, var2));
      }
   }

   public double id_break(rfH_2 var1, double var2) {
      if (var2 == 0.0) {
         return 0.0;
      } else {
         double var4 = 0.0;

         for (rrEt_1 var7 : this.id_class) {
            var4 += var7.id_class(var1);
         }

         return var4 * var2;
      }
   }
}
