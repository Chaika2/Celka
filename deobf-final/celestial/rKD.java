package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rKD extends rKY {
   public static final Codec<rKD> break_ = Codec.unit(() -> rKD.byte_);
   public static final rKD byte_ = new rKD();

   @Override
   protected rKo_1<?> class_() {
      return rKo_1.break_;
   }

   @Override
   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      ((du_3)var3.break_()).class_(var1, var2, 2);
   }
}
