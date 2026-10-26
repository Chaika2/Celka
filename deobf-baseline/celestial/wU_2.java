package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class wU_2 implements JsonDeserializer<wD_2> {
   protected wU_2() {
   }

   protected int id_class(JsonObject var1) {
      int var2 = rpY_2.id_class(var1, "rotation", 0);
      if (var2 >= 0 && var2 % 90 == 0 && var2 / 90 <= 3) {
         return var2;
      } else {
         throw new JsonParseException("Invalid rotation " + var2 + " found, only 0/90/180/270 allowed");
      }
   }

   public wD_2 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      float[] var5 = this.id_break(var4);
      int var6 = this.id_class(var4);
      return new wD_2(var5, var6);
   }

   private float[] id_break(JsonObject var1) {
      if (!var1.has("uv")) {
         return null;
      } else {
         JsonArray var2 = rpY_2.id_volatile(var1, "uv");
         if (var2.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + var2.size());
         } else {
            float[] var3 = new float[4];

            for (int var4 = 0; var4 < var3.length; var4++) {
               var3[var4] = rpY_2.id_protected(var2.get(var4), "uv[" + var4 + "]");
            }

            return var3;
         }
      }
   }
}
