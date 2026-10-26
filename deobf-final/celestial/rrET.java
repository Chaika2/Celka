package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rrET {
   private final List<rrEt_1> class_ = Lists.newArrayList();

   public void class_(rfH_2 var1, double var2) {
      if (var2 != 0.0) {
         this.class_.add(new rrEt_1(var1, var2));
      }
   }

   public double break_(rfH_2 var1, double var2) {
      if (var2 == 0.0) {
         return 0.0;
      } else {
         double var4 = 0.0;

         for (rrEt_1 var7 : this.class_) {
            var4 += var7.class_(var1);
         }

         return var4 * var2;
      }
   }
}
