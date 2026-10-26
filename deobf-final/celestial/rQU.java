package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQU extends rzX_2<rQR> {
   public void class_(JsonObject var1, rQR var2, JsonSerializationContext var3) {
      super.class_(var1, (rQR)var2, var3);
      var1.addProperty("enchantment", rVL.boolean_.break_(var2.byte_).toString());
      var1.addProperty("formula", var2.protected_.class_().toString());
      JsonObject var4 = new JsonObject();
      var2.protected_.class_(var4, var3);
      if (var4.size() > 0) {
         var1.add("parameters", var4);
      }
   }

   public rQR break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "enchantment"));
      ev_3 var5 = rVL.boolean_.break_(var4).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + var4));
      rqO_2 var6 = new rqO_2(rpY_2.case_(var1, "formula"));
      rQK var7 = rQR.break_.get(var6);
      if (var7 == null) {
         throw new JsonParseException("Invalid formula id: " + var6);
      } else {
         rQo_1 var8;
         if (var1.has("parameters")) {
            var8 = var7.deserialize(rpY_2.native_(var1, "parameters"), var2);
         } else {
            var8 = var7.deserialize(new JsonObject(), var2);
         }

         return new rQR(var3, var5, var8);
      }
   }
}
