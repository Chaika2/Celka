package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DD {
   private final Optional<rqO_2> id_class;
   private final Set<UX> id_break;
   private Optional<String> id_byte;

   public DD(Optional<rqO_2> var1, Optional<String> var2, UX... var3) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_break = ImmutableSet.copyOf(var3);
   }

   private Map<UX, rqO_2> id_class(Do_1 var1) {
      return Streams.concat(new Stream[]{this.id_break.stream(), var1.id_class()}).collect(ImmutableMap.toImmutableMap(Function.identity(), var1::id_class));
   }

   public rqO_2 id_class(xd_3 var1, Do_1 var2, BiConsumer<rqO_2, Supplier<JsonElement>> var3) {
      return this.id_class(DK.id_class(var1, this.id_byte.orElse("")), var2, var3);
   }

   public rqO_2 id_class(xd_3 var1, String var2, Do_1 var3, BiConsumer<rqO_2, Supplier<JsonElement>> var4) {
      return this.id_class(DK.id_class(var1, var2 + this.id_byte.orElse("")), var3, var4);
   }

   public rqO_2 id_class(rqO_2 var1, Do_1 var2, BiConsumer<rqO_2, Supplier<JsonElement>> var3) {
      Map var4 = this.id_class(var2);
      var3.accept(var1, () -> {
         JsonObject var2x = new JsonObject();
         this.id_class.ifPresent(var1xx -> var2x.addProperty("parent", var1xx.toString()));
         if (!var4.isEmpty()) {
            JsonObject var3x = new JsonObject();
            var4.forEach((var1xx, var2xx) -> var3x.addProperty(var1xx.id_class(), var2xx.toString()));
            var2x.add("textures", var3x);
         }

         return var2x;
      });
      return var1;
   }

   public rqO_2 id_break(xd_3 var1, String var2, Do_1 var3, BiConsumer<rqO_2, Supplier<JsonElement>> var4) {
      return this.id_class(DK.id_class(var1, var2), var3, var4);
   }
}
