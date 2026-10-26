package celestial;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class rUb_1 extends CacheLoader<Long, List<rUG>> {
   public List<rUG> id_class(Long var1) {
      List var2 = IntStream.range(0, 10).boxed().collect(Collectors.toList());
      Collections.shuffle(var2, new Random(var1));
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < 10; var4++) {
         int var5 = rfU_2.id_byte(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)var4)));
         int var6 = rfU_2.id_byte(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)var4)));
         int var7 = (Integer)var2.get(var4);
         int var8 = 2 + var7 / 3;
         int var9 = 76 + var7 * 3;
         boolean var10 = var7 == 1 || var7 == 2;
         var3.add(new rUG(var5, var6, var8, var9, var10));
      }

      return var3;
   }
}
