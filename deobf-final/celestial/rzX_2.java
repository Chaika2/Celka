package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class rzX_2<T extends rzO_2> implements rWY<T> {
   public abstract T class_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3);

   public void class_(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.class_)) {
         var1.add("conditions", var3.serialize(var2.class_));
      }
   }

   public final T break_(JsonObject var1, JsonDeserializationContext var2) {
      rQz_1[] var3 = rpY_2.class_(var1, "conditions", new rQz_1[0], var2, rQz_1[].class);
      return this.class_(var1, var2, var3);
   }
}
