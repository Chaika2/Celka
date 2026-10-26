package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class iD_2 extends rrr_3<iB_2> {
   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      rfl_3 var3 = var2.rN().id_byte(16.0, 16.0, 16.0);
      List var4 = var1.id_class(iB_2.class, var3, var1x -> var1x != var2 && var1x.BM());
      var4.sort(Comparator.comparingDouble(var2::id_int));
      iZ_2 var5 = var2.SF();
      var5.id_class(il_3.id_catch, var4);
      var5.id_class(il_3.id_private, var4.stream().filter(var1x -> id_class(var2, var1x)).collect(Collectors.toList()));
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_catch, il_3.id_private);
   }
}
