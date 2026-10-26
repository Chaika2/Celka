package celestial;

import java.util.Random;

public class Wr_1 {
   public static boolean class_(xc_3 var0) {
      return var0.catch_();
   }

   public static int class_(Random var0) {
      double var1 = 1.0;

      int var3;
      for (var3 = 0; var0.nextDouble() < var1; var3++) {
         var1 *= 0.826;
      }

      return var3;
   }
}
