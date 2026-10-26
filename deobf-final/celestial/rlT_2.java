package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;

public class rlT_2 {
   public static final rlT_2 class_ = new rlT_2();
   private final Collection<rle_3> break_ = Lists.newCopyOnWriteArrayList();

   public void class_(rle_3 var1) {
      this.break_.add(var1);
   }

   public void class_() {
      this.break_.clear();
   }

   public void break_() {
      this.break_.forEach(rle_3::break_);
      this.break_.removeIf(rle_3::implements_);
   }
}
