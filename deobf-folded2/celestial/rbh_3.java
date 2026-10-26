package celestial;

import com.google.common.collect.ImmutableMap;

public class rbh_3<E extends rbk_3> extends rPm_1<E> {
   public rbh_3() {
      super(ImmutableMap.of(il_3.id_package, iC_2.VALUE_PRESENT, il_3.id_for, iC_2.REGISTERED));
   }

   private boolean id_class(E var1) {
      iB_2 var2 = var1.SF().id_byte(il_3.id_package).get();
      return var2.BC() == aI_2.id_long && var2.Sl();
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      if (this.id_class((E)var2)) {
         rbW_2.id_byte((rbM_2)var2);
      }
   }
}
