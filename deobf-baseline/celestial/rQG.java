package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rQG implements rQQ {
   private final List<rQz_1> id_class = Lists.newArrayList();

   public rQG(rQQ... var1) {
      for (rQQ var5 : var1) {
         this.id_class.add(var5.build());
      }
   }

   @Override
   public rQG id_class(rQQ var1) {
      this.id_class.add(var1.build());
      return this;
   }

   @Override
   public rQz_1 build() {
      return new rQE(this.id_class.toArray(new rQz_1[0]));
   }
}
