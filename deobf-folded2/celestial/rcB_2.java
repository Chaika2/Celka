package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class rcB_2 extends rzh_3<rcB_2> {
   private final Map<rLR, rzV_2> id_class = Maps.newHashMap();

   public rcB_2 id_class(rLR var1, rzV_2 var2) {
      this.id_class.put(var1, var2);
      return this;
   }

   protected rcB_2 id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return new rcP_2(this.id_byte(), this.id_class);
   }
}
