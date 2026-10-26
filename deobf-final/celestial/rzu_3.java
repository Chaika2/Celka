package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.apache.commons.lang3.ArrayUtils;

public class rzu_3 implements JsonDeserializer<rzN_2>, JsonSerializer<rzN_2> {
   public JsonElement class_(rzN_2 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.add("rolls", rzj_3.class_(var1.case_, var3));
      var4.add("entries", var3.serialize(var1.class_));
      if (var1.catch_.break_() != 0.0F && var1.catch_.byte_() != 0.0F) {
         var4.add("bonus_rolls", var3.serialize(var1.catch_));
      }

      if (!ArrayUtils.isEmpty(var1.break_)) {
         var4.add("conditions", var3.serialize(var1.break_));
      }

      if (!ArrayUtils.isEmpty(var1.protected_)) {
         var4.add("functions", var3.serialize(var1.protected_));
      }

      return var4;
   }

   public rzN_2 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "loot pool");
      rzE_2[] var5 = rpY_2.class_(var4, "entries", var3, rzE_2[].class);
      rQz_1[] var6 = rpY_2.class_(var4, "conditions", new rQz_1[0], var3, rQz_1[].class);
      rNL[] var7 = rpY_2.class_(var4, "functions", new rNL[0], var3, rNL[].class);
      rWK var8 = rzj_3.class_(var4.get("rolls"), var3);
      rzV_2 var9 = rpY_2.class_(var4, "bonus_rolls", new rzV_2(0.0F, 0.0F), var3, rzV_2.class);
      return new rzN_2(var5, var6, var7, var8, var9);
   }
}
