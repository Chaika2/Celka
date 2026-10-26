package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQM implements rQz_1 {
   final xd_3 id_class;
   final JS id_break;

   rQM(xd_3 var1, JS var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(rzr_3 var1) {
      xc_3 var2 = var1.id_break(rzQ_2.id_catch);
      return var2 != null && this.id_class == var2.id_break() && this.id_break.id_class(var2);
   }

   public static rQO id_class(xd_3 var0) {
      return new rQO(var0);
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_catch);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_private;
   }
}
