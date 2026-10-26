package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

class Dy_1 implements Supplier<JsonElement> {
   private final List<DS> id_class;

   Dy_1(List<DS> var1) {
      this.id_class = var1;
   }

   public void id_class(rCF<?, ?> var1) {
   }

   public JsonElement id_class() {
      JsonObject var1 = new JsonObject();
      this.id_class(var1);
      var1.add("apply", DS.id_class(this.id_class));
      return var1;
   }

   public void id_class(JsonObject var1) {
   }
}
