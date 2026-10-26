package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQM implements rQz_1 {
   final xd_3 class_;
   final JS break_;

   rQM(xd_3 var1, JS var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rzr_3 var1) {
      xc_3 var2 = var1.break_(rzQ_2.catch_);
      return var2 != null && this.class_ == var2.break_() && this.break_.class_(var2);
   }

   public static rQO class_(xd_3 var0) {
      return new rQO(var0);
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.catch_);
   }

   @Override
   public rWi_1 break_() {
      return rQF.private_;
   }
}
