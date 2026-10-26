package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjA_2 implements rjc_3 {
   private final DoubleList class_;

   public rjA_2(DoubleList var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_(rju_3 var1) {
      for (int var2 = 0; var2 <= this.class_.size(); var2++) {
         if (!var1.merge(var2, var2, var2)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList class_() {
      return this.class_;
   }
}
