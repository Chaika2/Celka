package celestial;

import com.google.common.collect.ImmutableMap;

public class rrM_2<E extends is_3> extends rPm_1<E> {
   private final int id_class;
   private final float id_byte;

   private iB_2 id_byte(E var1) {
      return var1.SF().id_byte(il_3.id_package).get();
   }

   public rrM_2(int var1, float var2) {
      super(
         ImmutableMap.of(
            il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_final, iC_2.REGISTERED, il_3.id_package, iC_2.VALUE_PRESENT, il_3.id_private, iC_2.VALUE_PRESENT
         )
      );
      this.id_class = var1;
      this.id_byte = var2;
   }

   private boolean id_class(E var1) {
      return var1.SF().id_byte(il_3.id_private).get().contains(this.id_byte((E)var1));
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      return this.id_class((E)var2) && this.id_break((E)var2);
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      var2.SF().id_class(il_3.id_final, new rfY_2(this.id_byte((E)var2), true));
      var2.id_super().id_class(-this.id_byte, 0.0F);
      Float var9 = rfU_2.id_break((Float)var2.id_throws[15], (Float)var2.id_private[25], 0.0F);
      var2.id_throws[15] = var9;
   }

   private boolean id_break(E var1) {
      return this.id_byte((E)var1).id_class(var1, (double)this.id_class);
   }
}
