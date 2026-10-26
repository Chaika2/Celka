package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;

public class rzj_3 {
   private static final Map<rqO_2, Class<? extends rWK>> class_ = Maps.newHashMap();

   static {
      class_.put(rWK.break_, rzV_2.class);
      class_.put(rWK.byte_, rWn_1.class);
      class_.put(rWK.class_, rWy_1.class);
   }

   public static rWK class_(JsonElement var0, JsonDeserializationContext var1) throws JsonParseException {
      if (var0.isJsonPrimitive()) {
         return (rWK)var1.deserialize(var0, rWy_1.class);
      } else {
         JsonObject var2 = var0.getAsJsonObject();
         String var3 = rpY_2.class_(var2, "type", rWK.break_.toString());
         Class var4 = class_.get(new rqO_2(var3));
         if (var4 == null) {
            throw new JsonParseException("Unknown generator: " + var3);
         } else {
            return (rWK)var1.deserialize(var2, var4);
         }
      }
   }

   public static JsonElement class_(rWK var0, JsonSerializationContext var1) {
      JsonElement var2 = var1.serialize(var0);
      if (var2.isJsonObject()) {
         var2.getAsJsonObject().addProperty("type", var0.class_().toString());
      }

      return var2;
   }
}
