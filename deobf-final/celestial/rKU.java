package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rKU extends rKY {
   public static final Codec<rKU> break_ = Codec.unit(() -> rKU.byte_);
   public static final rKU byte_ = new rKU();

   @Override
   protected rKo_1<?> class_() {
      return rKo_1.class_;
   }

   @Override
   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      var1.class_(var2, var3, 2);
   }
}
