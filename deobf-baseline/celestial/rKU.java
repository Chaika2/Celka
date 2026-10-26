package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rKU extends rKY {
   public static final Codec<rKU> id_break = Codec.unit(() -> rKU.id_byte);
   public static final rKU id_byte = new rKU();

   @Override
   protected rKo_1<?> id_class() {
      return rKo_1.id_class;
   }

   @Override
   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      var1.id_class(var2, var3, 2);
   }
}
