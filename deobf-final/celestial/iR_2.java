package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class iR_2 extends rrr_3<rEg_1> {
   protected void class_(rrEm_1 var1, rEg_1 var2) {
      iZ_2 var3 = var2.SF();
      var3.class_(il_3.J, this.break_(var1, var2));
      Optional var4 = Optional.empty();
      int var5 = 0;
      ArrayList var6 = Lists.newArrayList();

      for (iB_2 var8 : var3.byte_(il_3.private_).orElse(Lists.newArrayList())) {
         if (var8 instanceof rbk_3 && !var8.n_()) {
            var5++;
            if (!var4.isPresent()) {
               var4 = Optional.of((rbk_3)var8);
            }
         }

         if (var8 instanceof rEg_1 && !var8.n_()) {
            var6.add((rEg_1)var8);
         }
      }

      var3.class_(il_3.G, var4);
      var3.class_(il_3.E, var6);
      var3.class_(il_3.M, var5);
      var3.class_(il_3.O, var6.size());
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.private_, il_3.J, il_3.G, il_3.E, il_3.M, il_3.O, new il_3[0]);
   }

   private Optional<rfH_2> break_(rrEm_1 var1, rEg_1 var2) {
      return rfH_2.class_(var2.Bs(), 8, 4, var1x -> var1.byte_(var1x).class_(rls_3.A));
   }
}
