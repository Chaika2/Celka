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
   public JsonElement class_(rWn_1 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("n", var1.protected_);
      var4.addProperty("p", var1.throws_);
      return var4;
   }

   public rWn_1 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "value");
      int var5 = rpY_2.extends_(var4, "n");
      float var6 = rpY_2.implements_(var4, "p");
      return new rWn_1(var5, var6);
   }
}
