package celestial;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBV extends rrSu_1<rrBg_1> {
   public rrBV(Codec<rrBg_1> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(reX_2 var1, Random var2, rrBg_1 var3, rfH_2 var4) {
      rfj_3 var5 = new rfj_3(var4);
      BitSet var6 = var1.class_(var5, var3.break_);
      return IntStream.range(0, var6.length()).filter(var3x -> var6.get(var3x) && var2.nextFloat() < var3.byte_).mapToObj(var1x -> {
         int var2x = var1x & 15;
         int var3x = var1x >> 4 & 15;
         int var4x = var1x >> 8;
         return new rfH_2(var5.break_() + var2x, var4x, var5.byte_() + var3x);
      });
   }
}
