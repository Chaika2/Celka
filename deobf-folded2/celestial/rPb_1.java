package celestial;

import com.google.common.collect.ImmutableMap;

public class rPb_1<E extends iB_2> extends rPm_1<E> {
   private final float id_class;

   public rPb_1(float var1) {
      super(ImmutableMap.of(il_3.id_final, iC_2.REGISTERED, il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_super, iC_2.VALUE_PRESENT));
      this.id_class = var1;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      return !var2.Pm();
   }

   private boolean id_class(E var1) {
      return this.id_break((E)var1).id_class(var1, 1.0);
   }

   private an_3 id_break(E var1) {
      return var1.SF().id_byte(il_3.id_super).get();
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      if (this.id_class((E)var2)) {
         var2.id_this(this.id_break((E)var2));
      } else {
         iA_2.id_class(var2, this.id_break((E)var2), this.id_class, 1);
      }
   }
}
