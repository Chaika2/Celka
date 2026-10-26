package celestial;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Yb_1 implements YO {
   private final Predicate<rcZ_2> id_class;

   public Yb_1(rcd_3 var1) {
      this.id_class = YE.id_class(var1);
   }

   @Override
   public rcZ_2 id_class() {
      return new rcd_3();
   }

   @Override
   public int id_class(rcZ_2 var1, Supplier<rcZ_2> var2) {
      return 0;
   }

   @Override
   public int id_class(rcZ_2 var1) {
      return 0;
   }

   @Override
   public void id_class(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      this.id_class(var1, var3);
   }

   @Override
   public void id_class(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcd_3 && this.id_class.test(var1)) {
         var2.add(var1);
      }
   }
}
