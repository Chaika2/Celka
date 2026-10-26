package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrb_3 extends rPm_1<rsq_3> {
   public rrb_3() {
      super(ImmutableMap.of(il_3.protected_, iC_2.VALUE_PRESENT));
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      rfH_2 var3 = var2.SF().byte_(il_3.protected_).get().break_();
      return var3.class_(var2.Ps(), 2.0) || var2.sz();
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      rfK_2 var5 = var2.SF().byte_(il_3.protected_).get();
      var2.SF().break_(il_3.protected_);
      var2.SF().class_(il_3.byte_, var5);
      var1.class_(var2, (byte)14);
      if (var2.su().break_() == rsT_2.class_) {
         rnW_2 var6 = var1.const_();
         Optional.ofNullable(var6.class_(var5.class_()))
            .flatMap(var1x -> var1x.d().byte_(var5.break_()))
            .flatMap(var0 -> rVL.J.case_().filter(var1x -> var1x.class_() == var0).findFirst())
            .ifPresent(var2x -> {
               var2.class_(var2.su().class_(var2x));
               var2.byte_(var1);
            });
      }
   }
}
