package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.UUID;

class rgo_3 {
   public final UUID id_class;
   public final rgD_2 id_break;
   public final int id_byte;

   public rgo_3(UUID var1, rgD_2 var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return "GossipEntry{target=" + this.id_class + ", type=" + this.id_break + ", value=" + this.id_byte + "}";
   }

   public int id_class() {
      return this.id_byte * this.id_break.weight;
   }

   public <T> Dynamic<T> id_class(DynamicOps<T> var1) {
      return new Dynamic(
         var1,
         var1.createMap(
            ImmutableMap.of(
               var1.createString("Target"),
               rqV_2.id_class.encodeStart(var1, this.id_class).result().orElseThrow(RuntimeException::new),
               var1.createString("Type"),
               var1.createString(this.id_break.id),
               var1.createString("Value"),
               var1.createInt(this.id_byte)
            )
         )
      );
   }

   public static DataResult<rgo_3> id_class(Dynamic<?> var0) {
      return DataResult.unbox(
         DataResult.instance()
            .group(
               var0.get("Target").read(rqV_2.id_class), var0.get("Type").asString().map(rgD_2::id_class), var0.get("Value").asNumber().map(Number::intValue)
            )
            .apply(DataResult.instance(), rgo_3::new)
      );
   }
}
