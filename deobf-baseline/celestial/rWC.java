package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rWC implements JsonDeserializer<rWn_1>, JsonSerializer<rWn_1> {
   public JsonElement id_class(rWn_1 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("n", var1.id_protected);
      var4.addProperty("p", var1.id_throws);
      return var4;
   }

   public rWn_1 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.id_private(var1, "value");
      int var5 = rpY_2.id_extends(var4, "n");
      float var6 = rpY_2.id_implements(var4, "p");
      return new rWn_1(var5, var6);
   }
}
