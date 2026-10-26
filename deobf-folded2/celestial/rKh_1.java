package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

enum rKh_1 {
   @Override
   public void id_class(rrEm_1 var1, rKG var2, List<rSa_1> var3, int var4, rfH_2 var5) {
      byte var6 = 40;
      boolean var7 = var4 % 40 == 0;
      boolean var8 = var4 % 40 == 39;
      if (var7 || var8) {
         List var9 = rUE.id_class(var1);
         int var10 = var4 / 40;
         if (var10 < var9.size()) {
            rUG var11 = (rUG)var9.get(var10);
            if (var7) {
               for (rSa_1 var13 : var3) {
                  var13.id_class(new rfH_2(var11.id_class(), var11.id_protected() + 1, var11.id_break()));
               }
            } else {
               byte var15 = 10;

               for (rfH_2 var14 : rfH_2.id_class(
                  new rfH_2(var11.id_class() - 10, var11.id_protected() - 10, var11.id_break() - 10),
                  new rfH_2(var11.id_class() + 10, var11.id_protected() + 10, var11.id_break() + 10)
               )) {
                  var1.id_class(var14, false);
               }

               var1.id_class(
                  (an_3)null,
                  (double)((float)var11.id_class() + 0.5F),
                  (double)var11.id_protected(),
                  (double)((float)var11.id_break() + 0.5F),
                  5.0F,
                  rRz_1.DESTROY
               );
               rUM var17 = new rUM(true, ImmutableList.of(var11), new rfH_2(0, 128, 0));
               rUO.id_instanceof
                  .id_break(var17)
                  .id_class(var1, var1.id_else().id_implements(), new Random(), new rfH_2(var11.id_class(), 45, var11.id_break()));
            }
         } else if (var7) {
            var2.id_class(SUMMONING_DRAGON);
         }
      }
   }
}
