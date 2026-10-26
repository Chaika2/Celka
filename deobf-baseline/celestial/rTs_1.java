package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class rTs_1 implements Codec<rTS<E>> {
   rTs_1(Codec var1) {
      this.id_class = var1;
   }

   public <T> DataResult<Pair<rTS<E>, T>> decode(DynamicOps<T> var1, T var2) {
      Dynamic var3 = new Dynamic(var1, var2);
      return var3.get("data")
         .flatMap(this.id_class::parse)
         .map(var1x -> new rTS<>(var1x, var3.get("weight").asInt(1)))
         .map(var1x -> Pair.of(var1x, var1.empty()));
   }

   public <T> DataResult<T> id_class(rTS<E> var1, DynamicOps<T> var2, T var3) {
      return var2.mapBuilder().add("weight", var2.createInt(var1.id_break)).add("data", this.id_class.encodeStart(var2, var1.id_class)).build(var3);
   }
}
