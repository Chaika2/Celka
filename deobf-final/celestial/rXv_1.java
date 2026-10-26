package celestial;

import java.util.Collections;

public interface rXv_1 {
   rkw_3<?> byte_();

   default boolean class_(rYB var1, rhN_2 var2, rkw_3<?> var3) {
      if (!var3.implements_() && var1.B().break_(rRu_1.else_) && !var2.float_().break_(var3)) {
         return false;
      } else {
         this.class_(var3);
         return true;
      }
   }

   default void class_(rhd_3 var1) {
      rkw_3 var2 = this.byte_();
      if (var2 != null && !var2.implements_()) {
         var1.break_(Collections.singleton(var2));
         this.class_((rkw_3<?>)null);
      }
   }

   void class_(rkw_3<?> var1);
}
