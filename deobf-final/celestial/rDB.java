package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDB extends rKi_1 {
   public static final Codec<rDB> class_ = Codec.unit(() -> rDB.byte_);
   public static final rDB byte_ = new rDB();
   private static final xc_3[] protected_ = new xc_3[]{xu_3.rA.continue_(), xu_3.rL.continue_(), xu_3.rC.continue_(), xu_3.rn.continue_()};
   private static final xc_3[] throws_ = new xc_3[]{xu_3.rm.continue_(), xu_3.rF.continue_(), xu_3.rl.continue_(), xu_3.rH.continue_()};

   @Override
   protected rDr_1<?> class_() {
      return rDr_1.byte_;
   }

   @Override
   public xc_3 class_(Random var1, rfH_2 var2) {
      double var3 = rYG.case_.class_((double)var2.b_() / 200.0, (double)var2.d_() / 200.0, false);
      if (var3 < -0.8) {
         return rqR_2.class_(protected_, var1);
      } else {
         return var1.nextInt(3) > 0 ? rqR_2.class_(throws_, var1) : xu_3.ru.continue_();
      }
   }
}
