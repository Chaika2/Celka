package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rWp_1 implements JsonDeserializer<rWy_1>, JsonSerializer<rWy_1> {
   public JsonElement id_class(rWy_1 var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(var1.id_protected);
   }

   public rWy_1 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new rWy_1(rpY_2.id_case(var1, "value"));
   }
}
