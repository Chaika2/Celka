package celestial;

import com.google.common.collect.ImmutableMap;

public class rrK_2 extends rPm_1<is_3> {
   protected void id_byte(rrEm_1 var1, is_3 var2, long var3) {
      var2.SF().id_byte(il_3.id_final).ifPresent(var1x -> var2.id_continue().id_class(var1x.id_class()));
   }

   public rrK_2(int var1, int var2) {
      super(ImmutableMap.of(il_3.id_final, iC_2.VALUE_PRESENT), var1, var2);
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2, long var3) {
      return var2.SF().id_byte(il_3.id_final).filter(var1x -> var1x.id_class(var2)).isPresent();
   }

   protected void id_break(rrEm_1 var1, is_3 var2, long var3) {
      var2.SF().id_break(il_3.id_final);
   }
}
