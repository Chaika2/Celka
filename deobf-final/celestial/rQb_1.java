package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQb_1 implements rWY<rQE> {
   public void class_(JsonObject var1, rQE var2, JsonSerializationContext var3) {
      var1.add("terms", var3.serialize(var2.class_));
   }

   public rQE break_(JsonObject var1, JsonDeserializationContext var2) {
      rQz_1[] var3 = rpY_2.class_(var1, "terms", var2, rQz_1[].class);
      return new rQE(var3);
   }
}
