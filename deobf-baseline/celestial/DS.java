package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DS implements Supplier<JsonElement> {
   private final Map<DP<?>, DP<?>.celestial/DB> id_class = Maps.newLinkedHashMap();

   public static JsonElement id_class(List<DS> var0) {
      if (var0.size() == 1) {
         return ((DS)var0.get(0)).id_break();
      } else {
         JsonArray var1 = new JsonArray();
         var0.forEach(var1x -> var1.add(var1x.id_break()));
         return var1;
      }
   }

   public <T> DS id_class(DP<T> var1, T var2) {
      DB var3 = (DB)this.id_class.put(var1, var1.id_class(var2));
      if (var3 != null) {
         throw new IllegalStateException("Replacing value of " + var3 + " with " + var2);
      } else {
         return this;
      }
   }

   public static DS id_class() {
      return new DS();
   }

   public static DS id_class(DS var0, DS var1) {
      DS var2 = new DS();
      var2.id_class.putAll(var0.id_class);
      var2.id_class.putAll(var1.id_class);
      return var2;
   }

   public JsonElement id_break() {
      JsonObject var1 = new JsonObject();
      this.id_class.values().forEach(var1x -> var1x.id_class(var1));
      return var1;
   }
}
