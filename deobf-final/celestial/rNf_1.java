package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rNf_1 extends rzh_3<rNf_1> {
   private final List<rzE_2> class_ = Lists.newArrayList();

   public rNf_1 class_(rzG_2<?> var1) {
      this.class_.add(var1.break_());
      return this;
   }

   protected rNf_1 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rNI(this.byte_(), this.class_);
   }
}
