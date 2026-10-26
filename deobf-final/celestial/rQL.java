package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQL implements rQz_1 {
   final Xh_1 class_;

   public rQL(Xh_1 var1) {
      this.class_ = var1;
   }

   public boolean class_(rzr_3 var1) {
      rdn_3 var2 = var1.break_(rzQ_2.implements_);
      return var2 != null && this.class_.class_(var2);
   }

   public static rQQ class_(XX var0) {
      return () -> new rQL(var0.break_());
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.implements_);
   }

   @Override
   public rWi_1 break_() {
      return rQF.implements_;
   }
}
