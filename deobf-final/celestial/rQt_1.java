package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQt_1 implements rQz_1 {
   final ev_3 class_;
   final float[] break_;

   rQt_1(ev_3 var1, float[] var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rzr_3 var1) {
      rdn_3 var2 = var1.break_(rzQ_2.implements_);
      int var3 = var2 != null ? eA_2.class_(this.class_, var2) : 0;
      float var4 = this.break_[Math.min(var3, this.break_.length - 1)];
      return var1.class_().nextFloat() < var4;
   }

   public static rQQ class_(ev_3 var0, float... var1) {
      return () -> new rQt_1(var0, var1);
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.implements_);
   }

   @Override
   public rWi_1 break_() {
      return rQF.finally_;
   }
}
