package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ruH_2 implements JsonDeserializer<run_3>, JsonSerializer<run_3> {
   public JsonElement class_(run_3 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if (var1.class_() != null) {
         var4.add("description", var3.serialize(var1.class_()));
      }

      if (var1.break_() != null) {
         var4.add("players", var3.serialize(var1.break_()));
      }

      if (var1.byte_() != null) {
         var4.add("version", var3.serialize(var1.byte_()));
      }

      if (var1.protected_() != null) {
         var4.addProperty("favicon", var1.protected_());
      }

      return var4;
   }

   public run_3 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "status");
      run_3 var5 = new run_3();
      if (var4.has("description")) {
         var5.class_((rgP_2)var3.deserialize(var4.get("description"), rgP_2.class));
      }

      if (var4.has("players")) {
         var5.class_((ruC_2)var3.deserialize(var4.get("players"), ruC_2.class));
      }

      if (var4.has("version")) {
         var5.class_((ruy_3)var3.deserialize(var4.get("version"), ruy_3.class));
      }

      if (var4.has("favicon")) {
         var5.class_(rpY_2.case_(var4, "favicon"));
      }

      return var5;
   }
}
