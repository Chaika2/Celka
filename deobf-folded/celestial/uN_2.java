package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.function.Function;

public enum uN_2 {
   BITMAP("bitmap", uZ_2::id_class),
   TTF("ttf", uA_2::id_class),
   LEGACY_UNICODE("legacy_unicode", uC_2::id_class);

   private static final Map<String, uN_2> TYPES_BY_NAME = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      for (uN_2 var4 : values()) {
         var0.put(var4.name, var4);
      }
   });
   private final String name;
   private final Function<JsonObject, uu_3> factoryDeserializer;

   private uN_2(String var3, Function<JsonObject, uu_3> var4) {
      this.name = var3;
      this.factoryDeserializer = var4;
   }

   public uu_3 id_class(JsonObject var1) {
      return this.factoryDeserializer.apply(var1);
   }

   public static uN_2 id_class(String var0) {
      uN_2 var1 = TYPES_BY_NAME.get(var0);
      if (var1 == null) {
         throw new IllegalArgumentException("Invalid type: " + var0);
      } else {
         return var1;
      }
   }
}
