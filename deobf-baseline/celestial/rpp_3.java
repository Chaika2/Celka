package celestial;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class rpp_3 implements Keyable {
   rpp_3(rpH_2[] var1) {
      this.id_class = var1;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return var1.compressMaps()
         ? IntStream.range(0, this.id_class.length).mapToObj(var1::createInt)
         : Arrays.stream(this.id_class).map(rpH_2::id_class).map(var1::createString);
   }
}
