package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Random;

public class rrV_2<E extends is_3> extends rPm_1<E> {
   private final int class_;
   private final float byte_;

   public rrV_2(int var1, float var2) {
      super(
         ImmutableMap.of(il_3.double_, iC_2.VALUE_PRESENT, il_3.package_, iC_2.VALUE_ABSENT, il_3.volatile_, iC_2.VALUE_ABSENT, il_3.final_, iC_2.REGISTERED)
      );
      this.class_ = var1;
      this.byte_ = var2;
   }

   private static rfH_2 class_(is_3 var0) {
      return var0.SF().byte_(il_3.double_).get();
   }

   private static int class_(Random var0) {
      return var0.nextInt(3) - 1;
   }

   private static rfH_2 class_(is_3 var0, rfH_2 var1) {
      Random var2 = ((rYB)var0.throws_[7]).int_;
      return var1.break_(class_(var2), 0, class_(var2));
   }

   protected void class_(rrEm_1 var1, is_3 var2, long var3) {
      rfH_2 var5 = class_(var2);
      boolean var6 = var5.class_(var2.Bs(), (double)this.class_);
      if (!var6) {
         iA_2.class_(var2, class_(var2, var5), this.byte_, this.class_);
      }
   }
}
