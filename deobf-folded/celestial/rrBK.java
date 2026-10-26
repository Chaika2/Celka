package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBK extends rrSL<rrBj_1> {
   public rrBK(Codec<rrBj_1> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rrBj_1 var2, rfH_2 var3) {
      int var4 = var2.id_break + (var1.nextFloat() < var2.id_byte ? var2.id_protected : 0);
      return IntStream.range(0, var4).mapToObj(var1x -> var3);
   }
}
