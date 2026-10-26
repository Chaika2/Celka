package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSX<DC extends rrSx_1> extends rrSO<DC> {
   public rrSX(Codec<DC> var1) {
      super(var1);
   }

   @Override
   protected rKv_1 class_(DC var1) {
      return rKv_1.MOTION_BLOCKING;
   }

   @Override
   public Stream<rfH_2> class_(reX_2 var1, Random var2, DC var3, rfH_2 var4) {
      int var5 = var4.b_();
      int var6 = var4.d_();
      int var7 = var1.class_(this.class_((DC)var3), var5, var6);
      return var7 == 0 ? Stream.of() : Stream.of(new rfH_2(var5, var2.nextInt(var7 * 2), var6));
   }
}
