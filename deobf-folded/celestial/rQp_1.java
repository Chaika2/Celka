package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQp_1 implements rWY<rQy_1> {
   public void id_class(JsonObject var1, rQy_1 var2, JsonSerializationContext var3) {
      var1.addProperty("name", var2.id_break.toString());
   }

   public rQy_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      rqO_2 var3 = new rqO_2(rpY_2.id_case(var1, "name"));
      return new rQy_1(var3);
   }
}
