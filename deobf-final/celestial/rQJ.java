package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQJ implements rWY<rQX> {
   public void class_(JsonObject var1, rQX var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.class_.class_());
   }

   public rQX break_(JsonObject var1, JsonDeserializationContext var2) {
      hn_3 var3 = hn_3.class_(var1.get("predicate"));
      return new rQX(var3);
   }
}
