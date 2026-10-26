package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class iU_2 extends rrr_3<iB_2> {
   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      List var3 = var1.id_continue()
         .stream()
         .filter(rpJ_2.id_catch)
         .filter(var1x -> var2.id_class(var1x, 16.0))
         .sorted(Comparator.comparingDouble(var2::id_int))
         .collect(Collectors.toList());
      iZ_2 var4 = var2.SF();
      var4.id_class(il_3.id_finally, var3);
      List var5 = var3.stream().filter(var1x -> id_class(var2, (iB_2)var1x)).collect(Collectors.toList());
      var4.id_class(il_3.id_extends, var5.isEmpty() ? null : (rhd_3)var5.get(0));
      Optional var6 = var5.stream().filter(rpJ_2.id_case).findFirst();
      var4.id_class(il_3.id_native, var6);
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_finally, il_3.id_extends, il_3.id_native);
   }
}
