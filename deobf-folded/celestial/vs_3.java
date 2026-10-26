package celestial;

import java.util.HashSet;
import java.util.Set;

public enum vs_3 {
   INSTANCE;

   private final Set<rrvs_1> focusables = new HashSet<>();

   public Set<rrvs_1> id_byte() {
      return this.focusables;
   }

   public void id_class() {
      this.focusables.clear();
   }

   public void id_class(rrvs_1 var1) {
      this.focusables.add(var1);
   }

   public void id_break(rrvs_1 var1) {
      this.focusables.remove(var1);
   }

   public boolean id_break() {
      for (rrvs_1 var2 : this.focusables) {
         if (var2.aO_()) {
            return true;
         }
      }

      return false;
   }
}
