package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQd_1 implements rWY<rQx_1> {
   public void class_(JsonObject var1, rQx_1 var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.class_.class_());
      var1.add("entity", var3.serialize(var2.break_));
   }

   public rQx_1 break_(JsonObject var1, JsonDeserializationContext var2) {
      hY_2 var3 = hY_2.class_(var1.get("predicate"));
      return new rQx_1(var3, rpY_2.class_(var1, "entity", var2, rzB_2.class));
   }
}
