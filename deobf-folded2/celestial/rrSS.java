package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSS extends rrSL<rrSB> {
   public rrSS(Codec<rrSB> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(Random var1, rrSB var2, rfH_2 var3) {
      int var4 = var2.id_break;
      int var5 = var2.id_byte;
      int var6 = var3.b_();
      int var7 = var3.d_();
      int var8 = var1.nextInt(var5) + var1.nextInt(var5) - var5 + var4;
      return Stream.of(new rfH_2(var6, var8, var7));
   }
}
