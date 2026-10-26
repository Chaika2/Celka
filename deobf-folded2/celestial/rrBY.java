package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrBY extends rrSL<rrBR> {
   public rrBY(Codec<rrBR> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rrBR var2, rfH_2 var3) {
      return var1.nextFloat() < 1.0F / (float)var2.id_break ? Stream.of(var3) : Stream.empty();
   }
}
