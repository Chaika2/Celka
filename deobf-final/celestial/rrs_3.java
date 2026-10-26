package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rrs_3 extends rrr_3<is_3> {
   protected void class_(rrEm_1 var1, is_3 var2) {
      iZ_2 var3 = var2.SF();
      List var4 = var1.class_(rsE_2.class, var2.rN().byte_(8.0, 4.0, 8.0), var0 -> true);
      var4.sort(Comparator.comparingDouble(var2::int_));
      Optional var5 = var4.stream()
         .filter(var1x -> var2.implements_(var1x.protected_()))
         .filter(var1x -> var1x.class_(var2, 9.0))
         .filter(var2::while_)
         .findFirst();
      var3.class_(il_3.static_, var5);
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.static_);
   }
}
