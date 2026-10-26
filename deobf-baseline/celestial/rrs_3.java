package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rrs_3 extends rrr_3<is_3> {
   protected void id_class(rrEm_1 var1, is_3 var2) {
      iZ_2 var3 = var2.SF();
      List var4 = var1.id_class(rsE_2.class, var2.rN().id_byte(8.0, 4.0, 8.0), var0 -> true);
      var4.sort(Comparator.comparingDouble(var2::id_int));
      Optional var5 = var4.stream()
         .filter(var1x -> var2.id_implements(var1x.id_protected()))
         .filter(var1x -> var1x.id_class(var2, 9.0))
         .filter(var2::id_while)
         .findFirst();
      var3.id_class(il_3.id_static, var5);
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_static);
   }
}
