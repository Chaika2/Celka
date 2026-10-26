package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class qu_3 extends qc_3<rMF, tL_2<rMF>> {
   private static final Map<rML, rqO_2> id_class = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(rML.BROWN, new rqO_2("textures/entity/cow/brown_mooshroom.png"));
      var0.put(rML.RED, new rqO_2("textures/entity/cow/red_mooshroom.png"));
   });

   public qu_3(pg_3 var1) {
      super(var1, new tL_2<>(), 0.7F);
      this.id_class(new Tg_1<>(this));
   }

   public rqO_2 id_class(rMF var1) {
      return id_class.get(var1.n());
   }
}
