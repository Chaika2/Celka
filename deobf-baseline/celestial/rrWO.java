package celestial;

import java.util.Set;

public class rrWO {
   public static boolean id_class(Set var0, Set var1) {
      return !id_break(var0, var1);
   }

   public static boolean id_break(Set var0, Set var1) {
      if (!var0.isEmpty() && !var1.isEmpty()) {
         if (var1.size() < var0.size()) {
            Set var2 = var0;
            var0 = var1;
            var1 = var2;
         }

         for (Object var3 : var0) {
            if (var1.contains(var3)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
