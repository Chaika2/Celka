package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Random;
import java.util.Set;

public class rQq_1 implements rQz_1 {
   static final rQq_1 class_ = new rQq_1();

   public static rQQ byte_() {
      return () -> class_;
   }

   private rQq_1() {
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.finally_);
   }

   public boolean class_(rzr_3 var1) {
      Float var2 = var1.break_(rzQ_2.finally_);
      if (var2 != null) {
         Random var3 = var1.class_();
         float var4 = 1.0F / var2;
         return var3.nextFloat() <= var4;
      } else {
         return true;
      }
   }

   @Override
   public rWi_1 break_() {
      return rQF.extends_;
   }
}
