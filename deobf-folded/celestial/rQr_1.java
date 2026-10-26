package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQr_1 extends rza_3<rzi_3> {
   protected rzi_3 id_class(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, rQz_1[] var5, rNL[] var6) {
      rqO_2 var7 = new rqO_2(rpY_2.id_case(var1, "name"));
      return new rzi_3(var7, var3, var4, var5, var6);
   }

   public void id_class(JsonObject var1, rzi_3 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rzi_3)var2, var3);
      var1.addProperty("name", var2.id_catch.toString());
   }
}
