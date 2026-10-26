package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPC extends rPm_1<aA_2> {
   private final float class_;
   private final int byte_;
   private final int protected_;

   public rPC(float var1) {
      this(var1, 10, 7);
   }

   public rPC(float var1, int var2, int var3) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      Optional var5 = Optional.ofNullable(iX_2.break_(var2, this.byte_, this.protected_));
      var2.SF().class_(il_3.volatile_, var5.map(var1x -> new iH_2(var1x, this.class_, 0)));
   }
}
