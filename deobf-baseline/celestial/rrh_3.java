package celestial;

import com.google.common.collect.ImmutableMap;

public class rrh_3 extends rPm_1<iB_2> {
   public rrh_3() {
      super(ImmutableMap.of());
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      return var1.id_int.nextInt(20) == 0;
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rrEr_1 var6 = var1.id_interface(var2.Bs());
      if (var6 != null) {
         if (var6.id_byte() && !var6.id_break()) {
            var5.id_break(iq_3.id_private);
            var5.id_class(iq_3.id_private);
         } else {
            var5.id_break(iq_3.id_implements);
            var5.id_class(iq_3.id_implements);
         }
      }
   }
}
