package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class iU_2 extends rrr_3<iB_2> {
   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      List var3 = var1.continue_()
         .stream()
         .filter(rpJ_2.catch_)
         .filter(var1x -> var2.class_(var1x, 16.0))
         .sorted(Comparator.comparingDouble(var2::int_))
         .collect(Collectors.toList());
      iZ_2 var4 = var2.SF();
      var4.class_(il_3.finally_, var3);
      List var5 = var3.stream().filter(var1x -> class_(var2, (iB_2)var1x)).collect(Collectors.toList());
      var4.class_(il_3.extends_, var5.isEmpty() ? null : (rhd_3)var5.get(0));
      Optional var6 = var5.stream().filter(rpJ_2.case_).findFirst();
      var4.class_(il_3.native_, var6);
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.finally_, il_3.extends_, il_3.native_);
   }
}
