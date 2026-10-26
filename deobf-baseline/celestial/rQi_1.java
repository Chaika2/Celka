package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

public class rQi_1 extends rzh_3<rQi_1> {
   private final xd_3 id_class;
   private final Set<rCZ<?>> id_break = Sets.newHashSet();

   rQi_1(xd_3 var1) {
      this.id_class = var1;
   }

   public rQi_1 id_class(rCZ<?> var1) {
      if (!this.id_class.id_new().id_protected().contains(var1)) {
         throw new IllegalStateException("Property " + var1 + " is not present on block " + this.id_class);
      } else {
         this.id_break.add(var1);
         return this;
      }
   }

   protected rQi_1 id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return new rQa_1(this.id_byte(), this.id_class, this.id_break);
   }
}
