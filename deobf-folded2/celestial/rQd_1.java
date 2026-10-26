package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQd_1 implements rWY<rQx_1> {
   public void id_class(JsonObject var1, rQx_1 var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.id_class.id_class());
      var1.add("entity", var3.serialize(var2.id_break));
   }

   public rQx_1 id_break(JsonObject var1, JsonDeserializationContext var2) {
      hY_2 var3 = hY_2.id_class(var1.get("predicate"));
      return new rQx_1(var3, rpY_2.id_class(var1, "entity", var2, rzB_2.class));
   }
}
