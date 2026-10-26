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
   public Oj_1 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "advancement");
      JsonObject var5 = rpY_2.class_(var4, "criteria", new JsonObject());
      Oj_1 var6 = new Oj_1();

      for (Entry var8 : var5.entrySet()) {
         String var9 = (String)var8.getKey();
         var6.class_.put(var9, OD.class_(rpY_2.class_((JsonElement)var8.getValue(), var9)));
      }

      return var6;
   }

   public JsonElement class_(Oj_1 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      JsonObject var5 = new JsonObject();

      for (Entry var7 : var1.class_.entrySet()) {
         OD var8 = (OD)var7.getValue();
         if (var8.class_()) {
            var5.add((String)var7.getKey(), var8.throws_());
         }
      }

      if (!var5.entrySet().isEmpty()) {
         var4.add("criteria", var5);
      }

      var4.addProperty("done", var1.class_());
      return var4;
   }
}
