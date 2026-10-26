package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNQ extends rzX_2<rNW> {
   public void id_class(JsonObject var1, rNW var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNW)var2, var3);
      var1.add("levels", rzj_3.id_class(var2.id_break, var3));
      var1.addProperty("treasure", var2.id_byte);
   }

   public rNW id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rWK var4 = rzj_3.id_class(var1.get("levels"), var2);
      boolean var5 = rpY_2.id_class(var1, "treasure", false);
      return new rNW(var3, var4, var5);
   }
}
