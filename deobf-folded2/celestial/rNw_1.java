package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class rNw_1 extends rzX_2<rNq_1> {
   public void id_class(JsonObject var1, rNq_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNq_1)var2, var3);
      JsonArray var4 = new JsonArray();

      for (rNt_1 var6 : var2.id_break) {
         var4.add(var6.id_class(var3));
      }

      var1.add("modifiers", var4);
   }

   public rNq_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      JsonArray var4 = rpY_2.id_volatile(var1, "modifiers");
      ArrayList var5 = Lists.newArrayListWithExpectedSize(var4.size());

      for (JsonElement var7 : var4) {
         var5.add(rNt_1.id_class(rpY_2.id_private(var7, "modifier"), var2));
      }

      if (var5.isEmpty()) {
         throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
      } else {
         return new rNq_1(var3, var5);
      }
   }
}
