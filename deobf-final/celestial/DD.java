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
   private final Optional<rqO_2> class_;
   private final Set<UX> break_;
   private Optional<String> byte_;

   public DD(Optional<rqO_2> var1, Optional<String> var2, UX... var3) {
      this.class_ = var1;
      this.byte_ = var2;
      this.break_ = ImmutableSet.copyOf(var3);
   }

   private Map<UX, rqO_2> class_(Do_1 var1) {
      return Streams.concat(new Stream[]{this.break_.stream(), var1.class_()}).collect(ImmutableMap.toImmutableMap(Function.identity(), var1::class_));
   }

   public rqO_2 class_(xd_3 var1, Do_1 var2, BiConsumer<rqO_2, Supplier<JsonElement>> var3) {
      return this.class_(DK.class_(var1, this.byte_.orElse("")), var2, var3);
   }

   public rqO_2 class_(xd_3 var1, String var2, Do_1 var3, BiConsumer<rqO_2, Supplier<JsonElement>> var4) {
      return this.class_(DK.class_(var1, var2 + this.byte_.orElse("")), var3, var4);
   }

   public rqO_2 class_(rqO_2 var1, Do_1 var2, BiConsumer<rqO_2, Supplier<JsonElement>> var3) {
      Map var4 = this.class_(var2);
      var3.accept(var1, () -> {
         JsonObject var2x = new JsonObject();
         this.class_.ifPresent(var1xx -> var2x.addProperty("parent", var1xx.toString()));
         if (!var4.isEmpty()) {
            JsonObject var3x = new JsonObject();
            var4.forEach((var1xx, var2xx) -> var3x.addProperty(var1xx.class_(), var2xx.toString()));
            var2x.add("textures", var3x);
         }

         return var2x;
      });
      return var1;
   }

   public rqO_2 break_(xd_3 var1, String var2, Do_1 var3, BiConsumer<rqO_2, Supplier<JsonElement>> var4) {
      return this.class_(DK.class_(var1, var2), var3, var4);
   }
}
