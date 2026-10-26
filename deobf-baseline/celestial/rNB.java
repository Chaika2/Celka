package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNB extends rzX_2<rNP> {
   public void id_class(JsonObject var1, rNP var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNP)var2, var3);
      var1.addProperty("source", var2.id_break.name);
   }

   public rNP id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rNS var4 = rNS.id_class(rpY_2.id_case(var1, "source"));
      return new rNP(var3, var4);
   }
}
