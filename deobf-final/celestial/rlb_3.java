package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public interface rlb_3<T> {
   static <T> rlb_3<T> class_(Set<T> var0) {
      return rlm_3.break_(var0);
   }

   static <T> Codec<rlb_3<T>> class_(Supplier<rlW_2<T>> var0) {
      return rqO_2.class_
         .flatXmap(
            var1 -> Optional.ofNullable(((rlW_2)var0.get()).class_(var1))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1)),
            var1 -> Optional.ofNullable(((rlW_2)var0.get()).class_(var1))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1))
         );
   }

   boolean class_(T var1);

   List<T> class_();

   default T class_(Random var1) {
      List var2 = this.class_();
      return (T)var2.get(var1.nextInt(var2.size()));
   }
}
