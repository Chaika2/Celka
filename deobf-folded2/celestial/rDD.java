package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class rDD extends rDo_1 {
   public rDD(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   protected boolean id_class(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfw_3 var5 = var3.id_new();
      int var6 = var2.nextInt(3) + 1;

      for (int var7 = 0; var7 < var6; var7++) {
         if (!this.id_break(var1, var2, var5, var4)) {
            return true;
         }

         var5.id_class(rpr_3.UP);
      }

      rfH_2 var15 = var5.id_int();
      int var8 = var2.nextInt(3) + 2;
      ArrayList var9 = Lists.newArrayList(rpb_3.HORIZONTAL);
      Collections.shuffle(var9, var2);

      for (rpr_3 var11 : var9.subList(0, var8)) {
         var5.id_class(var15);
         var5.id_class(var11);
         int var12 = var2.nextInt(5) + 2;
         int var13 = 0;

         for (int var14 = 0; var14 < var12 && this.id_break(var1, var2, var5, var4); var14++) {
            var13++;
            var5.id_class(rpr_3.UP);
            if (var14 == 0 || var13 >= 2 && var2.nextFloat() < 0.25F) {
               var5.id_class(var11);
               var13 = 0;
            }
         }
      }

      return true;
   }
}
