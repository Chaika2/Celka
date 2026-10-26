package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class ih_3 {
   private final is_3 class_;
   private final List<an_3> break_ = Lists.newArrayList();
   private final List<an_3> byte_ = Lists.newArrayList();

   public ih_3(is_3 var1) {
      this.class_ = var1;
   }

   public void class_() {
      this.break_.clear();
      this.byte_.clear();
   }

   public boolean class_(an_3 var1) {
      if (this.break_.contains(var1)) {
         return true;
      } else if (this.byte_.contains(var1)) {
         return false;
      } else {
         boolean var2 = this.class_.while_(var1);
         if (var2) {
            this.break_.add(var1);
         } else {
            this.byte_.add(var1);
         }

         return var2;
      }
   }
}
