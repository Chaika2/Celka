package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class pA_2<T extends rOK> extends pk_3<T, tj_3<T>> {
   private static final Map<aI_2<?>, rqO_2> id_class = Maps.newHashMap(
      ImmutableMap.of(aI_2.id_package, new rqO_2("textures/entity/horse/donkey.png"), aI_2.G, new rqO_2("textures/entity/horse/mule.png"))
   );

   public pA_2(pg_3 var1, float var2) {
      super(var1, new tj_3<>(0.0F), var2);
   }

   public rqO_2 id_class(T var1) {
      return id_class.get(var1.BC());
   }
}
