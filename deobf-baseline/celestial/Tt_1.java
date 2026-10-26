package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Tt_1 extends Tf_1<rOi_1, tV_2<rOi_1>> {
   private static final Map<rOe_1, rqO_2> id_class = rqR_2.id_class(Maps.newEnumMap(rOe_1.class), var0 -> {
      var0.put(rOe_1.NONE, (rqO_2)null);
      var0.put(rOe_1.WHITE, new rqO_2("textures/entity/horse/horse_markings_white.png"));
      var0.put(rOe_1.WHITE_FIELD, new rqO_2("textures/entity/horse/horse_markings_whitefield.png"));
      var0.put(rOe_1.WHITE_DOTS, new rqO_2("textures/entity/horse/horse_markings_whitedots.png"));
      var0.put(rOe_1.BLACK_DOTS, new rqO_2("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public Tt_1(qE_2<rOi_1, tV_2<rOi_1>> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, rOi_1 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rqO_2 var11 = id_class.get(var4.sd());
      if (var11 != null && !var4.Pp()) {
         Ok_1 var12 = var2.getBuffer(HU.id_private(var11));
         this.id_byte().id_class(var1, var12, var3, qd_3.id_byte(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
