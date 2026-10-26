package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class ih_3 {
   private final is_3 id_class;
   private final List<an_3> id_break = Lists.newArrayList();
   private final List<an_3> id_byte = Lists.newArrayList();

   public ih_3(is_3 var1) {
      this.id_class = var1;
   }

   public void id_class() {
      this.id_break.clear();
      this.id_byte.clear();
   }

   public boolean id_class(an_3 var1) {
      if (this.id_break.contains(var1)) {
         return true;
      } else if (this.id_byte.contains(var1)) {
         return false;
      } else {
         boolean var2 = this.id_class.id_while(var1);
         if (var2) {
            this.id_break.add(var1);
         } else {
            this.id_byte.add(var1);
         }

         return var2;
      }
   }
}
