package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrH_2 extends rPm_1<aA_2> {
   private final float class_;
   private final int byte_;
   private final int protected_;

   public rrH_2(float var1) {
      this(var1, 10, 7);
   }

   public rrH_2(float var1, int var2, int var3) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   private void class_(aA_2 var1) {
      Optional var2 = Optional.ofNullable(iX_2.break_(var1, this.byte_, this.protected_));
      var1.SF().class_(il_3.volatile_, var2.map(var1x -> new iH_2(var1x, this.class_, 0)));
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      rfH_2 var5 = var2.Bs();
      if (var1.throw_(var5)) {
         this.class_(var2);
      } else {
         rjh_3 var6 = rjh_3.class_(var5);
         rjh_3 var7 = iA_2.class_(var1, var6, 2);
         if (var7 != var6) {
            this.class_(var2, var7);
         } else {
            this.class_(var2);
         }
      }
   }

   private void class_(aA_2 var1, rjh_3 var2) {
      Optional var3 = Optional.ofNullable(iX_2.break_(var1, this.byte_, this.protected_, rjU_2.protected_(var2.int_())));
      var1.SF().class_(il_3.volatile_, var3.map(var1x -> new iH_2(var1x, this.class_, 0)));
   }
}
