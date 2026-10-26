package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class iY_2 extends rrr_3<iB_2> {
   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      iZ_2 var3 = var2.SF();
      rye_3 var4 = var2.SJ();
      if (var4 != null) {
         var3.id_class(il_3.id_public, var2.SJ());
         an_3 var5 = var4.id_extends();
         if (var5 instanceof iB_2) {
            var3.id_class(il_3.id_goto, (iB_2)var5);
         }
      } else {
         var3.id_break(il_3.id_public);
      }

      var3.id_byte(il_3.id_goto).ifPresent(var2x -> {
         if (!var2x.BM() || (rYB)var2x.id_throws[7] != var1) {
            var3.id_break(il_3.id_goto);
         }
      });
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_public, il_3.id_goto);
   }
}
