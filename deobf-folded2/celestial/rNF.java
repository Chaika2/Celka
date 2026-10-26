package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNF extends rzX_2<rNv_1> {
   public void id_class(JsonObject var1, rNv_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNv_1)var2, var3);
      var1.add("entity", var3.serialize(var2.id_break));
   }

   public rNv_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rzB_2 var4 = rpY_2.id_class(var1, "entity", var2, rzB_2.class);
      return new rNv_1(var3, var4);
   }
}
