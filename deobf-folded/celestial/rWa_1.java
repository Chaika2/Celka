package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rWa_1 extends rza_3<rWe_1> {
   protected rWe_1 id_class(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, rQz_1[] var5, rNL[] var6) {
      rdb_3 var7 = rpY_2.id_catch(var1, "name");
      return new rWe_1(var7, var3, var4, var5, var6);
   }

   public void id_class(JsonObject var1, rWe_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rWe_1)var2, var3);
      rqO_2 var4 = rVL.id_for.id_break(var2.id_catch);
      if (var4 == null) {
         throw new IllegalArgumentException("Can't serialize unknown item " + var2.id_catch);
      } else {
         var1.addProperty("name", var4.toString());
      }
   }
}
