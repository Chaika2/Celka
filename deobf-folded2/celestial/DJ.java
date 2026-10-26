package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class DJ implements Supplier<JsonElement> {
   private final rqO_2 id_class;

   public DJ(rqO_2 var1) {
      this.id_class = var1;
   }

   public JsonElement id_class() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("parent", this.id_class.toString());
      return var1;
   }
}
