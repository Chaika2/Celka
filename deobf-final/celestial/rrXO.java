package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public class rrXO {
   public static Iq_1 class_(Iterator<Iq_1> var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return null;
      } else {
         for (int var2 = 0; var2 < var1; var2++) {
            if (!var0.hasNext()) {
               return null;
            }

            Iq_1 var3 = (Iq_1)var0.next();
         }

         return !var0.hasNext() ? null : (Iq_1)var0.next();
      }
   }

   public static Iq_1 class_(ImmutableList<Iq_1> var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var1 < 0) {
         return null;
      } else {
         return var1 >= var0.size() ? null : (Iq_1)var0.get(var1);
      }
   }
}
