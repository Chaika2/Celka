package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

class rwa_3 implements JsonDeserializer<rgP_2> {
   public rVi_1 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (var1.isJsonPrimitive()) {
         return new rgN_2(var1.getAsString());
      } else if (var1.isJsonArray()) {
         JsonArray var4 = var1.getAsJsonArray();
         rVi_1 var5 = null;

         for (JsonElement var7 : var4) {
            rVi_1 var8 = this.id_class(var7, var7.getClass(), var3);
            if (var5 == null) {
               var5 = var8;
            } else {
               var5.id_class(var8);
            }
         }

         return var5;
      } else {
         throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
      }
   }
}
