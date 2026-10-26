package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;

public class rNX extends rzX_2<rNs_1> {
   public void id_class(JsonObject var1, rNs_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNs_1)var2, var3);
      var1.addProperty("source", var2.id_break.sourceName);
      JsonArray var4 = new JsonArray();
      var2.id_byte.stream().map(rNh_1::id_class).forEach(var4::add);
      var1.add("ops", var4);
   }

   public rNs_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rNJ var4 = rNJ.id_class(rpY_2.id_case(var1, "source"));
      ArrayList var5 = Lists.newArrayList();

      for (JsonElement var7 : rpY_2.id_volatile(var1, "ops")) {
         JsonObject var8 = rpY_2.id_private(var7, "op");
         var5.add(rNh_1.id_class(var8));
      }

      return new rNs_1(var3, var4, var5);
   }
}
