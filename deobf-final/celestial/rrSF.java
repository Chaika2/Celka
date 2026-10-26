package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSF<DC extends rrSx_1> extends rrSO<DC> {
   public rrSF(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public Stream<rfH_2> class_(reX_2 var1, Random var2, DC var3, rfH_2 var4) {
      int var5 = var4.b_();
      int var6 = var4.d_();
      int var7 = var1.class_(this.class_((DC)var3), var5, var6);
      return var7 > 0 ? Stream.of(new rfH_2(var5, var7, var6)) : Stream.of();
   }
}
