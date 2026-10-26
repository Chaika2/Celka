package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQw_1 implements rWY<rQt_1> {
   public void class_(JsonObject var1, rQt_1 var2, JsonSerializationContext var3) {
      var1.addProperty("enchantment", rVL.boolean_.break_(var2.class_).toString());
      var1.add("chances", var3.serialize(var2.break_));
   }

   public rQt_1 break_(JsonObject var1, JsonDeserializationContext var2) {
      rqO_2 var3 = new rqO_2(rpY_2.case_(var1, "enchantment"));
      ev_3 var4 = rVL.boolean_.break_(var3).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var3));
      float[] var5 = rpY_2.class_(var1, "chances", var2, float[].class);
      return new rQt_1(var4, var5);
   }
}
