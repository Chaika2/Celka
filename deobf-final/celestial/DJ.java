package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class DJ implements Supplier<JsonElement> {
   private final rqO_2 class_;

   public DJ(rqO_2 var1) {
      this.class_ = var1;
   }

   public JsonElement class_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("parent", this.class_.toString());
      return var1;
   }
}
