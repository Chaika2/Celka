package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Ie_1 implements JsonDeserializer<IU> {
   public IU id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      ArrayList var4 = Lists.newArrayList();
      if (var1.isJsonArray()) {
         JsonArray var5 = var1.getAsJsonArray();
         if (var5.size() == 0) {
            throw new JsonParseException("Empty variant array");
         }

         for (JsonElement var7 : var5) {
            var4.add((IK)var3.deserialize(var7, IK.class));
         }
      } else {
         var4.add((IK)var3.deserialize(var1, IK.class));
      }

      return new IU(var4);
   }
}
