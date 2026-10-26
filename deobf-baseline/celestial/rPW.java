package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPW extends rPm_1<rsq_3> {
   private long id_class;

   public rPW() {
      super(ImmutableMap.of(il_3.id_byte, iC_2.VALUE_PRESENT, il_3.id_final, iC_2.REGISTERED));
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2) {
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_class(il_3.id_float, var3);
      var5.id_byte(il_3.id_byte).ifPresent(var1x -> var5.id_class(il_3.id_final, new rfI_2(var1x.id_break())));
      var2.sc();
      this.id_class(var1, var2);
      if (var2.sN()) {
         var2.sQ();
      }
   }

   protected boolean id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      Optional var5 = var2.SF().id_byte(il_3.id_byte);
      if (!var5.isPresent()) {
         return false;
      } else {
         rfK_2 var6 = (rfK_2)var5.get();
         return var6.id_class() == var1.E() && var6.id_break().id_class(var2.Ps(), 1.73);
      }
   }

   protected boolean id_break(rrEm_1 var1, rsq_3 var2) {
      if (var1.r() - this.id_class < 300L) {
         return false;
      } else if (var1.id_int.nextInt(2) != 0) {
         return false;
      } else {
         this.id_class = var1.r();
         rfK_2 var3 = var2.SF().id_byte(il_3.id_byte).get();
         return var3.id_class() == var1.E() && var3.id_break().id_class(var2.Ps(), 1.73);
      }
   }
}
