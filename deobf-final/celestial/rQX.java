package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQX implements rQz_1 {
   final hn_3 class_;

   rQX(hn_3 var1) {
      this.class_ = var1;
   }

   public boolean class_(rzr_3 var1) {
      rye_3 var2 = var1.break_(rzQ_2.byte_);
      rjU_2 var3 = var1.break_(rzQ_2.case_);
      return var3 != null && var2 != null && this.class_.class_(var1.byte_(), var3, var2);
   }

   public static rQQ class_(hC_2 var0) {
      return () -> new rQX(var0.break_());
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.case_, rzQ_2.byte_);
   }

   @Override
   public rWi_1 break_() {
      return rQF.native_;
   }
}
