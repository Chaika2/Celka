package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Tw_1 extends Tf_1<rMZ, tD_2<rMZ>> {
   private static final Map<rMv_1, rqO_2> id_class = ImmutableMap.of(
      rMv_1.LOW,
      new rqO_2("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      rMv_1.MEDIUM,
      new rqO_2("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      rMv_1.HIGH,
      new rqO_2("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public Tw_1(qE_2<rMZ, tD_2<rMZ>> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, rMZ var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.Pp()) {
         rMv_1 var11 = var4.n();
         if (var11 != rMv_1.NONE) {
            rqO_2 var12 = id_class.get(var11);
            id_class(this.id_byte(), var12, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
