package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rgA_2 {
   private final List<rgS_2> id_class = Lists.newArrayList();

   public rgS_2 id_class() {
      if (this.id_class.isEmpty()) {
         return null;
      } else {
         return this.id_class.size() == 1 ? this.id_class.get(0) : rgS_2.id_class(this.id_class);
      }
   }

   public void id_class(rgS_2 var1) {
      this.id_class.add(var1);
   }

   public rgS_2 id_break() {
      rgS_2 var1 = this.id_class();
      return var1 != null ? var1 : rgS_2.id_break;
   }
}
