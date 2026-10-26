package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSz_1 extends rrSu_1<rrSQ> {
   public rrSz_1(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rrSQ var3, rfH_2 var4) {
      int var5 = var1.id_break();
      int var6 = var5 - 5 + var2.nextInt(10);
      return Stream.of(new rfH_2(var4.b_(), var6, var4.d_()));
   }
}
