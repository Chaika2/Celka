package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rbX_2<E extends rbk_3> extends rPm_1<E> {
   private final int class_;

   public rbX_2(int var1) {
      super(ImmutableMap.of(il_3.const_, iC_2.VALUE_PRESENT, il_3.static_, iC_2.REGISTERED));
      this.class_ = var1;
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      var2.SF().break_(il_3.const_);
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      if (!var2.Sn().class_()) {
         return false;
      } else {
         Optional var3 = var2.SF().byte_(il_3.static_);
         return !var3.isPresent() ? true : !((rsE_2)var3.get()).class_(var2, (double)this.class_);
      }
   }
}
