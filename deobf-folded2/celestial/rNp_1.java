package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNp_1 extends rzX_2<rNH> {
   public void id_class(JsonObject var1, rNH var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNH)var2, var3);
      var1.add("count", var3.serialize(var2.id_break));
      if (var2.id_byte()) {
         var1.add("limit", var3.serialize(var2.id_byte));
      }
   }

   public rNH id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      int var4 = rpY_2.id_class(var1, "limit", 0);
      return new rNH(var3, rpY_2.id_class(var1, "count", var2, rzV_2.class), var4);
   }
}
