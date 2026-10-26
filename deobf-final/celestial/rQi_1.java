package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rQi_1 extends rzh_3<rQi_1> {
   private final xd_3 class_;
   private final Set<rCZ<?>> break_ = Sets.newHashSet();

   rQi_1(xd_3 var1) {
      this.class_ = var1;
   }

   public rQi_1 class_(rCZ<?> var1) {
      if (!this.class_.new_().protected_().contains(var1)) {
         throw new IllegalStateException("Property " + var1 + " is not present on block " + this.class_);
      } else {
         this.break_.add(var1);
         return this;
      }
   }

   protected rQi_1 throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rQa_1(this.byte_(), this.class_, this.break_);
   }
}
