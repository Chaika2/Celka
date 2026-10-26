package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQb_1 implements rWY<rQE> {
   public void id_class(JsonObject var1, rQE var2, JsonSerializationContext var3) {
      var1.add("terms", var3.serialize(var2.id_class));
   }

   public rQE id_break(JsonObject var1, JsonDeserializationContext var2) {
      rQz_1[] var3 = rpY_2.id_class(var1, "terms", var2, rQz_1[].class);
      return new rQE(var3);
   }
}
