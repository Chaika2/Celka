package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rbN_2<E extends rbk_3> extends rPm_1<E> {
   private final int id_class;
   private final int id_byte;

   public rbN_2(int var1, int var2) {
      super(
         ImmutableMap.of(
            il_3.id_const, iC_2.VALUE_PRESENT, il_3.id_static, iC_2.VALUE_PRESENT, il_3.id_strictfp, iC_2.REGISTERED, il_3.id_boolean, iC_2.REGISTERED
         )
      );
      this.id_class = var1;
      this.id_byte = var2;
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      iZ_2 var5 = var2.SF();
      Optional var6 = var5.id_byte(il_3.id_strictfp);
      if (!var6.isPresent()) {
         var5.id_class(il_3.id_strictfp, 0);
      } else {
         int var7 = (Integer)var6.get();
         if (var7 > this.id_class) {
            var5.id_break(il_3.id_const);
            var5.id_break(il_3.id_strictfp);
            var5.id_class(il_3.id_boolean, true, (long)this.id_byte);
         } else {
            var5.id_class(il_3.id_strictfp, var7 + 1);
         }
      }
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      return var2.Sn().id_class();
   }
}
