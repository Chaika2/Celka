package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSs_1 extends rrSu_1<rrSQ> {
   public rrSs_1(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rrSQ var3, rfH_2 var4) {
      if (var2.nextInt(700) == 0) {
         int var5 = var2.nextInt(16) + var4.b_();
         int var6 = var2.nextInt(16) + var4.d_();
         int var7 = var1.id_class(rKv_1.MOTION_BLOCKING, var5, var6);
         if (var7 > 0) {
            int var8 = var7 + 3 + var2.nextInt(7);
            return Stream.of(new rfH_2(var5, var8, var6));
         }
      }

      return Stream.empty();
   }
}
