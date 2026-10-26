package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQf_1 implements rWY<rQI> {
   public void id_class(JsonObject var1, rQI var2, JsonSerializationContext var3) {
      var1.addProperty("period", var2.id_class);
      var1.add("value", var3.serialize(var2.id_break));
   }

   public rQI id_break(JsonObject var1, JsonDeserializationContext var2) {
      Long var3 = var1.has("period") ? rpY_2.id_finally(var1, "period") : null;
      rzV_2 var4 = rpY_2.id_class(var1, "value", var2, rzV_2.class);
      return new rQI(var3, var4);
   }
}
