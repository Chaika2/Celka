package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rNd_1 extends rzh_3<rNd_1> {
   private final Set<ev_3> id_class = Sets.newHashSet();

   public rNd_1 id_class(ev_3 var1) {
      this.id_class.add(var1);
      return this;
   }

   protected rNd_1 id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return new rNx_1(this.id_byte(), this.id_class);
   }
}
