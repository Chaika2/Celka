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
   private final Map<rqM_2<?>, JsonElement> class_ = Maps.newIdentityHashMap();
   private final Object2IntMap<rqM_2<?>> break_ = new Object2IntOpenCustomHashMap(rqR_2.extends_());
   private final Map<rqM_2<?>, Lifecycle> byte_ = Maps.newIdentityHashMap();

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> class_(DynamicOps<JsonElement> var1, rqM_2<? extends rVL<E>> var2, rqM_2<E> var3, Decoder<E> var4) {
      JsonElement var5 = this.class_.get(var3);
      return var5 == null
         ? DataResult.error("Unknown element: " + var3)
         : var4.parse(var1, var5).setLifecycle(this.byte_.get(var3)).map(var2x -> Pair.of(var2x, OptionalInt.of(this.break_.getInt(var3))));
   }

   @Override
   public Collection<rqO_2> class_(rqM_2<? extends rVL<?>> var1) {
      return this.class_
         .keySet()
         .stream()
         .filter(var1x -> var1x.class_(var1))
         .map(var1x -> new rqO_2(var1x.class_().byte_(), var1.class_().break_() + "/" + var1x.class_().break_() + ".json"))
         .collect(Collectors.toList());
   }

   public <E> void class_(rVv_1 var1, rqM_2<E> var2, Encoder<E> var3, int var4, E var5, Lifecycle var6) {
      DataResult var7 = var3.encodeStart(rVp_1.class_(JsonOps.INSTANCE, var1), var5);
      Optional var8 = var7.error();
      if (var8.isPresent()) {
         rVq_1.break_.error("Error adding element: {}", ((PartialResult)var8.get()).message());
      } else {
         this.class_.put(var2, (JsonElement)var7.result().get());
         this.break_.put(var2, var4);
         this.byte_.put(var2, var6);
      }
   }
}
