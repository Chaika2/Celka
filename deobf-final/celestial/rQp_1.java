package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQp_1 implements rWY<rQy_1> {
   public void class_(JsonObject var1, rQy_1 var2, JsonSerializationContext var3) {
      var1.addProperty("name", var2.break_.toString());
   }

   public rQy_1 break_(JsonObject var1, JsonDeserializationContext var2) {
      rqO_2 var3 = new rqO_2(rpY_2.case_(var1, "name"));
      return new rQy_1(var3);
   }
}
