package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class rQh_1 implements rWY<rQM> {
   public void class_(JsonObject var1, rQM var2, JsonSerializationContext var3) {
      var1.addProperty("block", rVL.strictfp_.break_(var2.class_).toString());
      var1.add("properties", var2.break_.class_());
   }

   public rQM break_(JsonObject var1, JsonDeserializationContext var2) {
      rqO_2 var3 = new rqO_2(rpY_2.case_(var1, "block"));
      xd_3 var4 = rVL.strictfp_.break_(var3).orElseThrow(() -> new IllegalArgumentException("Can't find block " + var3));
      JS var5 = JS.class_(var1.get("properties"));
      var5.class_(var4.new_(), var1x -> {
         throw new JsonSyntaxException("Block " + var4 + " has no property " + var1x);
      });
      return new rQM(var4, var5);
   }
}
