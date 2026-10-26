package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

class rzw_3 extends rzb_3<T> {
   rzw_3(rzI_2 var1) {
      this.class_ = var1;
   }

   public void class_(JsonObject var1, T var2, JsonSerializationContext var3) {
      var1.add("children", var3.serialize(var2.protected_));
   }

   public final T break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rzE_2[] var4 = rpY_2.class_(var1, "children", var2, rzE_2[].class);
      return (T)this.class_.create(var4, var3);
   }
}
