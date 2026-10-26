package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class Ii_1 {
   private final List<fr_3> id_class = Lists.newArrayList();

   public Ii_1 id_class(IJ var1, int var2) {
      if (var1 != null) {
         this.id_class.add(new fr_3(var1, var2));
      }

      return this;
   }

   public IJ id_class() {
      if (this.id_class.isEmpty()) {
         return null;
      } else {
         return (IJ)(this.id_class.size() == 1 ? this.id_class.get(0).id_class : new Ia_1(this.id_class));
      }
   }
}
