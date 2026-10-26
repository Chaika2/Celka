package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrW_2 extends rPm_1<iB_2> {
   public rrW_2() {
      super(
         ImmutableMap.of(
            il_3.id_volatile,
            iC_2.REGISTERED,
            il_3.id_final,
            iC_2.REGISTERED,
            il_3.id_throws,
            iC_2.VALUE_PRESENT,
            il_3.id_private,
            iC_2.VALUE_PRESENT,
            il_3.id_new,
            iC_2.VALUE_ABSENT
         )
      );
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      iZ_2 var3 = var2.SF();
      Optional var4 = var3.id_byte(il_3.id_throws);
      return var1.id_long().nextInt(100) == 0
         && var4.isPresent()
         && var1.E() == ((rfK_2)var4.get()).id_class()
         && ((rfK_2)var4.get()).id_break().id_class(var2.Ps(), 4.0)
         && var3.id_byte(il_3.id_private).get().stream().anyMatch(var0 -> aI_2.D.equals(var0.BC()));
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_byte(il_3.id_private)
         .ifPresent(
            var2x -> var2x.stream().filter(var0x -> aI_2.D.equals(var0x.BC())).filter(var1xx -> var1xx.id_int(var2) <= 32.0).findFirst().ifPresent(var1xx -> {
                  var5.id_class(il_3.id_new, var1xx);
                  var5.id_class(il_3.id_final, new rfY_2(var1xx, true));
                  var5.id_class(il_3.id_volatile, new iH_2(new rfY_2(var1xx, false), 0.3F, 1));
               })
         );
   }
}
