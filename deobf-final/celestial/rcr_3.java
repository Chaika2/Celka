package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rcr_3 extends rzX_2<rNi_1> {
   public void class_(JsonObject var1, rNi_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNi_1)var2, var3);
      if (var2.byte_ != null) {
         var1.add("name", rgB_2.break_(var2.byte_));
      }

      if (var2.protected_ != null) {
         var1.add("entity", var3.serialize(var2.protected_));
      }
   }

   public rNi_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rVi_1 var4 = rgB_2.class_(var1.get("name"));
      rzB_2 var5 = rpY_2.class_(var1, "entity", (rzB_2)null, var2, rzB_2.class);
      return new rNi_1(var3, var4, var5);
   }
}
