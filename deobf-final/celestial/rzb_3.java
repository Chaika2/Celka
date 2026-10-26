package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class rzb_3<T extends rzE_2> implements rWY<T> {
   public abstract T class_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3);

   public abstract void class_(JsonObject var1, T var2, JsonSerializationContext var3);

   public final T break_(JsonObject var1, JsonDeserializationContext var2) {
      rQz_1[] var3 = rpY_2.class_(var1, "conditions", new rQz_1[0], var2, rQz_1[].class);
      return this.class_(var1, var2, var3);
   }

   public final void break_(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.byte_)) {
         var1.add("conditions", var3.serialize(var2.byte_));
      }

      this.class_(var1, (T)var2, var3);
   }
}
