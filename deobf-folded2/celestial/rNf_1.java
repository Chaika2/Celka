package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rNf_1 extends rzh_3<rNf_1> {
   private final List<rzE_2> id_class = Lists.newArrayList();

   public rNf_1 id_class(rzG_2<?> var1) {
      this.id_class.add(var1.id_break());
      return this;
   }

   protected rNf_1 id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return new rNI(this.id_byte(), this.id_class);
   }
}
