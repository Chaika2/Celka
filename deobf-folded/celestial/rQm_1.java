package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQm_1 implements rWY<rQu_1> {
   public void id_class(JsonObject var1, rQu_1 var2, JsonSerializationContext var3) {
   }

   public rQu_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      return rQu_1.id_class;
   }
}
