package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rzg_3 implements JsonDeserializer<rzV_2>, JsonSerializer<rzV_2> {
   public JsonElement id_class(rzV_2 var1, Type var2, JsonSerializationContext var3) {
      if (var1.id_protected == var1.id_throws) {
         return new JsonPrimitive(var1.id_protected);
      } else {
         JsonObject var4 = new JsonObject();
         var4.addProperty("min", var1.id_protected);
         var4.addProperty("max", var1.id_throws);
         return var4;
      }
   }

   public rzV_2 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (rpY_2.id_break(var1)) {
         return new rzV_2(rpY_2.id_protected(var1, "value"));
      } else {
         JsonObject var4 = rpY_2.id_private(var1, "value");
         float var5 = rpY_2.id_implements(var4, "min");
         float var6 = rpY_2.id_implements(var4, "max");
         return new rzV_2(var5, var6);
      }
   }
}
