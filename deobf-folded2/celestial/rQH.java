package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQH implements rWY<rQl_1> {
   public void id_class(JsonObject var1, rQl_1 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", var2.id_class);
      var1.addProperty("looting_multiplier", var2.id_break);
   }

   public rQl_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      return new rQl_1(rpY_2.id_implements(var1, "chance"), rpY_2.id_implements(var1, "looting_multiplier"));
   }
}
