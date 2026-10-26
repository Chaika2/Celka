package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQv_1 implements rWY<rQZ> {
   public void id_class(JsonObject var1, rQZ var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.id_class.id_class());
      if (var2.id_break.b_() != 0) {
         var1.addProperty("offsetX", var2.id_break.b_());
      }

      if (var2.id_break.c_() != 0) {
         var1.addProperty("offsetY", var2.id_break.c_());
      }

      if (var2.id_break.d_() != 0) {
         var1.addProperty("offsetZ", var2.id_break.d_());
      }
   }

   public rQZ id_break(JsonObject var1, JsonDeserializationContext var2) {
      XN var3 = XN.id_class(var1.get("predicate"));
      int var4 = rpY_2.id_class(var1, "offsetX", 0);
      int var5 = rpY_2.id_class(var1, "offsetY", 0);
      int var6 = rpY_2.id_class(var1, "offsetZ", 0);
      return new rQZ(var3, new rfH_2(var4, var5, var6));
   }
}
