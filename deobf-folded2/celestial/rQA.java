package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQA implements rWY<rQL> {
   public void id_class(JsonObject var1, rQL var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.id_class.id_class());
   }

   public rQL id_break(JsonObject var1, JsonDeserializationContext var2) {
      Xh_1 var3 = Xh_1.id_class(var1.get("predicate"));
      return new rQL(var3);
   }
}
