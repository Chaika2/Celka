package celestial;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Yb_1 implements YO {
   private final Predicate<rcZ_2> class_;

   public Yb_1(rcd_3 var1) {
      this.class_ = YE.class_(var1);
   }

   @Override
   public rcZ_2 class_() {
      return new rcd_3();
   }

   @Override
   public int class_(rcZ_2 var1, Supplier<rcZ_2> var2) {
      return 0;
   }

   @Override
   public int class_(rcZ_2 var1) {
      return 0;
   }

   @Override
   public void class_(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      this.class_(var1, var3);
   }

   @Override
   public void class_(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcd_3 && this.class_.test(var1)) {
         var2.add(var1);
      }
   }
}
