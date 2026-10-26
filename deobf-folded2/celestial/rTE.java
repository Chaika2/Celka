package celestial;

import java.util.List;
import java.util.Random;

public class rTE {
   public static <T extends rTG> T id_class(Random var0, List<T> var1) {
      return id_class(var0, var1, id_class(var1));
   }

   public static <T extends rTG> T id_class(List<T> var0, int var1) {
      int var2 = 0;

      for (int var3 = var0.size(); var2 < var3; var2++) {
         rTG var4 = (rTG)var0.get(var2);
         var1 -= var4.id_byte;
         if (var1 < 0) {
            return (T)var4;
         }
      }

      return null;
   }

   public static <T extends rTG> T id_class(Random var0, List<T> var1, int var2) {
      if (var2 <= 0) {
         throw (IllegalArgumentException)rqR_2.id_byte(new IllegalArgumentException());
      } else {
         int var3 = var0.nextInt(var2);
         return id_class(var1, var3);
      }
   }

   public static int id_class(List<? extends rTG> var0) {
      int var1 = 0;
      int var2 = 0;

      for (int var3 = var0.size(); var2 < var3; var2++) {
         rTG var4 = (rTG)var0.get(var2);
         var1 += var4.id_byte;
      }

      return var1;
   }
}
