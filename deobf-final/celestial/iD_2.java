package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class iD_2 extends rrr_3<iB_2> {
   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      rfl_3 var3 = var2.rN().byte_(16.0, 16.0, 16.0);
      List var4 = var1.class_(iB_2.class, var3, var1x -> var1x != var2 && var1x.BM());
      var4.sort(Comparator.comparingDouble(var2::int_));
      iZ_2 var5 = var2.SF();
      var5.class_(il_3.catch_, var4);
      var5.class_(il_3.private_, var4.stream().filter(var1x -> class_(var2, var1x)).collect(Collectors.toList()));
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.catch_, il_3.private_);
   }
}
