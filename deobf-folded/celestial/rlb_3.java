package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public interface rlb_3<T> {
   static <T> rlb_3<T> id_class(Set<T> var0) {
      return rlm_3.id_break(var0);
   }

   static <T> Codec<rlb_3<T>> id_class(Supplier<rlW_2<T>> var0) {
      return rqO_2.id_class
         .flatXmap(
            var1 -> Optional.ofNullable(((rlW_2)var0.get()).id_class(var1))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1)),
            var1 -> Optional.ofNullable(((rlW_2)var0.get()).id_class(var1))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1))
         );
   }

   boolean id_class(T var1);

   List<T> id_class();

   default T id_class(Random var1) {
      List var2 = this.id_class();
      return (T)var2.get(var1.nextInt(var2.size()));
   }
}
