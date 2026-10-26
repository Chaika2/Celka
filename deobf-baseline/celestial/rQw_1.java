package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQw_1 implements rWY<rQt_1> {
   public void id_class(JsonObject var1, rQt_1 var2, JsonSerializationContext var3) {
      var1.addProperty("enchantment", rVL.id_boolean.id_break(var2.id_class).toString());
      var1.add("chances", var3.serialize(var2.id_break));
   }

   public rQt_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      rqO_2 var3 = new rqO_2(rpY_2.id_case(var1, "enchantment"));
      ev_3 var4 = rVL.id_boolean.id_break(var3).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var3));
      float[] var5 = rpY_2.id_class(var1, "chances", var2, float[].class);
      return new rQt_1(var4, var5);
   }
}
