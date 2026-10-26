package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;

public class rNU extends rzX_2<rND> {
   public void id_class(JsonObject var1, rND var2, JsonSerializationContext var3) {
      super.id_class(var1, (rND)var2, var3);
      var1.addProperty("replace", var2.id_break);
      JsonArray var4 = new JsonArray();

      for (rgP_2 var6 : var2.id_byte) {
         var4.add(rgB_2.id_break(var6));
      }

      var1.add("lore", var4);
      if (var2.id_protected != null) {
         var1.add("entity", var3.serialize(var2.id_protected));
      }
   }

   public rND id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      boolean var4 = rpY_2.id_class(var1, "replace", false);
      List var5 = Streams.stream(rpY_2.id_volatile(var1, "lore")).map(rgB_2::id_class).collect(ImmutableList.toImmutableList());
      rzB_2 var6 = rpY_2.id_class(var1, "entity", (rzB_2)null, var2, rzB_2.class);
      return new rND(var3, var4, var5, var6);
   }
}
