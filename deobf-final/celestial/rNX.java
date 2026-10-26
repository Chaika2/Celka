package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;

public class rNX extends rzX_2<rNs_1> {
   public void class_(JsonObject var1, rNs_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNs_1)var2, var3);
      var1.addProperty("source", var2.break_.sourceName);
      JsonArray var4 = new JsonArray();
      var2.byte_.stream().map(rNh_1::class_).forEach(var4::add);
      var1.add("ops", var4);
   }

   public rNs_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rNJ var4 = rNJ.class_(rpY_2.case_(var1, "source"));
      ArrayList var5 = Lists.newArrayList();

      for (JsonElement var7 : rpY_2.volatile_(var1, "ops")) {
         JsonObject var8 = rpY_2.private_(var7, "op");
         var5.add(rNh_1.class_(var8));
      }

      return new rNs_1(var3, var4, var5);
   }
}
