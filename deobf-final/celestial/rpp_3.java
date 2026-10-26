package celestial;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class rpp_3 implements Keyable {
   rpp_3(rpH_2[] var1) {
      this.class_ = var1;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return var1.compressMaps()
         ? IntStream.range(0, this.class_.length).mapToObj(var1::createInt)
         : Arrays.stream(this.class_).map(rpH_2::class_).map(var1::createString);
   }
}
