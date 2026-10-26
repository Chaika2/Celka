package celestial;

import java.util.HashSet;
import java.util.Set;

public enum vs_3 {
   INSTANCE;

   private final Set<rrvs_1> focusables = new HashSet<>();

   public Set<rrvs_1> byte_() {
      return this.focusables;
   }

   public void class_() {
      this.focusables.clear();
   }

   public void class_(rrvs_1 var1) {
      this.focusables.add(var1);
   }

   public void break_(rrvs_1 var1) {
      this.focusables.remove(var1);
   }

   public boolean break_() {
      for (rrvs_1 var2 : this.focusables) {
         if (var2.aO_()) {
            return true;
         }
      }

      return false;
   }
}
