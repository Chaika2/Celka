package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSW extends rrSu_1<rrBR> {
   public rrSW(Codec<rrBR> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(reX_2 var1, Random var2, rrBR var3, rfH_2 var4) {
      if (var2.nextInt(var3.break_) == 0) {
         int var5 = var2.nextInt(16) + var4.b_();
         int var6 = var2.nextInt(16) + var4.d_();
         int var7 = var2.nextInt(var1.class_());
         return Stream.of(new rfH_2(var5, var7, var6));
      } else {
         return Stream.empty();
      }
   }
}
