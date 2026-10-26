package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class rcB_2 extends rzh_3<rcB_2> {
   private final Map<rLR, rzV_2> class_ = Maps.newHashMap();

   public rcB_2 class_(rLR var1, rzV_2 var2) {
      this.class_.put(var1, var2);
      return this;
   }

   protected rcB_2 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rcP_2(this.byte_(), this.class_);
   }
}
