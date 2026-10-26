package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNB extends rzX_2<rNP> {
   public void class_(JsonObject var1, rNP var2, JsonSerializationContext var3) {
      super.class_(var1, (rNP)var2, var3);
      var1.addProperty("source", var2.break_.name);
   }

   public rNP break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rNS var4 = rNS.class_(rpY_2.case_(var1, "source"));
      return new rNP(var3, var4);
   }
}
