package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQV implements rWY<rQj_1> {
   public void id_class(JsonObject var1, rQj_1 var2, JsonSerializationContext var3) {
      var1.addProperty("raining", var2.id_class);
      var1.addProperty("thundering", var2.id_break);
   }

   public rQj_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      Boolean var3 = var1.has("raining") ? rpY_2.id_private(var1, "raining") : null;
      Boolean var4 = var1.has("thundering") ? rpY_2.id_private(var1, "thundering") : null;
      return new rQj_1(var3, var4);
   }
}
