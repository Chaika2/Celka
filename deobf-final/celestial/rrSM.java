package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrSM extends rrSL<rrSQ> {
   public rrSM(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(Random var1, rrSQ var2, rfH_2 var3) {
      int var4 = 3 + var1.nextInt(6);
      return IntStream.range(0, var4).mapToObj(var2x -> {
         int var3x = var1.nextInt(16) + var3.b_();
         int var4x = var1.nextInt(16) + var3.d_();
         int var5 = var1.nextInt(28) + 4;
         return new rfH_2(var3x, var5, var4x);
      });
   }
}
