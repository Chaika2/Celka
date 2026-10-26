package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public class VP implements rAo_1<ji_3> {
   @Override
   public String id_class() {
      return "animation";
   }

   private ja_3 id_class(int var1, JsonElement var2) {
      if (var2.isJsonPrimitive()) {
         return new ja_3(rpY_2.id_case(var2, "frames[" + var1 + "]"));
      } else if (var2.isJsonObject()) {
         JsonObject var3 = rpY_2.id_private(var2, "frames[" + var1 + "]");
         int var4 = rpY_2.id_class(var3, "time", -1);
         if (var3.has("time")) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)var4, "Invalid frame time");
         }

         int var5 = rpY_2.id_extends(var3, "index");
         Validate.inclusiveBetween(0L, 2147483647L, (long)var5, "Invalid frame index");
         return new ja_3(var5, var4);
      } else {
         return null;
      }
   }

   public ji_3 id_class(JsonObject var1) {
      ArrayList var2 = Lists.newArrayList();
      int var3 = rpY_2.id_class(var1, "frametime", 1);
      if (var3 != 1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var3, "Invalid default frame time");
      }

      if (var1.has("frames")) {
         try {
            JsonArray var4 = rpY_2.id_volatile(var1, "frames");

            for (int var5 = 0; var5 < var4.size(); var5++) {
               JsonElement var6 = var4.get(var5);
               ja_3 var7 = this.id_class(var5, var6);
               if (var7 != null) {
                  var2.add(var7);
               }
            }
         } catch (ClassCastException var8) {
            throw new JsonParseException("Invalid animation->frames: expected array, was " + var1.get("frames"), var8);
         }
      }

      int var9 = rpY_2.id_class(var1, "width", -1);
      int var10 = rpY_2.id_class(var1, "height", -1);
      if (var9 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var9, "Invalid width");
      }

      if (var10 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var10, "Invalid height");
      }

      boolean var11 = rpY_2.id_class(var1, "interpolate", false);
      return new ji_3(var2, var9, var10, var3, var11);
   }
}
