package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class rPn_1 extends rPm_1<aA_2> {
   private final float class_;

   public rPn_1(float var1) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
   }

   protected boolean class_(rrEm_1 var1, aA_2 var2) {
      return !var1.case_(var2.Bs());
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      rfH_2 var5 = var2.Bs();
      List var6 = rfH_2.break_(var5.break_(-1, -1, -1), var5.break_(1, 1, 1)).map(rfH_2::int_).collect(Collectors.toList());
      Collections.shuffle(var6);
      Optional var7 = var6.stream()
         .filter(var1x -> !var1.case_(var1x))
         .filter(var2x -> var1.class_(var2x, var2))
         .filter(var2x -> var1.throws_(var2))
         .findFirst();
      var7.ifPresent(var2x -> var2.SF().class_(il_3.volatile_, new iH_2(var2x, this.class_, 0)));
   }
}
