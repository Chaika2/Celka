package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class TS extends pk_3<rOD, tV_2<rOD>> {
   private static final Map<aI_2<?>, rqO_2> id_class = Maps.newHashMap(
      ImmutableMap.of(aI_2.rE, new rqO_2("textures/entity/horse/horse_zombie.png"), aI_2.n, new rqO_2("textures/entity/horse/horse_skeleton.png"))
   );

   public TS(pg_3 var1) {
      super(var1, new tV_2<>(0.0F), 1.0F);
   }

   public rqO_2 id_class(rOD var1) {
      return id_class.get(var1.BC());
   }
}
