package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBU extends rrSL<rrSH> {
   public rrBU(Codec<rrSH> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(Random var1, rrSH var2, rfH_2 var3) {
      double var4 = rYG.case_.class_((double)var3.b_() / var2.byte_, (double)var3.d_() / var2.byte_, false);
      int var6 = (int)Math.ceil((var4 + var2.protected_) * (double)var2.break_);
      return IntStream.range(0, var6).mapToObj(var1x -> var3);
   }
}
