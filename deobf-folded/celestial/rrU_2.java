package celestial;

import com.google.common.collect.ImmutableMap;

public class rrU_2 extends rPm_1<is_3> {
   private final float id_class;

   public rrU_2(float var1) {
      super(
         ImmutableMap.of(
            il_3.id_volatile, iC_2.REGISTERED, il_3.id_final, iC_2.REGISTERED, il_3.id_package, iC_2.VALUE_PRESENT, il_3.id_private, iC_2.REGISTERED
         )
      );
      this.id_class = var1;
   }

   private void id_class(iB_2 var1) {
      var1.SF().id_break(il_3.id_volatile);
   }

   private void id_class(iB_2 var1, iB_2 var2) {
      iZ_2 var3 = var1.SF();
      var3.id_class(il_3.id_final, new rfY_2(var2, true));
      iH_2 var4 = new iH_2(new rfY_2(var2, false), this.id_class, 0);
      var3.id_class(il_3.id_volatile, var4);
   }

   protected void id_class(rrEm_1 var1, is_3 var2, long var3) {
      iB_2 var5 = var2.SF().id_byte(il_3.id_package).get();
      if (iA_2.id_byte(var2, var5) && iA_2.id_class(var2, var5, 1)) {
         this.id_class(var2);
      } else {
         this.id_class(var2, var5);
      }
   }
}
