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
   private Map<iB_2, Integer> byte_(aA_2 var1) {
      HashMap var2 = Maps.newHashMap();
      this.protected_(var1).stream().filter(this::byte_).forEach(var2x -> {
         Integer var3 = var2.compute(this.class_(var2x), (var0, var1xx) -> var1xx == null ? 1 : var1xx + 1);
      });
      return var2;
   }

   private boolean byte_(iB_2 var1) {
      return var1.SF().byte_(il_3.new_).isPresent();
   }

   public rPp_1() {
      super(ImmutableMap.of(il_3.implements_, iC_2.VALUE_PRESENT, il_3.volatile_, iC_2.VALUE_ABSENT, il_3.final_, iC_2.REGISTERED, il_3.new_, iC_2.REGISTERED));
   }

   private iB_2 class_(iB_2 var1) {
      return var1.SF().byte_(il_3.new_).get();
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      iB_2 var5 = this.break_((iB_2)var2);
      if (var5 != null) {
         this.class_(var1, var2, var5);
      } else {
         Optional var6 = this.break_(var2);
         if (var6.isPresent()) {
            class_(var2, (iB_2)var6.get());
         } else {
            this.class_(var2).ifPresent(var1x -> class_(var2, var1x));
         }
      }
   }

   private boolean class_(iB_2 var1, iB_2 var2) {
      return var2.SF().byte_(il_3.new_).filter(var1x -> var1x == var1).isPresent();
   }

   protected boolean class_(rrEm_1 var1, aA_2 var2) {
      return var1.long_().nextInt(10) == 0 && this.throws_(var2);
   }

   private static void class_(aA_2 var0, iB_2 var1) {
      iZ_2 var2 = var0.SF();
      var2.class_(il_3.new_, var1);
      var2.class_(il_3.final_, new rfY_2(var1, true));
      var2.class_(il_3.volatile_, new iH_2(new rfY_2(var1, false), 0.6F, 1));
   }

   private Optional<iB_2> class_(aA_2 var1) {
      return this.protected_(var1).stream().findAny();
   }

   private void class_(rrEm_1 var1, aA_2 var2, iB_2 var3) {
      for (int var4 = 0; var4 < 10; var4++) {
         rjU_2 var5 = iX_2.break_(var2, 20, 8);
         if (var5 != null && var1.throw_(new rfH_2(var5))) {
            var2.SF().class_(il_3.volatile_, new iH_2(var5, 0.6F, 0));
            return;
         }
      }
   }

   private Optional<iB_2> break_(aA_2 var1) {
      Map var2 = this.byte_(var1);
      return var2.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter(var0 -> (Integer)var0.getValue() > 0 && (Integer)var0.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private iB_2 break_(iB_2 var1) {
      return var1.SF().byte_(il_3.implements_).get().stream().filter(var2 -> this.class_(var1, var2)).findAny().orElse((iB_2)null);
   }

   private boolean throws_(aA_2 var1) {
      return var1.SF().class_(il_3.implements_);
   }

   private List<iB_2> protected_(aA_2 var1) {
      return var1.SF().byte_(il_3.implements_).get();
   }
}
