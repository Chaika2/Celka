package celestial;

import java.util.List;
import java.util.Random;

public class rTE {
   public static <T extends rTG> T class_(Random var0, List<T> var1) {
      return class_(var0, var1, class_(var1));
   }

   public static <T extends rTG> T class_(List<T> var0, int var1) {
      int var2 = 0;

      for (int var3 = var0.size(); var2 < var3; var2++) {
         rTG var4 = (rTG)var0.get(var2);
         var1 -= var4.byte_;
         if (var1 < 0) {
            return (T)var4;
         }
      }

      return null;
   }

   public static <T extends rTG> T class_(Random var0, List<T> var1, int var2) {
      if (var2 <= 0) {
         throw (IllegalArgumentException)rqR_2.byte_(new IllegalArgumentException());
      } else {
         int var3 = var0.nextInt(var2);
         return class_(var1, var3);
      }
   }

   public static int class_(List<? extends rTG> var0) {
      int var1 = 0;
      int var2 = 0;

      for (int var3 = var0.size(); var2 < var3; var2++) {
         rTG var4 = (rTG)var0.get(var2);
         var1 += var4.byte_;
      }

      return var1;
   }
}
