package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPw_1 extends rPm_1<aA_2> {
   private final il_3<rfK_2> class_;
   private long byte_;
   private final int protected_;
   private float throws_;

   public rPw_1(il_3<rfK_2> var1, float var2, int var3) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.REGISTERED, var1, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.throws_ = var2;
      this.protected_ = var3;
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      if (var3 > this.byte_) {
         Optional var5 = Optional.ofNullable(iX_2.break_(var2, 8, 6));
         var2.SF().class_(il_3.volatile_, var5.map(var1x -> new iH_2(var1x, this.throws_, 1)));
         this.byte_ = var3 + 180L;
      }
   }

   protected boolean class_(rrEm_1 var1, aA_2 var2) {
      Optional var3 = var2.SF().byte_(this.class_);
      return var3.isPresent() && var1.E() == ((rfK_2)var3.get()).class_() && ((rfK_2)var3.get()).break_().class_(var2.Ps(), (double)this.protected_);
   }
}
