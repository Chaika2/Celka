package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class rza_3<T extends rzY_2> extends rzb_3<T> {
   public void id_class(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (var2.id_protected != 1) {
         var1.addProperty("weight", var2.id_protected);
      }

      if (var2.id_throws != 0) {
         var1.addProperty("quality", var2.id_throws);
      }

      if (!ArrayUtils.isEmpty(var2.id_case)) {
         var1.add("functions", var3.serialize(var2.id_case));
      }
   }

   public final T id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      int var4 = rpY_2.id_class(var1, "weight", 1);
      int var5 = rpY_2.id_class(var1, "quality", 0);
      rNL[] var6 = rpY_2.id_class(var1, "functions", new rNL[0], var2, rNL[].class);
      return this.id_break(var1, var2, var4, var5, var3, var6);
   }

   protected abstract T id_break(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, rQz_1[] var5, rNL[] var6);
}
