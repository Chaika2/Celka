package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQU extends rzX_2<rQR> {
   public void id_class(JsonObject var1, rQR var2, JsonSerializationContext var3) {
      super.id_class(var1, (rQR)var2, var3);
      var1.addProperty("enchantment", rVL.id_boolean.id_break(var2.id_byte).toString());
      var1.addProperty("formula", var2.id_protected.id_class().toString());
      JsonObject var4 = new JsonObject();
      var2.id_protected.id_class(var4, var3);
      if (var4.size() > 0) {
         var1.add("parameters", var4);
      }
   }

   public rQR id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "enchantment"));
      ev_3 var5 = rVL.id_boolean.id_break(var4).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var4));
      rqO_2 var6 = new rqO_2(rpY_2.id_case(var1, "formula"));
      rQK var7 = rQR.id_break.get(var6);
      if (var7 == null) {
         throw new JsonParseException("Invalid formula id: " + var6);
      } else {
         rQo_1 var8;
         if (var1.has("parameters")) {
            var8 = var7.deserialize(rpY_2.id_native(var1, "parameters"), var2);
         } else {
            var8 = var7.deserialize(new JsonObject(), var2);
         }

         return new rQR(var3, var5, var8);
      }
   }
}
