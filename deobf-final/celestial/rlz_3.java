package celestial;

import com.google.common.collect.BiMap;
import java.util.Map;

class rlz_3 implements rlW_2<T> {
   private final rlb_3<T> break_;

   rlz_3(BiMap var1) {
      this.class_ = var1;
      this.break_ = rlm_3.break_();
   }

   @Override
   public Map<rqO_2, rlb_3<T>> class_() {
      return this.class_;
   }

   @Override
   public rqO_2 class_(rlb_3<T> var1) {
      return var1 instanceof rlO_2 ? ((rlO_2)var1).break_() : (rqO_2)this.class_.inverse().get(var1);
   }

   @Override
   public rlb_3<T> break_(rqO_2 var1) {
      return (rlb_3<T>)this.class_.getOrDefault(var1, this.break_);
   }
}
