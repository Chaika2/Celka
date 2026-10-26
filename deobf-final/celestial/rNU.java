package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;

public class rNU extends rzX_2<rND> {
   public void class_(JsonObject var1, rND var2, JsonSerializationContext var3) {
      super.class_(var1, (rND)var2, var3);
      var1.addProperty("replace", var2.break_);
      JsonArray var4 = new JsonArray();

      for (rgP_2 var6 : var2.byte_) {
         var4.add(rgB_2.break_(var6));
      }

      var1.add("lore", var4);
      if (var2.protected_ != null) {
         var1.add("entity", var3.serialize(var2.protected_));
      }
   }

   public rND break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      boolean var4 = rpY_2.class_(var1, "replace", false);
      List var5 = Streams.stream(rpY_2.volatile_(var1, "lore")).map(rgB_2::class_).collect(ImmutableList.toImmutableList());
      rzB_2 var6 = rpY_2.class_(var1, "entity", (rzB_2)null, var2, rzB_2.class);
      return new rND(var3, var4, var5, var6);
   }
}
