package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rgA_2 {
   private final List<rgS_2> class_ = Lists.newArrayList();

   public rgS_2 class_() {
      if (this.class_.isEmpty()) {
         return null;
      } else {
         return this.class_.size() == 1 ? this.class_.get(0) : rgS_2.class_(this.class_);
      }
   }

   public void class_(rgS_2 var1) {
      this.class_.add(var1);
   }

   public rgS_2 break_() {
      rgS_2 var1 = this.class_();
      return var1 != null ? var1 : rgS_2.break_;
   }
}
