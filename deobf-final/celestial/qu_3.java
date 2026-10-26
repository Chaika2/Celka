package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class qu_3 extends qc_3<rMF, tL_2<rMF>> {
   private static final Map<rML, rqO_2> class_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(rML.BROWN, new rqO_2("textures/entity/cow/brown_mooshroom.png"));
      var0.put(rML.RED, new rqO_2("textures/entity/cow/red_mooshroom.png"));
   });

   public qu_3(pg_3 var1) {
      super(var1, new tL_2<>(), 0.7F);
      this.class_(new Tg_1<>(this));
   }

   public rqO_2 class_(rMF var1) {
      return class_.get(var1.n());
   }
}
