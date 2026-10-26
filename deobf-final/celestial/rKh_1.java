package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

enum rKh_1 {
   ;
   @Override
   public void class_(rrEm_1 var1, rKG var2, List<rSa_1> var3, int var4, rfH_2 var5) {
      byte var6 = 40;
      boolean var7 = var4 % 40 == 0;
      boolean var8 = var4 % 40 == 39;
      if (var7 || var8) {
         List var9 = rUE.class_(var1);
         int var10 = var4 / 40;
         if (var10 < var9.size()) {
            rUG var11 = (rUG)var9.get(var10);
            if (var7) {
               for (rSa_1 var13 : var3) {
                  var13.class_(new rfH_2(var11.class_(), var11.protected_() + 1, var11.break_()));
               }
            } else {
               byte var15 = 10;

               for (rfH_2 var14 : rfH_2.class_(
                  new rfH_2(var11.class_() - 10, var11.protected_() - 10, var11.break_() - 10),
                  new rfH_2(var11.class_() + 10, var11.protected_() + 10, var11.break_() + 10)
               )) {
                  var1.class_(var14, false);
               }

               var1.class_(
                  (an_3)null, (double)((float)var11.class_() + 0.5F), (double)var11.protected_(), (double)((float)var11.break_() + 0.5F), 5.0F, rRz_1.DESTROY
               );
               rUM var17 = new rUM(true, ImmutableList.of(var11), new rfH_2(0, 128, 0));
               rUO.instanceof_.break_(var17).class_(var1, var1.else_().implements_(), new Random(), new rfH_2(var11.class_(), 45, var11.break_()));
            }
         } else if (var7) {
            var2.class_(SUMMONING_DRAGON);
         }
      }
   }
}
