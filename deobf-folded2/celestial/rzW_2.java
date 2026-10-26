package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rzW_2 {
   private final Set<rzd_3<?>> id_class = Sets.newIdentityHashSet();
   private final Set<rzd_3<?>> id_break = Sets.newIdentityHashSet();

   public rzk_3 id_class() {
      return new rzk_3(this.id_class, this.id_break);
   }

   public rzW_2 id_class(rzd_3<?> var1) {
      if (this.id_break.contains(var1)) {
         throw new IllegalArgumentException("Parameter " + var1.id_class() + " is already optional");
      } else {
         this.id_class.add(var1);
         return this;
      }
   }

   public rzW_2 id_break(rzd_3<?> var1) {
      if (this.id_class.contains(var1)) {
         throw new IllegalArgumentException("Parameter " + var1.id_class() + " is already required");
      } else {
         this.id_break.add(var1);
         return this;
      }
   }
}
