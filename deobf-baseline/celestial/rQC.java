package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQC implements rWY<rQn_1> {
   public void id_class(JsonObject var1, rQn_1 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", var2.id_class);
   }

   public rQn_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      return new rQn_1(rpY_2.id_implements(var1, "chance"));
   }
}
