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
   public JsonElement class_(rzV_2 var1, Type var2, JsonSerializationContext var3) {
      if (var1.protected_ == var1.throws_) {
         return new JsonPrimitive(var1.protected_);
      } else {
         JsonObject var4 = new JsonObject();
         var4.addProperty("min", var1.protected_);
         var4.addProperty("max", var1.throws_);
         return var4;
      }
   }

   public rzV_2 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (rpY_2.break_(var1)) {
         return new rzV_2(rpY_2.protected_(var1, "value"));
      } else {
         JsonObject var4 = rpY_2.private_(var1, "value");
         float var5 = rpY_2.implements_(var4, "min");
         float var6 = rpY_2.implements_(var4, "max");
         return new rzV_2(var5, var6);
      }
   }
}
