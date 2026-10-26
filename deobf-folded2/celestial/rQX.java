package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQX implements rQz_1 {
   final hn_3 id_class;

   rQX(hn_3 var1) {
      this.id_class = var1;
   }

   public boolean id_class(rzr_3 var1) {
      rye_3 var2 = var1.id_break(rzQ_2.id_byte);
      rjU_2 var3 = var1.id_break(rzQ_2.id_case);
      return var3 != null && var2 != null && this.id_class.id_class(var1.id_byte(), var3, var2);
   }

   public static rQQ id_class(hC_2 var0) {
      return () -> new rQX(var0.id_break());
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_case, rzQ_2.id_byte);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_native;
   }
}
