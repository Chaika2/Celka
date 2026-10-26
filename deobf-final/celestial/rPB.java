package celestial;

import com.google.common.collect.ImmutableMap;

public class rPB extends rPm_1<rsq_3> {
   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      if (var3 % 100L == 0L) {
         var2.class_(var1, var3, 3);
      }
   }

   public rPB() {
      super(ImmutableMap.of());
   }

   public static boolean class_(iB_2 var0) {
      return var0.SF().class_(il_3.try_);
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return break_(var2) || class_(var2);
   }

   public static boolean break_(iB_2 var0) {
      return var0.SF().class_(il_3.public_);
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      if (break_(var2) || class_(var2)) {
         iZ_2 var5 = var2.SF();
         if (!var5.byte_(iq_3.catch_)) {
            var5.break_(il_3.this_);
            var5.break_(il_3.volatile_);
            var5.break_(il_3.final_);
            var5.break_(il_3.continue_);
            var5.break_(il_3.new_);
         }

         var5.class_(iq_3.catch_);
      }
   }
}
