package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBi_1 extends rrSO<rrSQ> {
   public rrBi_1(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rrSQ var3, rfH_2 var4) {
      return IntStream.range(0, 16).mapToObj(var5 -> {
         int var6 = var5 / 4;
         int var7 = var5 % 4;
         int var8 = var6 * 4 + 1 + var2.nextInt(3) + var4.b_();
         int var9 = var7 * 4 + 1 + var2.nextInt(3) + var4.d_();
         int var10 = var1.id_class(this.id_class(var3), var8, var9);
         return new rfH_2(var8, var10, var9);
      });
   }

   protected rKv_1 id_class(rrSQ var1) {
      return rKv_1.MOTION_BLOCKING;
   }
}
