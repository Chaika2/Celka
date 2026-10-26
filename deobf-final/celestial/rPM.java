package celestial;

import com.google.common.collect.ImmutableMap;

public class rPM extends rPm_1<iB_2> {
   public rPM() {
      super(ImmutableMap.of(il_3.throws_, iC_2.VALUE_PRESENT));
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      return var1.int_.nextFloat() > 0.95F;
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rfH_2 var6 = var5.byte_(il_3.throws_).get().break_();
      if (var6.class_(var2.Bs(), 3.0)) {
         xc_3 var7 = var1.byte_(var6);
         if (var7.class_(xu_3.Xb)) {
            xX_2 var8 = (xX_2)var7.break_();
            var8.class_(var1, var6, (rpr_3)null);
         }
      }
   }
}
