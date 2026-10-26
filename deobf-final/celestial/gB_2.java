package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class gB_2 {
   String class_;
   private final List<String> break_ = Lists.newArrayList();

   gB_2() {
   }

   @Override
   public String toString() {
      if (this.class_ != null) {
         return this.break_.isEmpty() ? this.class_ : this.class_ + " " + this.class_();
      } else {
         return this.break_.isEmpty() ? "(Unknown file)" : "(Unknown file) " + this.class_();
      }
   }

   void class_(String var1) {
      this.break_.add(0, var1);
   }

   public String class_() {
      return StringUtils.join(this.break_, "->");
   }
}
