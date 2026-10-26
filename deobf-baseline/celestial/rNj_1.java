package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;

public class rNj_1 extends rzX_2<rNI> {
   public void id_class(JsonObject var1, rNI var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNI)var2, var3);
      var1.add("entries", var3.serialize(var2.id_break));
   }

   public rNI id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rzE_2[] var4 = rpY_2.id_class(var1, "entries", var2, rzE_2[].class);
      return new rNI(var3, Arrays.asList(var4));
   }
}
