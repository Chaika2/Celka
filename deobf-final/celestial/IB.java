package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IB implements JsonDeserializer<Ir_1> {
   protected Map<String, IU> class_(JsonDeserializationContext var1, JsonObject var2) {
      HashMap var3 = Maps.newHashMap();
      if (var2.has("variants")) {
         JsonObject var4 = rpY_2.native_(var2, "variants");

         for (Entry var6 : var4.entrySet()) {
            var3.put((String)var6.getKey(), (IU)var1.deserialize((JsonElement)var6.getValue(), IU.class));
         }
      }

      return var3;
   }

   public Ir_1 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      Map var5 = this.class_(var3, var4);
      fS_2 var6 = this.break_(var3, var4);
      if (var5.isEmpty() && (var6 == null || var6.break_().isEmpty())) {
         throw new JsonParseException("Neither 'variants' nor 'multipart' found");
      } else {
         return new Ir_1(var5, var6);
      }
   }

   protected fS_2 break_(JsonDeserializationContext var1, JsonObject var2) {
      if (!var2.has("multipart")) {
         return null;
      } else {
         JsonArray var3 = rpY_2.volatile_(var2, "multipart");
         return (fS_2)var1.deserialize(var3, fS_2.class);
      }
   }
}
