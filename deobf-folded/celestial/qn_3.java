package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class qn_3 extends pm_3<is_3, wO_2<is_3>> {
   private static final Map<aI_2<?>, rqO_2> id_class = ImmutableMap.of(
      aI_2.d,
      new rqO_2("textures/entity/piglin/piglin.png"),
      aI_2.rb,
      new rqO_2("textures/entity/piglin/zombified_piglin.png"),
      aI_2.k,
      new rqO_2("textures/entity/piglin/piglin_brute.png")
   );

   protected boolean id_byte(is_3 var1) {
      return var1 instanceof rbM_2 && ((rbM_2)var1).sJ();
   }

   public qn_3(pg_3 var1, boolean var2) {
      super(var1, id_class(var2), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.id_class(new Tc_1<>(this, new tW_2(0.5F), new tW_2(1.02F)));
   }

   @Override
   public rqO_2 id_class(is_3 var1) {
      rqO_2 var2 = id_class.get(var1.BC());
      if (var2 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + var1.BC());
      } else {
         return var2;
      }
   }

   private static wO_2<is_3> id_class(boolean var0) {
      wO_2 var1 = new wO_2(0.0F, 64, 64);
      if (var0) {
         var1.id_volatile.id_finally = false;
      }

      return var1;
   }
}
