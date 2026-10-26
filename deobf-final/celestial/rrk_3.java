package celestial;

import com.google.common.collect.ImmutableMap;

public class rrk_3 extends rPm_1<rsq_3> {
   public rrk_3() {
      super(ImmutableMap.of());
   }

   private static boolean class_(rsq_3 var0) {
      return var0.SF().byte_(il_3.goto_).filter(var1 -> var1.int_(var0) <= 36.0).isPresent();
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      boolean var5 = rPB.break_(var2) || rPB.class_(var2) || class_(var2);
      if (!var5) {
         var2.SF().break_(il_3.public_);
         var2.SF().break_(il_3.goto_);
         var2.SF().class_(var1.P(), var1.r());
      }
   }
}
