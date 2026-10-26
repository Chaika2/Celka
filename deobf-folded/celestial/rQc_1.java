package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQc_1 implements rWY<rQN> {
   public void id_class(JsonObject var1, rQN var2, JsonSerializationContext var3) {
      var1.add("term", var3.serialize(var2.id_class));
   }

   public rQN id_break(JsonObject var1, JsonDeserializationContext var2) {
      rQz_1 var3 = rpY_2.id_class(var1, "term", var2, rQz_1.class);
      return new rQN(var3);
   }
}
