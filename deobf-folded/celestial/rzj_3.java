package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;

public class rzj_3 {
   private static final Map<rqO_2, Class<? extends rWK>> id_class = Maps.newHashMap();

   static {
      id_class.put(rWK.id_break, rzV_2.class);
      id_class.put(rWK.id_byte, rWn_1.class);
      id_class.put(rWK.id_class, rWy_1.class);
   }

   public static rWK id_class(JsonElement var0, JsonDeserializationContext var1) throws JsonParseException {
      if (var0.isJsonPrimitive()) {
         return (rWK)var1.deserialize(var0, rWy_1.class);
      } else {
         JsonObject var2 = var0.getAsJsonObject();
         String var3 = rpY_2.id_class(var2, "type", rWK.id_break.toString());
         Class var4 = id_class.get(new rqO_2(var3));
         if (var4 == null) {
            throw new JsonParseException("Unknown generator: " + var3);
         } else {
            return (rWK)var1.deserialize(var2, var4);
         }
      }
   }

   public static JsonElement id_class(rWK var0, JsonSerializationContext var1) {
      JsonElement var2 = var1.serialize(var0);
      if (var2.isJsonObject()) {
         var2.getAsJsonObject().addProperty("type", var0.id_class().toString());
      }

      return var2;
   }
}
