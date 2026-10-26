package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rup_3 implements JsonDeserializer<ruy_3>, JsonSerializer<ruy_3> {
   public JsonElement class_(ruy_3 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var1.class_());
      var4.addProperty("protocol", var1.break_());
      return var4;
   }

   public ruy_3 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "version");
      return new ruy_3(rpY_2.case_(var4, "name"), rpY_2.extends_(var4, "protocol"));
   }
}
