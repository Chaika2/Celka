package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public final class rVw_1 implements rVT {
   private final Map<rqM_2<?>, JsonElement> id_class = Maps.newIdentityHashMap();
   private final Object2IntMap<rqM_2<?>> id_break = new Object2IntOpenCustomHashMap(rqR_2.id_extends());
   private final Map<rqM_2<?>, Lifecycle> id_byte = Maps.newIdentityHashMap();

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> id_class(DynamicOps<JsonElement> var1, rqM_2<? extends rVL<E>> var2, rqM_2<E> var3, Decoder<E> var4) {
      JsonElement var5 = this.id_class.get(var3);
      return var5 == null
         ? DataResult.error("Unknown element: " + var3)
         : var4.parse(var1, var5).setLifecycle(this.id_byte.get(var3)).map(var2x -> Pair.of(var2x, OptionalInt.of(this.id_break.getInt(var3))));
   }

   @Override
   public Collection<rqO_2> id_class(rqM_2<? extends rVL<?>> var1) {
      return this.id_class
         .keySet()
         .stream()
         .filter(var1x -> var1x.id_class(var1))
         .map(var1x -> new rqO_2(var1x.id_class().id_byte(), var1.id_class().id_break() + "/" + var1x.id_class().id_break() + ".json"))
         .collect(Collectors.toList());
   }

   public <E> void id_class(rVv_1 var1, rqM_2<E> var2, Encoder<E> var3, int var4, E var5, Lifecycle var6) {
      DataResult var7 = var3.encodeStart(rVp_1.id_class(JsonOps.INSTANCE, var1), var5);
      Optional var8 = var7.error();
      if (var8.isPresent()) {
         rVq_1.id_break.error("Error adding element: {}", ((PartialResult)var8.get()).message());
      } else {
         this.id_class.put(var2, (JsonElement)var7.result().get());
         this.id_break.put(var2, var4);
         this.id_byte.put(var2, var6);
      }
   }
}
