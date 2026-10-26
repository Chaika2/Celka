package celestial;

import java.util.Random;

public class Qu_1 extends QZ {
   @Override
   protected rDg_1<rDv_1, ?> id_class(Random var1, boolean var2) {
      if (var1.nextInt(10) == 0) {
         return var2 ? rUx_1.Ph : rUx_1.rK;
      } else {
         return var2 ? rUx_1.Ps : rUx_1.rf;
      }
   }
}
