package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBe_1 extends rrSu_1<rrSN> {
   public rrBe_1(Codec<rrSN> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rrSN var3, rfH_2 var4) {
      double var5 = rYG.id_case.id_class((double)var4.b_() / 200.0, (double)var4.d_() / 200.0, false);
      int var7 = var5 < var3.id_break ? var3.id_byte : var3.id_protected;
      return IntStream.range(0, var7).mapToObj(var1x -> var4);
   }
}
