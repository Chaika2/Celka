package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class wa_3 implements JsonDeserializer<we_3> {
   private String id_byte(JsonObject var1) {
      return rpY_2.id_class(var1, "parent", "");
   }

   protected boolean id_class(JsonObject var1) {
      return rpY_2.id_class(var1, "ambientocclusion", true);
   }

   private static Either<Ig_1, String> id_class(rqO_2 var0, String var1) {
      if (we_3.id_throws(var1)) {
         return Either.right(var1.substring(1));
      } else {
         rqO_2 var2 = rqO_2.id_break(var1);
         if (var2 == null) {
            throw new JsonParseException(var1 + " is not valid resource location");
         } else {
            return Either.left(new Ig_1(var0, var2));
         }
      }
   }

   public we_3 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      List var5 = this.id_break(var3, var4);
      String var6 = this.id_byte(var4);
      Map var7 = this.id_break(var4);
      boolean var8 = this.id_class(var4);
      Ik_1 var9 = Ik_1.id_class;
      if (var4.has("display")) {
         JsonObject var10 = rpY_2.id_native(var4, "display");
         var9 = (Ik_1)var3.deserialize(var10, Ik_1.class);
      }

      List var13 = this.id_class(var3, var4);
      wi_3 var11 = null;
      if (var4.has("gui_light")) {
         var11 = wi_3.id_class(rpY_2.id_case(var4, "gui_light"));
      }

      rqO_2 var12 = var6.isEmpty() ? null : new rqO_2(var6);
      return new we_3(var12, var5, var7, var8, var11, var9, var13);
   }

   protected List<IZ> id_class(JsonDeserializationContext var1, JsonObject var2) {
      ArrayList var3 = Lists.newArrayList();
      if (var2.has("overrides")) {
         for (JsonElement var5 : rpY_2.id_volatile(var2, "overrides")) {
            var3.add((IZ)var1.deserialize(var5, IZ.class));
         }
      }

      return var3;
   }

   protected List<IS> id_break(JsonDeserializationContext var1, JsonObject var2) {
      ArrayList var3 = Lists.newArrayList();
      if (var2.has("elements")) {
         for (JsonElement var5 : rpY_2.id_volatile(var2, "elements")) {
            var3.add((IS)var1.deserialize(var5, IS.class));
         }
      }

      return var3;
   }

   private Map<String, Either<Ig_1, String>> id_break(JsonObject var1) {
      rqO_2 var2 = fJ_2.id_class;
      HashMap var3 = Maps.newHashMap();
      if (var1.has("textures")) {
         JsonObject var4 = rpY_2.id_native(var1, "textures");

         for (Entry var6 : var4.entrySet()) {
            var3.put((String)var6.getKey(), id_class(var2, ((JsonElement)var6.getValue()).getAsString()));
         }
      }

      return var3;
   }
}
