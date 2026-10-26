package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNg_1 extends rzX_2<rNV> {
   public void class_(JsonObject var1, rNV var2, JsonSerializationContext var3) {
      super.class_(var1, (rNV)var2, var3);
      var1.add("count", rzj_3.class_(var2.break_, var3));
   }

   public rNV break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rWK var4 = rzj_3.class_(var1.get("count"), var2);
      return new rNV(var3, var4);
   }
}
