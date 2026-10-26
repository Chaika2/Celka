package celestial;

import com.google.common.collect.Streams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fM_2 implements JsonDeserializer<fb_3> {
   static fB_2 id_class(JsonObject var0) {
      Set var1 = var0.entrySet();
      if (var1.isEmpty()) {
         throw new JsonParseException("No elements found in selector");
      } else if (var1.size() == 1) {
         if (var0.has("OR")) {
            List var3 = Streams.stream(rpY_2.id_volatile(var0, "OR")).map(var0x -> id_class(var0x.getAsJsonObject())).collect(Collectors.toList());
            return new fE_2(var3);
         } else if (var0.has("AND")) {
            List var2 = Streams.stream(rpY_2.id_volatile(var0, "AND")).map(var0x -> id_class(var0x.getAsJsonObject())).collect(Collectors.toList());
            return new fP_2(var2);
         } else {
            return id_class((Entry<String, JsonElement>)var1.iterator().next());
         }
      } else {
         return new fP_2(var1.stream().map(fM_2::id_class).collect(Collectors.toList()));
      }
   }

   private static fB_2 id_class(Entry<String, JsonElement> var0) {
      return new fG_2(var0.getKey(), var0.getValue().getAsString());
   }

   public fb_3 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      return new fb_3(this.id_break(var4), (IU)var3.deserialize(var4.get("apply"), IU.class));
   }

   private fB_2 id_break(JsonObject var1) {
      return var1.has("when") ? id_class(rpY_2.id_native(var1, "when")) : fB_2.id_class;
   }
}
