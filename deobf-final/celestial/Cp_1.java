package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

class Cp_1 implements Ch_1 {
   private List<fj_3> class_;

   Cp_1(Cy_1 var1) {
   }

   public void class_(List<fj_3> var1) {
      this.class_ = ImmutableList.copyOf(var1);
   }

   @Override
   public fj_3 class_(Random var1) {
      return this.class_.get(var1.nextInt(this.class_.size()));
   }

   @Override
   public fj_3 class_(int var1, int var2) {
      return this.class_.get(var1 * (this.class_.size() - 1) / var2);
   }
}
