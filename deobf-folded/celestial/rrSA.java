package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSA extends rrSu_1<rrSQ> {
   public rrSA(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rrSQ var3, rfH_2 var4) {
      int var5 = var2.nextInt(var4.c_() + 32);
      return Stream.of(new rfH_2(var4.b_(), var5, var4.d_()));
   }
}
