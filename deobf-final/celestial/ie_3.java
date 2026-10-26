package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class ie_3 extends rrr_3<iB_2> {
   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.private_, il_3.import_, il_3.S);
   }

   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      iZ_2 var3 = var2.SF();
      Optional var4 = Optional.empty();
      ArrayList var5 = Lists.newArrayList();

      for (iB_2 var7 : var3.byte_(il_3.private_).orElse(ImmutableList.of())) {
         if (var7 instanceof rbr_3 || var7 instanceof rSN) {
            var4 = Optional.of((is_3)var7);
            break;
         }
      }

      for (iB_2 var9 : var3.byte_(il_3.catch_).orElse(ImmutableList.of())) {
         if (var9 instanceof rbM_2 && ((rbM_2)var9).sx()) {
            var5.add((rbM_2)var9);
         }
      }

      var3.class_(il_3.import_, var4);
      var3.class_(il_3.S, var5);
   }
}
