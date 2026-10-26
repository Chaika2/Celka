package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNC extends rzX_2<rNn_1> {
   public void class_(JsonObject var1, rNn_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNn_1)var2, var3);
      var1.add("limit", var3.serialize(var2.break_));
   }

   public rNn_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rWD var4 = rpY_2.class_(var1, "limit", var2, rWD.class);
      return new rNn_1(var3, var4);
   }
}
