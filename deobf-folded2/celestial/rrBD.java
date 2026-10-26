package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class rrBD extends rrSu_1<rUJ> {
   public rrBD(Codec<rUJ> var1) {
      super(var1);
   }

   private static boolean id_class(xc_3 var0) {
      return var0.id_catch() || var0.id_class(xu_3.id_try) || var0.id_class(xu_3.id_instanceof);
   }

   private static int id_class(reX_2 var0, int var1, int var2, int var3, int var4) {
      rfw_3 var5 = new rfw_3(var1, var2, var3);
      int var6 = 0;
      xc_3 var7 = var0.id_class(var5);

      for (int var8 = var2; var8 >= 1; var8--) {
         var5.b_(var8 - 1);
         xc_3 var9 = var0.id_class(var5);
         if (!id_class(var9) && id_class(var7) && !var9.id_class(xu_3.id_while)) {
            if (var6 == var4) {
               return var5.c_() + 1;
            }

            var6++;
         }

         var7 = var9;
      }

      return Integer.MAX_VALUE;
   }

   public Stream<rfH_2> id_class(reX_2 var1, Random var2, rUJ var3, rfH_2 var4) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;

      boolean var7;
      do {
         var7 = false;

         for (int var8 = 0; var8 < var3.id_break().id_class(var2); var8++) {
            int var9 = var2.nextInt(16) + var4.b_();
            int var10 = var2.nextInt(16) + var4.d_();
            int var11 = var1.id_class(rKv_1.MOTION_BLOCKING, var9, var10);
            int var12 = id_class(var1, var9, var11, var10, var6);
            if (var12 != Integer.MAX_VALUE) {
               var5.add(new rfH_2(var9, var12, var10));
               var7 = true;
            }
         }

         var6++;
      } while (var7);

      return var5.stream();
   }
}
