package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class rPp_1 extends rPm_1<aA_2> {
   private Map<iB_2, Integer> id_byte(aA_2 var1) {
      HashMap var2 = Maps.newHashMap();
      this.id_protected(var1).stream().filter(this::id_byte).forEach(var2x -> {
         Integer var3 = var2.compute(this.id_class(var2x), (var0, var1xx) -> var1xx == null ? 1 : var1xx + 1);
      });
      return var2;
   }

   private boolean id_byte(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_new).isPresent();
   }

   public rPp_1() {
      super(
         ImmutableMap.of(
            il_3.id_implements, iC_2.VALUE_PRESENT, il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_final, iC_2.REGISTERED, il_3.id_new, iC_2.REGISTERED
         )
      );
   }

   private iB_2 id_class(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_new).get();
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      iB_2 var5 = this.id_break((iB_2)var2);
      if (var5 != null) {
         this.id_class(var1, var2, var5);
      } else {
         Optional var6 = this.id_break(var2);
         if (var6.isPresent()) {
            id_class(var2, (iB_2)var6.get());
         } else {
            this.id_class(var2).ifPresent(var1x -> id_class(var2, var1x));
         }
      }
   }

   private boolean id_class(iB_2 var1, iB_2 var2) {
      return var2.SF().id_byte(il_3.id_new).filter(var1x -> var1x == var1).isPresent();
   }

   protected boolean id_class(rrEm_1 var1, aA_2 var2) {
      return var1.id_long().nextInt(10) == 0 && this.id_throws(var2);
   }

   private static void id_class(aA_2 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      var2.id_class(il_3.id_new, var1);
      var2.id_class(il_3.id_final, new rfY_2(var1, true));
      var2.id_class(il_3.id_volatile, new iH_2(new rfY_2(var1, false), 0.6F, 1));
   }

   private Optional<iB_2> id_class(aA_2 var1) {
      return this.id_protected(var1).stream().findAny();
   }

   private void id_class(rrEm_1 var1, aA_2 var2, iB_2 var3) {
      for (int var4 = 0; var4 < 10; var4++) {
         rjU_2 var5 = iX_2.id_break(var2, 20, 8);
         if (var5 != null && var1.id_throw(new rfH_2(var5))) {
            var2.SF().id_class(il_3.id_volatile, new iH_2(var5, 0.6F, 0));
            return;
         }
      }
   }

   private Optional<iB_2> id_break(aA_2 var1) {
      Map var2 = this.id_byte(var1);
      return var2.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter(var0 -> (Integer)var0.getValue() > 0 && (Integer)var0.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private iB_2 id_break(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_implements).get().stream().filter(var2 -> this.id_class(var1, var2)).findAny().orElse((iB_2)null);
   }

   private boolean id_throws(aA_2 var1) {
      return var1.SF().id_class(il_3.id_implements);
   }

   private List<iB_2> id_protected(aA_2 var1) {
      return var1.SF().id_byte(il_3.id_implements).get();
   }
}
