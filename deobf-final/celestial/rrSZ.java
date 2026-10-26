package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSZ extends rrSL<rrSl_1> {
   public rrSZ(Codec<rrSl_1> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(Random var1, rrSl_1 var2, rfH_2 var3) {
      int var4 = var3.b_();
      int var5 = var3.d_();
      int var6 = var1.nextInt(var2.protected_ - var2.byte_) + var2.break_;
      return Stream.of(new rfH_2(var4, var6, var5));
   }
}
