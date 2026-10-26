package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQC implements rWY<rQn_1> {
   public void class_(JsonObject var1, rQn_1 var2, JsonSerializationContext var3) {
      var1.addProperty("chance", var2.class_);
   }

   public rQn_1 break_(JsonObject var1, JsonDeserializationContext var2) {
      return new rQn_1(rpY_2.implements_(var1, "chance"));
   }
}
