package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNC extends rzX_2<rNn_1> {
   public void id_class(JsonObject var1, rNn_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNn_1)var2, var3);
      var1.add("limit", var3.serialize(var2.id_break));
   }

   public rNn_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rWD var4 = rpY_2.id_class(var1, "limit", var2, rWD.class);
      return new rNn_1(var3, var4);
   }
}
