package celestial;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.HashSet;

public class rNr_1 extends rzX_2<rQa_1> {
   public void class_(JsonObject var1, rQa_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rQa_1)var2, var3);
      var1.addProperty("block", rVL.strictfp_.break_(var2.break_).toString());
      JsonArray var4 = new JsonArray();
      var2.byte_.forEach(var1x -> var4.add(var1x.throws_()));
      var1.add("properties", var4);
   }

   public rQa_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "block"));
      xd_3 var5 = rVL.strictfp_.break_(var4).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var4));
      rCF var6 = var5.new_();
      HashSet var7 = Sets.newHashSet();
      JsonArray var8 = rpY_2.class_(var1, "properties", (JsonArray)null);
      if (var8 != null) {
         var8.forEach(var2x -> var7.add(var6.class_(rpY_2.class_(var2x, "property"))));
      }

      return new rQa_1(var3, var5, var7);
   }
}
