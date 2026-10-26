package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBU extends rrSL<rrSH> {
   public rrBU(Codec<rrSH> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rrSH var2, rfH_2 var3) {
      double var4 = rYG.id_case.id_class((double)var3.b_() / var2.id_byte, (double)var3.d_() / var2.id_byte, false);
      int var6 = (int)Math.ceil((var4 + var2.id_protected) * (double)var2.id_break);
      return IntStream.range(0, var6).mapToObj(var1x -> var3);
   }
}
