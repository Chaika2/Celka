package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSn_1 extends rrSL<rrSQ> {
   public rrSn_1(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(Random var1, rrSQ var2, rfH_2 var3) {
      int var4 = var1.nextInt(16) + var3.b_();
      int var5 = var1.nextInt(16) + var3.d_();
      int var6 = var3.c_();
      return Stream.of(new rfH_2(var4, var6, var5));
   }
}
