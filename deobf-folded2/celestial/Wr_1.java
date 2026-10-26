package celestial;

import java.util.Random;

public class Wr_1 {
   public static boolean id_class(xc_3 var0) {
      return var0.id_catch();
   }

   public static int id_class(Random var0) {
      double var1 = 1.0;

      int var3;
      for (var3 = 0; var0.nextDouble() < var1; var3++) {
         var1 *= 0.826;
      }

      return var3;
   }
}
