package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class rQh_1 implements rWY<rQM> {
   public void id_class(JsonObject var1, rQM var2, JsonSerializationContext var3) {
      var1.addProperty("block", rVL.id_strictfp.id_break(var2.id_class).toString());
      var1.add("properties", var2.id_break.id_class());
   }

   public rQM id_break(JsonObject var1, JsonDeserializationContext var2) {
      rqO_2 var3 = new rqO_2(rpY_2.id_case(var1, "block"));
      xd_3 var4 = rVL.id_strictfp.id_break(var3).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var3));
      JS var5 = JS.id_class(var1.get("properties"));
      var5.id_class(var4.id_new(), var1x -> {
         throw new JsonSyntaxException("Block " + var4 + " has no property " + var1x);
      });
      return new rQM(var4, var5);
   }
}
