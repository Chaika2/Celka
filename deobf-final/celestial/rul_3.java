package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class rul_3 implements JsonDeserializer<ruC_2>, JsonSerializer<ruC_2> {
   public JsonElement class_(ruC_2 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("max", var1.class_());
      var4.addProperty("online", var1.break_());
      if (var1.byte_() != null && var1.byte_().length > 0) {
         JsonArray var5 = new JsonArray();

         for (int var6 = 0; var6 < var1.byte_().length; var6++) {
            JsonObject var7 = new JsonObject();
            UUID var8 = var1.byte_()[var6].getId();
            var7.addProperty("id", var8 == null ? "" : var8.toString());
            var7.addProperty("name", var1.byte_()[var6].getName());
            var5.add(var7);
         }

         var4.add("sample", var5);
      }

      return var4;
   }

   public ruC_2 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "players");
      ruC_2 var5 = new ruC_2(rpY_2.extends_(var4, "max"), rpY_2.extends_(var4, "online"));
      if (rpY_2.byte_(var4, "sample")) {
         JsonArray var6 = rpY_2.volatile_(var4, "sample");
         if (var6.size() > 0) {
            GameProfile[] var7 = new GameProfile[var6.size()];

            for (int var8 = 0; var8 < var7.length; var8++) {
               JsonObject var9 = rpY_2.private_(var6.get(var8), "player[" + var8 + "]");
               String var10 = rpY_2.case_(var9, "id");
               var7[var8] = new GameProfile(UUID.fromString(var10), rpY_2.case_(var9, "name"));
            }

            var5.class_(var7);
         }
      }

      return var5;
   }
}
