package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQV implements rWY<rQj_1> {
   public void class_(JsonObject var1, rQj_1 var2, JsonSerializationContext var3) {
      var1.addProperty("raining", var2.class_);
      var1.addProperty("thundering", var2.break_);
   }

   public rQj_1 break_(JsonObject var1, JsonDeserializationContext var2) {
      Boolean var3 = var1.has("raining") ? rpY_2.private_(var1, "raining") : null;
      Boolean var4 = var1.has("thundering") ? rpY_2.private_(var1, "thundering") : null;
      return new rQj_1(var3, var4);
   }
}
