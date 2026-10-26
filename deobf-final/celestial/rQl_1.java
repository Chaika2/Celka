package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQl_1 implements rQz_1 {
   final float class_;
   final float break_;

   rQl_1(float var1, float var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rzr_3 var1) {
      an_3 var2 = var1.break_(rzQ_2.protected_);
      int var3 = 0;
      if (var2 instanceof iB_2) {
         var3 = eA_2.catch_((iB_2)var2);
      }

      return var1.class_().nextFloat() < this.class_ + (float)var3 * this.break_;
   }

   public static rQQ class_(float var0, float var1) {
      return () -> new rQl_1(var0, var1);
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.protected_);
   }

   @Override
   public rWi_1 break_() {
      return rQF.protected_;
   }
}
