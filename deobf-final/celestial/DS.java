package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DS implements Supplier<JsonElement> {
   private final Map<DP<?>, DP<?>.celestial/DB> class_ = Maps.newLinkedHashMap();

   public static JsonElement class_(List<DS> var0) {
      if (var0.size() == 1) {
         return ((DS)var0.get(0)).break_();
      } else {
         JsonArray var1 = new JsonArray();
         var0.forEach(var1x -> var1.add(var1x.break_()));
         return var1;
      }
   }

   public <T> DS class_(DP<T> var1, T var2) {
      DB var3 = (DB)this.class_.put(var1, var1.class_(var2));
      if (var3 != null) {
         throw new IllegalStateException("Replacing value of " + var3 + " with " + var2);
      } else {
         return this;
      }
   }

   public static DS class_() {
      return new DS();
   }

   public static DS class_(DS var0, DS var1) {
      DS var2 = new DS();
      var2.class_.putAll(var0.class_);
      var2.class_.putAll(var1.class_);
      return var2;
   }

   public JsonElement break_() {
      JsonObject var1 = new JsonObject();
      this.class_.values().forEach(var1x -> var1x.class_(var1));
      return var1;
   }
}
