package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQc_1 implements rWY<rQN> {
   public void class_(JsonObject var1, rQN var2, JsonSerializationContext var3) {
      var1.add("term", var3.serialize(var2.class_));
   }

   public rQN break_(JsonObject var1, JsonDeserializationContext var2) {
      rQz_1 var3 = rpY_2.class_(var1, "term", var2, rQz_1.class);
      return new rQN(var3);
   }
}
