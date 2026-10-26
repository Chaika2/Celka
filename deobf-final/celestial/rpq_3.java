package celestial;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface rpq_3 {
   rpq_3 class_ = new rpT_2();

   default void class_(BiConsumer<rYB, rfH_2> var1) {
      this.class_((var1x, var2) -> {
         var1.accept(var1x, var2);
         return Optional.empty();
      });
   }

   static rpq_3 class_(rYB var0, rfH_2 var1) {
      return new rpt_3(var0, var1);
   }

   default <T> T class_(BiFunction<rYB, rfH_2, T> var1, T var2) {
      return this.<T>class_(var1).orElse((T)var2);
   }

   <T> Optional<T> class_(BiFunction<rYB, rfH_2, T> var1);
}
