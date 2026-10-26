package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjA_2 implements rjc_3 {
   private final DoubleList id_class;

   public rjA_2(DoubleList var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class(rju_3 var1) {
      for (int var2 = 0; var2 <= this.id_class.size(); var2++) {
         if (!var1.merge(var2, var2, var2)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList id_class() {
      return this.id_class;
   }
}
