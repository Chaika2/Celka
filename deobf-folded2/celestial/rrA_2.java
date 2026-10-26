package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrA_2 extends rPm_1<rsq_3> {
   private final float id_class;

   public rrA_2(float var1) {
      super(ImmutableMap.of(il_3.id_protected, iC_2.VALUE_PRESENT, il_3.id_byte, iC_2.VALUE_ABSENT, il_3.id_catch, iC_2.VALUE_PRESENT));
      this.id_class = var1;
   }

   private void id_class(rsq_3 var1) {
      var1.SF().id_break(il_3.id_volatile);
      var1.SF().id_break(il_3.id_final);
      var1.SF().id_break(il_3.id_protected);
   }

   private boolean id_class(rsq_3 var1, rfH_2 var2, rRP var3) {
      rLC var4 = var1.id_public().id_class(var2, var3.id_byte());
      return var4 != null && var4.id_finally();
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      rfH_2 var5 = var2.SF().id_byte(il_3.id_protected).get().id_break();
      Optional var6 = var1.d().id_byte(var5);
      if (var6.isPresent()) {
         iA_2.id_class(var2, var3x -> this.id_class((rRP)var6.get(), var3x, var5))
            .findFirst()
            .ifPresent(var4 -> this.id_class(var1, var2, var4, var5, var4.SF().id_byte(il_3.id_byte).isPresent()));
      }
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      return var2.n_() ? false : var2.su().id_break() == rsT_2.id_class;
   }

   private boolean id_class(rRP var1, rsq_3 var2, rfH_2 var3) {
      boolean var4 = var2.SF().id_byte(il_3.id_protected).isPresent();
      if (var4) {
         return false;
      } else {
         Optional var5 = var2.SF().id_byte(il_3.id_byte);
         rsT_2 var6 = var2.su().id_break();
         if (var2.su().id_break() != rsT_2.id_class && var6.id_class().id_break().test(var1)) {
            return !var5.isPresent() ? this.id_class(var2, var3, var1) : ((rfK_2)var5.get()).id_break().equals(var3);
         } else {
            return false;
         }
      }
   }

   private void id_class(rrEm_1 var1, rsq_3 var2, rsq_3 var3, rfH_2 var4, boolean var5) {
      this.id_class(var2);
      if (!var5) {
         iA_2.id_class(var3, var4, this.id_class, 1);
         var3.SF().id_class(il_3.id_protected, rfK_2.id_class(var1.E(), var4));
         ruP_2.id_byte(var1, var4);
      }
   }
}
