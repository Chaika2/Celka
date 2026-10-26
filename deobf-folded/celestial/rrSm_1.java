package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSm_1 extends rrSL<rrSl_1> {
   public rrSm_1(Codec<rrSl_1> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rrSl_1 var2, rfH_2 var3) {
      int var4 = var3.b_();
      int var5 = var3.d_();
      int var6 = var1.nextInt(var1.nextInt(var2.id_protected - var2.id_byte) + var2.id_break);
      return Stream.of(new rfH_2(var4, var6, var5));
   }
}
