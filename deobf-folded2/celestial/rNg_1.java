package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNg_1 extends rzX_2<rNV> {
   public void id_class(JsonObject var1, rNV var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNV)var2, var3);
      var1.add("count", rzj_3.id_class(var2.id_break, var3));
   }

   public rNV id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rWK var4 = rzj_3.id_class(var1.get("count"), var2);
      return new rNV(var3, var4);
   }
}
