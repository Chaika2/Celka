package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSk_1 extends rrSu_1<rrBR> {
   public rrSk_1(Codec<rrBR> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(reX_2 var1, Random var2, rrBR var3, rfH_2 var4) {
      if (var2.nextInt(var3.break_ / 10) == 0) {
         int var5 = var2.nextInt(16) + var4.b_();
         int var6 = var2.nextInt(16) + var4.d_();
         int var7 = var2.nextInt(var2.nextInt(var1.class_() - 8) + 8);
         if (var7 < var1.break_() || var2.nextInt(var3.break_ / 8) == 0) {
            return Stream.of(new rfH_2(var5, var7, var6));
         }
      }

      return Stream.empty();
   }
}
