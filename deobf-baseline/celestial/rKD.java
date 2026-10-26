package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rKD extends rKY {
   public static final Codec<rKD> id_break = Codec.unit(() -> rKD.id_byte);
   public static final rKD id_byte = new rKD();

   @Override
   protected rKo_1<?> id_class() {
      return rKo_1.id_break;
   }

   @Override
   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      ((du_3)var3.id_break()).id_class(var1, var2, 2);
   }
}
