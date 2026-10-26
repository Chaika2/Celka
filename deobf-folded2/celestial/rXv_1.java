package celestial;

import java.util.Collections;

public interface rXv_1 {
   rkw_3<?> id_byte();

   default boolean id_class(rYB var1, rhN_2 var2, rkw_3<?> var3) {
      if (!var3.id_implements() && var1.B().id_break(rRu_1.id_else) && !var2.id_float().id_break(var3)) {
         return false;
      } else {
         this.id_class(var3);
         return true;
      }
   }

   default void id_class(rhd_3 var1) {
      rkw_3 var2 = this.id_byte();
      if (var2 != null && !var2.id_implements()) {
         var1.id_break(Collections.singleton(var2));
         this.id_class((rkw_3<?>)null);
      }
   }

   void id_class(rkw_3<?> var1);
}
