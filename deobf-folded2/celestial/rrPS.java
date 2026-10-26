package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPS extends rrPc_1 {
   public static final Codec<rrPS> id_class = Codec.unit(() -> rrPS.id_break);
   public static final rrPS id_break = new rrPS();

   private rrPS() {
   }

   @Override
   public boolean id_class(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4) {
      return true;
   }

   @Override
   protected rrPX<?> id_class() {
      return rrPX.id_class;
   }
}
