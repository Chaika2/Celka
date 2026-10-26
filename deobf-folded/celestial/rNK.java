package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNK extends rzX_2<rNo_1> {
   public void id_class(JsonObject var1, rNo_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNo_1)var2, var3);
      var1.addProperty("name", var2.id_break.toString());
      if (var2.id_byte != 0L) {
         var1.addProperty("seed", var2.id_byte);
      }
   }

   public rNo_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "name"));
      long var5 = rpY_2.id_class(var1, "seed", 0L);
      return new rNo_1(var3, var4, var5);
   }
}
