package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrC_2 extends rPm_1<rsq_3> {
   final float id_class;

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      Optional var5 = var2.SF().id_byte(il_3.id_protected);
      var5.ifPresent(var1x -> {
         rfH_2 var2x = var1x.id_break();
         rrEm_1 var3x = var1.id_const().id_class(var1x.id_class());
         if (var3x != null) {
            rga_3 var4 = var3x.d();
            if (var4.id_class(var2x, var0x -> true)) {
               var4.id_break(var2x);
            }

            ruP_2.id_byte(var1, var2x);
         }
      });
      var2.SF().id_break(il_3.id_protected);
   }

   public rrC_2(float var1) {
      super(ImmutableMap.of(il_3.id_protected, iC_2.VALUE_PRESENT), 1200);
      this.id_class = var1;
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return var2.SF().id_class(il_3.id_protected);
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      return var2.SF().id_protected().map(var0 -> var0 == iq_3.id_break || var0 == iq_3.id_byte || var0 == iq_3.id_protected).orElse(true);
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      iA_2.id_class(var2, var2.SF().id_byte(il_3.id_protected).get().id_break(), this.id_class, 1);
   }
}
