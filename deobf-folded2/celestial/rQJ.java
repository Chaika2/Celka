package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQJ implements rWY<rQX> {
   public void id_class(JsonObject var1, rQX var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.id_class.id_class());
   }

   public rQX id_break(JsonObject var1, JsonDeserializationContext var2) {
      hn_3 var3 = hn_3.id_class(var1.get("predicate"));
      return new rQX(var3);
   }
}
