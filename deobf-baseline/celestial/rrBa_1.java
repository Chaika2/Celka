package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBa_1 extends rrSL<rUJ> {
   public rrBa_1(Codec<rUJ> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rUJ var2, rfH_2 var3) {
      return IntStream.range(0, var2.id_break().id_class(var1)).mapToObj(var1x -> var3);
   }
}
