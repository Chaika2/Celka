package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class rPn_1 extends rPm_1<aA_2> {
   private final float id_class;

   public rPn_1(float var1) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
   }

   protected boolean id_class(rrEm_1 var1, aA_2 var2) {
      return !var1.id_case(var2.Bs());
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      rfH_2 var5 = var2.Bs();
      List var6 = rfH_2.id_break(var5.id_break(-1, -1, -1), var5.id_break(1, 1, 1)).map(rfH_2::id_int).collect(Collectors.toList());
      Collections.shuffle(var6);
      Optional var7 = var6.stream()
         .filter(var1x -> !var1.id_case(var1x))
         .filter(var2x -> var1.id_class(var2x, var2))
         .filter(var2x -> var1.id_throws(var2))
         .findFirst();
      var7.ifPresent(var2x -> var2.SF().id_class(il_3.id_volatile, new iH_2(var2x, this.id_class, 0)));
   }
}
