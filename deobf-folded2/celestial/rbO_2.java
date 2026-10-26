package celestial;

import com.google.common.collect.ImmutableMap;

public class rbO_2<E extends rbk_3> extends rPm_1<E> {
   private final int id_class;

   public rbO_2(int var1) {
      super(
         ImmutableMap.of(
            il_3.id_static, iC_2.VALUE_PRESENT, il_3.id_const, iC_2.VALUE_ABSENT, il_3.id_transient, iC_2.VALUE_ABSENT, il_3.id_boolean, iC_2.VALUE_ABSENT
         )
      );
      this.id_class = var1;
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      var2.SF().id_class(il_3.id_const, true, (long)this.id_class);
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      rsE_2 var3 = var2.SF().id_byte(il_3.id_static).get();
      return rbW_2.id_class(var3.id_protected().id_break());
   }
}
