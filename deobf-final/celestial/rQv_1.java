package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQv_1 implements rWY<rQZ> {
   public void class_(JsonObject var1, rQZ var2, JsonSerializationContext var3) {
      var1.add("predicate", var2.class_.class_());
      if (var2.break_.b_() != 0) {
         var1.addProperty("offsetX", var2.break_.b_());
      }

      if (var2.break_.c_() != 0) {
         var1.addProperty("offsetY", var2.break_.c_());
      }

      if (var2.break_.d_() != 0) {
         var1.addProperty("offsetZ", var2.break_.d_());
      }
   }

   public rQZ break_(JsonObject var1, JsonDeserializationContext var2) {
      XN var3 = XN.class_(var1.get("predicate"));
      int var4 = rpY_2.class_(var1, "offsetX", 0);
      int var5 = rpY_2.class_(var1, "offsetY", 0);
      int var6 = rpY_2.class_(var1, "offsetZ", 0);
      return new rQZ(var3, new rfH_2(var4, var5, var6));
   }
}
