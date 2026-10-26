package celestial;

import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
public interface UW {
   Uk_1 get(xd_3 var1);

   default UW id_class(Consumer<Do_1> var1) {
      return var2 -> this.get(var2).id_class(var1);
   }

   default rqO_2 id_class(xd_3 var1, String var2, BiConsumer<rqO_2, Supplier<JsonElement>> var3) {
      return this.get(var1).id_class(var1, var2, var3);
   }

   default rqO_2 id_class(xd_3 var1, BiConsumer<rqO_2, Supplier<JsonElement>> var2) {
      return this.get(var1).id_class(var1, var2);
   }
}
