package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rbN_2<E extends rbk_3> extends rPm_1<E> {
   private final int class_;
   private final int byte_;

   public rbN_2(int var1, int var2) {
      super(ImmutableMap.of(il_3.const_, iC_2.VALUE_PRESENT, il_3.static_, iC_2.VALUE_PRESENT, il_3.strictfp_, iC_2.REGISTERED, il_3.boolean_, iC_2.REGISTERED));
      this.class_ = var1;
      this.byte_ = var2;
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      iZ_2 var5 = var2.SF();
      Optional var6 = var5.byte_(il_3.strictfp_);
      if (!var6.isPresent()) {
         var5.class_(il_3.strictfp_, 0);
      } else {
         int var7 = (Integer)var6.get();
         if (var7 > this.class_) {
            var5.break_(il_3.const_);
            var5.break_(il_3.strictfp_);
            var5.class_(il_3.boolean_, true, (long)this.byte_);
         } else {
            var5.class_(il_3.strictfp_, var7 + 1);
         }
      }
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      return var2.Sn().class_();
   }
}
