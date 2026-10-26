package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public interface rpH_2 {
   static Keyable class_(rpH_2[] var0) {
      return new rpp_3(var0);
   }

   static <E extends rpH_2> Codec<E> class_(ToIntFunction<E> var0, IntFunction<E> var1, Function<? super String, ? extends E> var2) {
      return new rpy_3(var0, var1, var2);
   }

   static <E extends Enum<E> & rpH_2> Codec<E> class_(Supplier<E[]> var0, Function<? super String, ? extends E> var1) {
      Enum[] var2 = (Enum[])var0.get();
      return class_(var0x -> var0x.ordinal(), var1x -> (E)var2[var1x], var1);
   }

   String class_();
}
