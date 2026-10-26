package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrW_2 extends rPm_1<iB_2> {
   public rrW_2() {
      super(
         ImmutableMap.of(
            il_3.volatile_,
            iC_2.REGISTERED,
            il_3.final_,
            iC_2.REGISTERED,
            il_3.throws_,
            iC_2.VALUE_PRESENT,
            il_3.private_,
            iC_2.VALUE_PRESENT,
            il_3.new_,
            iC_2.VALUE_ABSENT
         )
      );
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      iZ_2 var3 = var2.SF();
      Optional var4 = var3.byte_(il_3.throws_);
      return var1.long_().nextInt(100) == 0
         && var4.isPresent()
         && var1.E() == ((rfK_2)var4.get()).class_()
         && ((rfK_2)var4.get()).break_().class_(var2.Ps(), 4.0)
         && var3.byte_(il_3.private_).get().stream().anyMatch(var0 -> aI_2.D.equals(var0.BC()));
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.byte_(il_3.private_)
         .ifPresent(
            var2x -> var2x.stream().filter(var0x -> aI_2.D.equals(var0x.BC())).filter(var1xx -> var1xx.int_(var2) <= 32.0).findFirst().ifPresent(var1xx -> {
                  var5.class_(il_3.new_, var1xx);
                  var5.class_(il_3.final_, new rfY_2(var1xx, true));
                  var5.class_(il_3.volatile_, new iH_2(new rfY_2(var1xx, false), 0.3F, 1));
               })
         );
   }
}
