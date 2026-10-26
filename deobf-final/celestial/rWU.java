package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rWU implements JsonDeserializer<rWD>, JsonSerializer<rWD> {
   public JsonElement class_(rWD var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if (var1.break_ != null) {
         var4.addProperty("max", var1.break_);
      }

      if (var1.class_ != null) {
         var4.addProperty("min", var1.class_);
      }

      return var4;
   }

   public rWD class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "value");
      Integer var5 = var4.has("min") ? rpY_2.extends_(var4, "min") : null;
      Integer var6 = var4.has("max") ? rpY_2.extends_(var4, "max") : null;
      return new rWD(var5, var6);
   }
}
