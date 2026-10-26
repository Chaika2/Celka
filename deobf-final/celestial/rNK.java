package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNK extends rzX_2<rNo_1> {
   public void class_(JsonObject var1, rNo_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNo_1)var2, var3);
      var1.addProperty("name", var2.break_.toString());
      if (var2.byte_ != 0L) {
         var1.addProperty("seed", var2.byte_);
      }
   }

   public rNo_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "name"));
      long var5 = rpY_2.class_(var1, "seed", 0L);
      return new rNo_1(var3, var4, var5);
   }
}
