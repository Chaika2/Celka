package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class iY_2 extends rrr_3<iB_2> {
   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      iZ_2 var3 = var2.SF();
      rye_3 var4 = var2.SJ();
      if (var4 != null) {
         var3.class_(il_3.public_, var2.SJ());
         an_3 var5 = var4.extends_();
         if (var5 instanceof iB_2) {
            var3.class_(il_3.goto_, (iB_2)var5);
         }
      } else {
         var3.break_(il_3.public_);
      }

      var3.byte_(il_3.goto_).ifPresent(var2x -> {
         if (!var2x.BM() || (rYB)var2x.throws_[7] != var1) {
            var3.break_(il_3.goto_);
         }
      });
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.public_, il_3.goto_);
   }
}
