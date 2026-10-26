package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

class Dy_1 implements Supplier<JsonElement> {
   private final List<DS> class_;

   Dy_1(List<DS> var1) {
      this.class_ = var1;
   }

   public void class_(rCF<?, ?> var1) {
   }

   public JsonElement class_() {
      JsonObject var1 = new JsonObject();
      this.class_(var1);
      var1.add("apply", DS.class_(this.class_));
      return var1;
   }

   public void class_(JsonObject var1) {
   }
}
