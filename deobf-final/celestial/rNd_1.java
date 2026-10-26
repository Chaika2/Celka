package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rNd_1 extends rzh_3<rNd_1> {
   private final Set<ev_3> class_ = Sets.newHashSet();

   public rNd_1 class_(ev_3 var1) {
      this.class_.add(var1);
      return this;
   }

   protected rNd_1 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rNx_1(this.byte_(), this.class_);
   }
}
