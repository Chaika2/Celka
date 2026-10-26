package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.UUID;

class rgo_3 {
   public final UUID class_;
   public final rgD_2 break_;
   public final int byte_;

   public rgo_3(UUID var1, rgD_2 var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public String toString() {
      return "GossipEntry{target=" + this.class_ + ", type=" + this.break_ + ", value=" + this.byte_ + "}";
   }

   public int class_() {
      return this.byte_ * this.break_.weight;
   }

   public <T> Dynamic<T> class_(DynamicOps<T> var1) {
      return new Dynamic(
         var1,
         var1.createMap(
            ImmutableMap.of(
               var1.createString("Target"),
               rqV_2.class_.encodeStart(var1, this.class_).result().orElseThrow(RuntimeException::new),
               var1.createString("Type"),
               var1.createString(this.break_.id),
               var1.createString("Value"),
               var1.createInt(this.byte_)
            )
         )
      );
   }

   public static DataResult<rgo_3> class_(Dynamic<?> var0) {
      return DataResult.unbox(
         DataResult.instance()
            .group(var0.get("Target").read(rqV_2.class_), var0.get("Type").asString().map(rgD_2::class_), var0.get("Value").asNumber().map(Number::intValue))
            .apply(DataResult.instance(), rgo_3::new)
      );
   }
}
