package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNY extends rzX_2<rNR> {
   public void class_(JsonObject var1, rNR var2, JsonSerializationContext var3) {
      super.class_(var1, (rNR)var2, var3);
      var1.add("damage", var3.serialize(var2.byte_));
   }

   public rNR break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      return new rNR(var3, rpY_2.class_(var1, "damage", var2, rzV_2.class));
   }
}
