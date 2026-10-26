package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrSb_1 extends rrSL<rUJ> {
   public rrSb_1(Codec<rUJ> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rUJ var2, rfH_2 var3) {
      return IntStream.range(0, var1.nextInt(var1.nextInt(var2.id_break().id_class(var1)) + 1)).mapToObj(var2x -> {
         int var3x = var1.nextInt(16) + var3.b_();
         int var4 = var1.nextInt(16) + var3.d_();
         int var5 = var1.nextInt(120) + 4;
         return new rfH_2(var3x, var5, var4);
      });
   }
}
