package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class rQW implements rWY<rQk_1> {
   public void class_(JsonObject var1, rQk_1 var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();

      for (Entry var6 : var2.class_.entrySet()) {
         var4.add((String)var6.getKey(), var3.serialize(var6.getValue()));
      }

      var1.add("scores", var4);
      var1.add("entity", var3.serialize(var2.break_));
   }

   public rQk_1 break_(JsonObject var1, JsonDeserializationContext var2) {
      Set var3 = rpY_2.native_(var1, "scores").entrySet();
      LinkedHashMap var4 = Maps.newLinkedHashMap();

      for (Entry var6 : var3) {
         var4.put((String)var6.getKey(), rpY_2.class_((JsonElement)var6.getValue(), "score", var2, rzV_2.class));
      }

      return new rQk_1(var4, rpY_2.class_(var1, "entity", var2, rzB_2.class));
   }
}
