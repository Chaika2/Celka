package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQx_1 implements rQz_1 {
   final hY_2 id_class;
   final rzB_2 id_break;

   rQx_1(hY_2 var1, rzB_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public static rQQ id_class(rzB_2 var0, hK_2 var1) {
      return () -> new rQx_1(var1.id_break(), var0);
   }

   public static rQQ id_class(rzB_2 var0, hY_2 var1) {
      return () -> new rQx_1(var1, var0);
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_case, this.id_break.id_class());
   }

   public boolean id_class(rzr_3 var1) {
      an_3 var2 = var1.id_break(this.id_break.id_class());
      rjU_2 var3 = var1.id_break(rzQ_2.id_case);
      return this.id_class.id_class(var1.id_byte(), var3, var2);
   }

   public static rQQ id_class(rzB_2 var0) {
      return id_class(var0, hK_2.id_class());
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_throws;
   }
}
