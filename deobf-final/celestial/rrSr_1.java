package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSr_1 extends rrSu_1<rrSP> {
   public rrSr_1(Codec<rrSP> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(reX_2 var1, Random var2, rrSP var3, rfH_2 var4) {
      return var3.class_().class_(var1, var2, var4).flatMap(var3x -> var3.break_().class_(var1, var2, var3x));
   }
}
