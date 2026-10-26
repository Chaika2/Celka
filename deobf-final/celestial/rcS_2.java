package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;

public class rcS_2 extends rzX_2<rcP_2> {
   public void class_(JsonObject var1, rcP_2 var2, JsonSerializationContext var3) {
      super.class_(var1, (rcP_2)var2, var3);
      if (!var2.break_.isEmpty()) {
         JsonArray var4 = new JsonArray();

         for (rLR var6 : var2.break_.keySet()) {
            JsonObject var7 = new JsonObject();
            rqO_2 var8 = rVL.const_.break_(var6);
            if (var8 == null) {
               throw new IllegalArgumentException("Don't know how to serialize mob effect " + var6);
            }

            var7.add("type", new JsonPrimitive(var8.toString()));
            var7.add("duration", var3.serialize(var2.break_.get(var6)));
            var4.add(var7);
         }

         var1.add("effects", var4);
      }
   }

   public rcP_2 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      HashMap var4 = Maps.newHashMap();
      if (var1.has("effects")) {
         for (JsonElement var6 : rpY_2.volatile_(var1, "effects")) {
            String var7 = rpY_2.case_(var6.getAsJsonObject(), "type");
            rLR var8 = rVL.const_.break_(new rqO_2(var7)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + var7 + "'"));
            rzV_2 var9 = rpY_2.class_(var6.getAsJsonObject(), "duration", var2, rzV_2.class);
            var4.put(var8, var9);
         }
      }

      return new rcP_2(var3, var4);
   }
}
