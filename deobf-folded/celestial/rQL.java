package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQL implements rQz_1 {
   final Xh_1 id_class;

   public rQL(Xh_1 var1) {
      this.id_class = var1;
   }

   public boolean id_class(rzr_3 var1) {
      rdn_3 var2 = var1.id_break(rzQ_2.id_implements);
      return var2 != null && this.id_class.id_class(var2);
   }

   public static rQQ id_class(XX var0) {
      return () -> new rQL(var0.id_break());
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_implements);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_implements;
   }
}
