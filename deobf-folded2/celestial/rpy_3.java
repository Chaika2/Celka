package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

class rpy_3 implements Codec<E> {
   rpy_3(ToIntFunction var1, IntFunction var2, Function var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return "StringRepresentable[" + this.id_class + "]";
   }

   public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.compressMaps()
         ? var1.getNumberValue(var2)
            .flatMap(
               var1x -> Optional.ofNullable((rpH_2)var0.apply(var1x.intValue()))
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error("Unknown element id: " + var1x))
            )
            .map(var1x -> Pair.of(var1x, var1.empty()))
         : var1.getStringValue(var2)
            .flatMap(
               var1x -> Optional.ofNullable((rpH_2)var0.apply(var1x))
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error("Unknown element name: " + var1x))
            )
            .map(var1x -> Pair.of(var1x, var1.empty()));
   }

   public <T> DataResult<T> id_class(E var1, DynamicOps<T> var2, T var3) {
      return var2.compressMaps()
         ? var2.mergeToPrimitive(var3, var2.createInt(this.id_class.applyAsInt(var1)))
         : var2.mergeToPrimitive(var3, var2.createString(var1.id_class()));
   }
}
