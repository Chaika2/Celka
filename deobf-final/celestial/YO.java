package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

interface YO {
   int class_(rcZ_2 var1);

   default List<rcZ_2> class_(List<rcZ_2> var1) {
      return this.class_(var1, this::class_);
   }

   default List<rcZ_2> class_(List<rcZ_2> var1, Supplier<rcZ_2> var2) {
      return this.class_(var1, (var2x, var3) -> this.class_(var2x, var2, var3));
   }

   default List<rcZ_2> class_(List<rcZ_2> var1, BiConsumer<rcZ_2, List<rcZ_2>> var2) {
      ArrayList var3 = Lists.newArrayList();

      for (rcZ_2 var5 : var1) {
         var2.accept(var5, var3);
      }

      return var3;
   }

   void class_(rcZ_2 var1, List<rcZ_2> var2);

   void class_(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3);

   rcZ_2 class_();

   int class_(rcZ_2 var1, Supplier<rcZ_2> var2);
}
