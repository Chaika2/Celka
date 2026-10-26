package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrC_2 extends rPm_1<rsq_3> {
   final float class_;

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      Optional var5 = var2.SF().byte_(il_3.protected_);
      var5.ifPresent(var1x -> {
         rfH_2 var2x = var1x.break_();
         rrEm_1 var3x = var1.const_().class_(var1x.class_());
         if (var3x != null) {
            rga_3 var4 = var3x.d();
            if (var4.class_(var2x, var0x -> true)) {
               var4.break_(var2x);
            }

            ruP_2.byte_(var1, var2x);
         }
      });
      var2.SF().break_(il_3.protected_);
   }

   public rrC_2(float var1) {
      super(ImmutableMap.of(il_3.protected_, iC_2.VALUE_PRESENT), 1200);
      this.class_ = var1;
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return var2.SF().class_(il_3.protected_);
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      return var2.SF().protected_().map(var0 -> var0 == iq_3.break_ || var0 == iq_3.byte_ || var0 == iq_3.protected_).orElse(true);
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      iA_2.class_(var2, var2.SF().byte_(il_3.protected_).get().break_(), this.class_, 1);
   }
}
