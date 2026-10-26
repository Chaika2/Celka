package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rQG implements rQQ {
   private final List<rQz_1> class_ = Lists.newArrayList();

   public rQG(rQQ... var1) {
      for (rQQ var5 : var1) {
         this.class_.add(var5.build());
      }
   }

   @Override
   public rQG class_(rQQ var1) {
      this.class_.add(var1.build());
      return this;
   }

   @Override
   public rQz_1 build() {
      return new rQE(this.class_.toArray(new rQz_1[0]));
   }
}
