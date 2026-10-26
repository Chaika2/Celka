package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrb_3 extends rPm_1<rsq_3> {
   public rrb_3() {
      super(ImmutableMap.of(il_3.id_protected, iC_2.VALUE_PRESENT));
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      rfH_2 var3 = var2.SF().id_byte(il_3.id_protected).get().id_break();
      return var3.id_class(var2.Ps(), 2.0) || var2.sz();
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      rfK_2 var5 = var2.SF().id_byte(il_3.id_protected).get();
      var2.SF().id_break(il_3.id_protected);
      var2.SF().id_class(il_3.id_byte, var5);
      var1.id_class(var2, (byte)14);
      if (var2.su().id_break() == rsT_2.id_class) {
         rnW_2 var6 = var1.id_const();
         Optional.ofNullable(var6.id_class(var5.id_class()))
            .flatMap(var1x -> var1x.d().id_byte(var5.id_break()))
            .flatMap(var0 -> rVL.J.id_case().filter(var1x -> var1x.id_class() == var0).findFirst())
            .ifPresent(var2x -> {
               var2.id_class(var2.su().id_class(var2x));
               var2.id_byte(var1);
            });
      }
   }
}
