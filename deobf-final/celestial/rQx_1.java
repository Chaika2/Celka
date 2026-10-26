package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQx_1 implements rQz_1 {
   final hY_2 class_;
   final rzB_2 break_;

   rQx_1(hY_2 var1, rzB_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public static rQQ class_(rzB_2 var0, hK_2 var1) {
      return () -> new rQx_1(var1.break_(), var0);
   }

   public static rQQ class_(rzB_2 var0, hY_2 var1) {
      return () -> new rQx_1(var1, var0);
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.case_, this.break_.class_());
   }

   public boolean class_(rzr_3 var1) {
      an_3 var2 = var1.break_(this.break_.class_());
      rjU_2 var3 = var1.break_(rzQ_2.case_);
      return this.class_.class_(var1.byte_(), var3, var2);
   }

   public static rQQ class_(rzB_2 var0) {
      return class_(var0, hK_2.class_());
   }

   @Override
   public rWi_1 break_() {
      return rQF.throws_;
   }
}
