package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class rNk_1 extends rzX_2<rNx_1> {
   public void class_(JsonObject var1, rNx_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNx_1)var2, var3);
      if (!var2.byte_.isEmpty()) {
         JsonArray var4 = new JsonArray();

         for (ev_3 var6 : var2.byte_) {
            rqO_2 var7 = rVL.boolean_.break_(var6);
            if (var7 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + var6);
            }

            var4.add(new JsonPrimitive(var7.toString()));
         }

         var1.add("enchantments", var4);
      }
   }

   public rNx_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      ArrayList var4 = Lists.newArrayList();
      if (var1.has("enchantments")) {
         for (JsonElement var6 : rpY_2.volatile_(var1, "enchantments")) {
            String var7 = rpY_2.class_(var6, "enchantment");
            ev_3 var8 = rVL.boolean_.break_(new rqO_2(var7)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var7 + "'"));
            var4.add(var8);
         }
      }

      return new rNx_1(var3, var4);
   }
}
