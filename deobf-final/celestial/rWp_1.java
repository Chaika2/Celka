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
   public JsonElement class_(rWy_1 var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(var1.protected_);
   }

   public rWy_1 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new rWy_1(rpY_2.case_(var1, "value"));
   }
}
