package celestial;

import com.google.common.collect.BiMap;
import java.util.Map;

class rlz_3 implements rlW_2<T> {
   private final rlb_3<T> id_break;

   rlz_3(BiMap var1) {
      this.id_class = var1;
      this.id_break = rlm_3.id_break();
   }

   @Override
   public Map<rqO_2, rlb_3<T>> id_class() {
      return this.id_class;
   }

   @Override
   public rqO_2 id_class(rlb_3<T> var1) {
      return var1 instanceof rlO_2 ? ((rlO_2)var1).id_break() : (rqO_2)this.id_class.inverse().get(var1);
   }

   @Override
   public rlb_3<T> id_break(rqO_2 var1) {
      return (rlb_3<T>)this.id_class.getOrDefault(var1, this.id_break);
   }
}
