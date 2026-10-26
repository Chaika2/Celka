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
   public void class_(JsonObject var1, rNq_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNq_1)var2, var3);
      JsonArray var4 = new JsonArray();

      for (rNt_1 var6 : var2.break_) {
         var4.add(var6.class_(var3));
      }

      var1.add("modifiers", var4);
   }

   public rNq_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      JsonArray var4 = rpY_2.volatile_(var1, "modifiers");
      ArrayList var5 = Lists.newArrayListWithExpectedSize(var4.size());

      for (JsonElement var7 : var4) {
         var5.add(rNt_1.class_(rpY_2.private_(var7, "modifier"), var2));
      }

      if (var5.isEmpty()) {
         throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
      } else {
         return new rNq_1(var3, var5);
      }
   }
}
