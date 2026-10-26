package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

public class OV implements JsonDeserializer<Oj_1>, JsonSerializer<Oj_1> {
   public Oj_1 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.id_private(var1, "advancement");
      JsonObject var5 = rpY_2.id_class(var4, "criteria", new JsonObject());
      Oj_1 var6 = new Oj_1();

      for (Entry var8 : var5.entrySet()) {
         String var9 = (String)var8.getKey();
         var6.id_class.put(var9, OD.id_class(rpY_2.id_class((JsonElement)var8.getValue(), var9)));
      }

      return var6;
   }

   public JsonElement id_class(Oj_1 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      JsonObject var5 = new JsonObject();

      for (Entry var7 : var1.id_class.entrySet()) {
         OD var8 = (OD)var7.getValue();
         if (var8.id_class()) {
            var5.add((String)var7.getKey(), var8.id_throws());
         }
      }

      if (!var5.entrySet().isEmpty()) {
         var4.add("criteria", var5);
      }

      var4.addProperty("done", var1.id_class());
      return var4;
   }
}
