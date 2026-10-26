package celestial;

import com.google.common.collect.ImmutableMap;

public class rrK_2 extends rPm_1<is_3> {
   protected void byte_(rrEm_1 var1, is_3 var2, long var3) {
      var2.SF().byte_(il_3.final_).ifPresent(var1x -> var2.continue_().class_(var1x.class_()));
   }

   public rrK_2(int var1, int var2) {
      super(ImmutableMap.of(il_3.final_, iC_2.VALUE_PRESENT), var1, var2);
   }

   protected boolean class_(rrEm_1 var1, is_3 var2, long var3) {
      return var2.SF().byte_(il_3.final_).filter(var1x -> var1x.class_(var2)).isPresent();
   }

   protected void break_(rrEm_1 var1, is_3 var2, long var3) {
      var2.SF().break_(il_3.final_);
   }
}
