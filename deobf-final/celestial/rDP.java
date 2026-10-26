package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDP extends rKi_1 {
   public static final Codec<rDP> class_ = Codec.unit(() -> rDP.byte_);
   private static final xc_3[] protected_ = new xc_3[]{
      xu_3.ru.continue_(),
      xu_3.rm.continue_(),
      xu_3.rv.continue_(),
      xu_3.rF.continue_(),
      xu_3.rL.continue_(),
      xu_3.rA.continue_(),
      xu_3.rn.continue_(),
      xu_3.rC.continue_(),
      xu_3.rl.continue_(),
      xu_3.rH.continue_(),
      xu_3.rp.continue_()
   };
   public static final rDP byte_ = new rDP();

   @Override
   protected rDr_1<?> class_() {
      return rDr_1.protected_;
   }

   @Override
   public xc_3 class_(Random var1, rfH_2 var2) {
      double var3 = rfU_2.class_((1.0 + rYG.case_.class_((double)var2.b_() / 48.0, (double)var2.d_() / 48.0, false)) / 2.0, 0.0, 0.9999);
      return protected_[(int)(var3 * (double)protected_.length)];
   }
}
