package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class rrSG extends rrSL<rUJ> {
   public rrSG(Codec<rUJ> var1) {
      super(var1);
   }

   public Stream<rfH_2> class_(Random var1, rUJ var2, rfH_2 var3) {
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < var1.nextInt(var1.nextInt(var2.break_().class_(var1)) + 1) + 1; var5++) {
         int var6 = var1.nextInt(16) + var3.b_();
         int var7 = var1.nextInt(16) + var3.d_();
         int var8 = var1.nextInt(120) + 4;
         var4.add(new rfH_2(var6, var8, var7));
      }

      return var4.stream();
   }
}
