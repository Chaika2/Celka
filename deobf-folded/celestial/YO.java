package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

interface YO {
   int id_class(rcZ_2 var1);

   default List<rcZ_2> id_class(List<rcZ_2> var1) {
      return this.id_class(var1, this::id_class);
   }

   default List<rcZ_2> id_class(List<rcZ_2> var1, Supplier<rcZ_2> var2) {
      return this.id_class(var1, (var2x, var3) -> this.id_class(var2x, var2, var3));
   }

   default List<rcZ_2> id_class(List<rcZ_2> var1, BiConsumer<rcZ_2, List<rcZ_2>> var2) {
      ArrayList var3 = Lists.newArrayList();

      for (rcZ_2 var5 : var1) {
         var2.accept(var5, var3);
      }

      return var3;
   }

   void id_class(rcZ_2 var1, List<rcZ_2> var2);

   void id_class(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3);

   rcZ_2 id_class();

   int id_class(rcZ_2 var1, Supplier<rcZ_2> var2);
}
