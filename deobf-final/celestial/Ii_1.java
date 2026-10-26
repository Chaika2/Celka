package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class Ii_1 {
   private final List<fr_3> class_ = Lists.newArrayList();

   public Ii_1 class_(IJ var1, int var2) {
      if (var1 != null) {
         this.class_.add(new fr_3(var1, var2));
      }

      return this;
   }

   public IJ class_() {
      if (this.class_.isEmpty()) {
         return null;
      } else {
         return (IJ)(this.class_.size() == 1 ? this.class_.get(0).class_ : new Ia_1(this.class_));
      }
   }
}
