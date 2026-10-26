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

public class rzn_3 implements JsonDeserializer<rzL_2>, JsonSerializer<rzL_2> {
   public JsonElement class_(rzL_2 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if (var1.protected_ != rzL_2.break_) {
         rqO_2 var5 = rzz_3.class_(var1.protected_);
         if (var5 != null) {
            var4.addProperty("type", var5.toString());
         } else {
            rzL_2.byte_.warn("Failed to find id for param set " + var1.protected_);
         }
      }

      if (var1.throws_.length > 0) {
         var4.add("pools", var3.serialize(var1.throws_));
      }

      if (!ArrayUtils.isEmpty(var1.case_)) {
         var4.add("functions", var3.serialize(var1.case_));
      }

      return var4;
   }

   public rzL_2 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "loot table");
      rzN_2[] var5 = rpY_2.class_(var4, "pools", new rzN_2[0], var3, rzN_2[].class);
      rzk_3 var6 = null;
      if (var4.has("type")) {
         String var7 = rpY_2.case_(var4, "type");
         var6 = rzz_3.class_(new rqO_2(var7));
      }

      rNL[] var8 = rpY_2.class_(var4, "functions", new rNL[0], var3, rNL[].class);
      return new rzL_2(var6 != null ? var6 : rzz_3.extends_, var5, var8);
   }
}
