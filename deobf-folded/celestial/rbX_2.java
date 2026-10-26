package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rbX_2<E extends rbk_3> extends rPm_1<E> {
   private final int id_class;

   public rbX_2(int var1) {
      super(ImmutableMap.of(il_3.id_const, iC_2.VALUE_PRESENT, il_3.id_static, iC_2.REGISTERED));
      this.id_class = var1;
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      var2.SF().id_break(il_3.id_const);
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      if (!var2.Sn().id_class()) {
         return false;
      } else {
         Optional var3 = var2.SF().id_byte(il_3.id_static);
         return !var3.isPresent() ? true : !((rsE_2)var3.get()).id_class(var2, (double)this.id_class);
      }
   }
}
