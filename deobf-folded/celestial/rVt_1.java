package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.OptionalInt;

class rVt_1 implements rVT {
   rVt_1(rAL var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "ResourceAccess[" + this.id_class + "]";
   }

   @Override
   public Collection<rqO_2> id_class(rqM_2<? extends rVL<?>> var1) {
      return this.id_class.id_class(var1.id_class().id_break(), var0 -> var0.endsWith(".json"));
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> id_class(DynamicOps<JsonElement> var1, rqM_2<? extends rVL<E>> var2, rqM_2<E> var3, Decoder<E> var4) {
      rqO_2 var5 = var3.id_class();
      rqO_2 var6 = new rqO_2(var5.id_byte(), var2.id_class().id_break() + "/" + var5.id_break() + ".json");

      try {
         DataResult var11;
         try (
            rAF var7 = this.id_class.id_class(var6);
            InputStreamReader var8 = new InputStreamReader(var7.id_break(), StandardCharsets.UTF_8);
         ) {
            JsonParser var9 = new JsonParser();
            JsonElement var10 = var9.parse(var8);
            var11 = var4.parse(var1, var10).map(var0 -> Pair.of(var0, OptionalInt.empty()));
         }

         return var11;
      } catch (JsonSyntaxException | IOException | JsonIOException var16) {
         return DataResult.error("Failed to parse " + var6 + " file: " + var16.getMessage());
      }
   }
}
