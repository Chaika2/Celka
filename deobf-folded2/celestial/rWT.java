package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rWT extends rza_3<rWq_1> {
   protected rWq_1 id_class(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, rQz_1[] var5, rNL[] var6) {
      rqO_2 var7 = new rqO_2(rpY_2.id_case(var1, "name"));
      return new rWq_1(var7, var3, var4, var5, var6);
   }

   public void id_class(JsonObject var1, rWq_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rWq_1)var2, var3);
      var1.addProperty("name", var2.id_catch.toString());
   }
}
