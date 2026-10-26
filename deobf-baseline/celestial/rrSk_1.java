package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSk_1 extends rrSu_1<rrBR> {
   public rrSk_1(Codec<rrBR> var1) {
      super(var1);
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rrBR var3, rfH_2 var4) {
      if (var2.nextInt(var3.id_break / 10) == 0) {
         int var5 = var2.nextInt(16) + var4.b_();
         int var6 = var2.nextInt(16) + var4.d_();
         int var7 = var2.nextInt(var2.nextInt(var1.id_class() - 8) + 8);
         if (var7 < var1.id_break() || var2.nextInt(var3.id_break / 8) == 0) {
            return Stream.of(new rfH_2(var5, var7, var6));
         }
      }

      return Stream.empty();
   }
}
