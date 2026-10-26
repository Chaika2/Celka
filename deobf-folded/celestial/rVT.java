package celestial;

import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.OptionalInt;

public interface rVT {
   Collection<rqO_2> id_class(rqM_2<? extends rVL<?>> var1);

   <E> DataResult<Pair<E, OptionalInt>> id_class(DynamicOps<JsonElement> var1, rqM_2<? extends rVL<E>> var2, rqM_2<E> var3, Decoder<E> var4);

   static rVT id_class(rAL var0) {
      return new rVt_1(var0);
   }
}
