package celestial;

import com.google.common.collect.ImmutableMap;

public class rrh_3 extends rPm_1<iB_2> {
   public rrh_3() {
      super(ImmutableMap.of());
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      return var1.int_.nextInt(20) == 0;
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rrEr_1 var6 = var1.interface_(var2.Bs());
      if (var6 != null) {
         if (var6.byte_() && !var6.break_()) {
            var5.break_(iq_3.private_);
            var5.class_(iq_3.private_);
         } else {
            var5.break_(iq_3.implements_);
            var5.class_(iq_3.implements_);
         }
      }
   }
}
