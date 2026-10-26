package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSE extends rrSL<rrSQ> {
   public rrSE(Codec<rrSQ> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(Random var1, rrSQ var2, rfH_2 var3) {
      Stream var4 = Stream.empty();
      if (var1.nextInt(14) == 0) {
         var4 = Stream.concat(var4, Stream.of(var3.break_(var1.nextInt(16), 55 + var1.nextInt(16), var1.nextInt(16))));
         if (var1.nextInt(4) == 0) {
            var4 = Stream.concat(var4, Stream.of(var3.break_(var1.nextInt(16), 55 + var1.nextInt(16), var1.nextInt(16))));
         }

         return var4;
      } else {
         return Stream.empty();
      }
   }
}
