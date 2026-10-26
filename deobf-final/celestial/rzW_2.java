package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rzW_2 {
   private final Set<rzd_3<?>> class_ = Sets.newIdentityHashSet();
   private final Set<rzd_3<?>> break_ = Sets.newIdentityHashSet();

   public rzk_3 class_() {
      return new rzk_3(this.class_, this.break_);
   }

   public rzW_2 class_(rzd_3<?> var1) {
      if (this.break_.contains(var1)) {
         throw new IllegalArgumentException("Parameter " + var1.class_() + " is already optional");
      } else {
         this.class_.add(var1);
         return this;
      }
   }

   public rzW_2 break_(rzd_3<?> var1) {
      if (this.class_.contains(var1)) {
         throw new IllegalArgumentException("Parameter " + var1.class_() + " is already required");
      } else {
         this.break_.add(var1);
         return this;
      }
   }
}
