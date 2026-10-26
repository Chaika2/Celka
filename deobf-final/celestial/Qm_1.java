package celestial;

import java.util.Random;

public class Qm_1 extends Qz_1 {
   @Override
   protected rDg_1<rDv_1, ?> class_(Random var1, boolean var2) {
      return rUx_1.rR;
   }

   @Override
   protected rDg_1<rDv_1, ?> class_(Random var1) {
      return var1.nextBoolean() ? rUx_1.re : rUx_1.ra;
   }
}
