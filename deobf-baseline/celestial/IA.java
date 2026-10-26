package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class IA implements JsonDeserializer<IL> {
   private static final rje_3 id_class = new rje_3(0.0F, 0.0F, 0.0F);
   private static final rje_3 id_break = new rje_3(0.0F, 0.0F, 0.0F);
   private static final rje_3 id_byte = new rje_3(1.0F, 1.0F, 1.0F);

   protected IA() {
   }

   public IL id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      rje_3 var5 = this.id_class(var4, "rotation", id_class);
      rje_3 var6 = this.id_class(var4, "translation", id_break);
      var6.id_class(0.0625F);
      var6.id_class(-5.0F, 5.0F);
      rje_3 var7 = this.id_class(var4, "scale", id_byte);
      var7.id_class(-4.0F, 4.0F);
      return new IL(var5, var6, var7);
   }

   private rje_3 id_class(JsonObject var1, String var2, rje_3 var3) {
      if (!var1.has(var2)) {
         return var3;
      } else {
         JsonArray var4 = rpY_2.id_volatile(var1, var2);
         if (var4.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var4.size());
         } else {
            float[] var5 = new float[3];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = rpY_2.id_protected(var4.get(var6), var2 + "[" + var6 + "]");
            }

            return new rje_3(var5[0], var5[1], var5[2]);
         }
      }
   }
}
