package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

class Cp_1 implements Ch_1 {
   private List<fj_3> id_class;

   Cp_1(Cy_1 var1) {
   }

   public void id_class(List<fj_3> var1) {
      this.id_class = ImmutableList.copyOf(var1);
   }

   @Override
   public fj_3 id_class(Random var1) {
      return this.id_class.get(var1.nextInt(this.id_class.size()));
   }

   @Override
   public fj_3 id_class(int var1, int var2) {
      return this.id_class.get(var1 * (this.id_class.size() - 1) / var2);
   }
}
