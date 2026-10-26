package celestial;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.HashSet;

public class rNr_1 extends rzX_2<rQa_1> {
   public void id_class(JsonObject var1, rQa_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rQa_1)var2, var3);
      var1.addProperty("block", rVL.id_strictfp.id_break(var2.id_break).toString());
      JsonArray var4 = new JsonArray();
      var2.id_byte.forEach(var1x -> var4.add(var1x.id_throws()));
      var1.add("properties", var4);
   }

   public rQa_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "block"));
      xd_3 var5 = rVL.id_strictfp.id_break(var4).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var4));
      rCF var6 = var5.id_new();
      HashSet var7 = Sets.newHashSet();
      JsonArray var8 = rpY_2.id_class(var1, "properties", (JsonArray)null);
      if (var8 != null) {
         var8.forEach(var2x -> var7.add(var6.id_class(rpY_2.id_class(var2x, "property"))));
      }

      return new rQa_1(var3, var5, var7);
   }
}
