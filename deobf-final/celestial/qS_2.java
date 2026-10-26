package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public final class qS_2 extends pk_3<rOi_1, tV_2<rOi_1>> {
   private static final Map<rOU, rqO_2> class_ = rqR_2.class_(Maps.newEnumMap(rOU.class), var0 -> {
      var0.put(rOU.WHITE, new rqO_2("textures/entity/horse/horse_white.png"));
      var0.put(rOU.CREAMY, new rqO_2("textures/entity/horse/horse_creamy.png"));
      var0.put(rOU.CHESTNUT, new rqO_2("textures/entity/horse/horse_chestnut.png"));
      var0.put(rOU.BROWN, new rqO_2("textures/entity/horse/horse_brown.png"));
      var0.put(rOU.BLACK, new rqO_2("textures/entity/horse/horse_black.png"));
      var0.put(rOU.GRAY, new rqO_2("textures/entity/horse/horse_gray.png"));
      var0.put(rOU.DARKBROWN, new rqO_2("textures/entity/horse/horse_darkbrown.png"));
   });

   public qS_2(pg_3 var1) {
      super(var1, new tV_2<>(0.0F), 1.1F);
      this.class_(new Tt_1(this));
      this.class_(new Tj_1(this));
   }

   public rqO_2 class_(rOi_1 var1) {
      return class_.get(var1.sJ());
   }
}
