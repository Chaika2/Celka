package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rqh_3 implements JsonDeserializer<rqO_2>, JsonSerializer<rqO_2> {
   public JsonElement class_(rqO_2 var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(var1.toString());
   }

   public rqO_2 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new rqO_2(rpY_2.class_(var1, "location"));
   }
}
