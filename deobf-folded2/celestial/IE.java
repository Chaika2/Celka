package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class IE implements JsonDeserializer<IS> {
   private rpB_2 id_byte(JsonObject var1) {
      String var2 = rpY_2.id_case(var1, "axis");
      rpB_2 var3 = rpB_2.id_class(var2.toLowerCase(Locale.ROOT));
      if (var3 == null) {
         throw new JsonParseException("Invalid rotation axis: " + var2);
      } else {
         return var3;
      }
   }

   protected IE() {
   }

   private rpr_3 id_class(String var1) {
      rpr_3 var2 = rpr_3.id_class(var1);
      if (var2 == null) {
         throw new JsonParseException("Unknown facing: " + var1);
      } else {
         return var2;
      }
   }

   private Map<rpr_3, IG> id_class(JsonDeserializationContext var1, JsonObject var2) {
      Map var3 = this.id_break(var1, var2);
      if (var3.isEmpty()) {
         throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
      } else {
         return var3;
      }
   }

   private rje_3 id_class(JsonObject var1, String var2) {
      JsonArray var3 = rpY_2.id_volatile(var1, var2);
      if (var3.size() != 3) {
         throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var3.size());
      } else {
         float[] var4 = new float[3];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = rpY_2.id_protected(var3.get(var5), var2 + "[" + var5 + "]");
         }

         return new rje_3(var4[0], var4[1], var4[2]);
      }
   }

   private IM id_class(JsonObject var1) {
      IM var2 = null;
      if (var1.has("rotation")) {
         JsonObject var3 = rpY_2.id_native(var1, "rotation");
         rje_3 var4 = this.id_class(var3, "origin");
         var4.id_class(0.0625F);
         rpB_2 var5 = this.id_byte(var3);
         float var6 = this.id_break(var3);
         boolean var7 = rpY_2.id_class(var3, "rescale", false);
         var2 = new IM(var4, var5, var6, var7);
      }

      return var2;
   }

   public IS id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      rje_3 var5 = this.id_throws(var4);
      rje_3 var6 = this.id_protected(var4);
      IM var7 = this.id_class(var4);
      Map var8 = this.id_class(var3, var4);
      if (var4.has("shade") && !rpY_2.id_break(var4, "shade")) {
         throw new JsonParseException("Expected shade to be a Boolean");
      } else {
         boolean var9 = rpY_2.id_class(var4, "shade", true);
         return new IS(var5, var6, var8, var7, var9);
      }
   }

   private Map<rpr_3, IG> id_break(JsonDeserializationContext var1, JsonObject var2) {
      EnumMap var3 = Maps.newEnumMap(rpr_3.class);
      JsonObject var4 = rpY_2.id_native(var2, "faces");

      for (Entry var6 : var4.entrySet()) {
         rpr_3 var7 = this.id_class((String)var6.getKey());
         var3.put(var7, (IG)var1.deserialize((JsonElement)var6.getValue(), IG.class));
      }

      return var3;
   }

   private float id_break(JsonObject var1) {
      float var2 = rpY_2.id_implements(var1, "angle");
      if (var2 != 0.0F && rfU_2.id_throws(var2) != 22.5F && rfU_2.id_throws(var2) != 45.0F) {
         throw new JsonParseException("Invalid rotation " + var2 + " found, only -45/-22.5/0/22.5/45 allowed");
      } else {
         return var2;
      }
   }

   private rje_3 id_throws(JsonObject var1) {
      rje_3 var2 = this.id_class(var1, "from");
      if (!(var2.id_class() < -16.0F)
         && !(var2.id_break() < -16.0F)
         && !(var2.id_byte() < -16.0F)
         && !(var2.id_class() > 32.0F)
         && !(var2.id_break() > 32.0F)
         && !(var2.id_byte() > 32.0F)) {
         return var2;
      } else {
         throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + var2);
      }
   }

   private rje_3 id_protected(JsonObject var1) {
      rje_3 var2 = this.id_class(var1, "to");
      if (!(var2.id_class() < -16.0F)
         && !(var2.id_break() < -16.0F)
         && !(var2.id_byte() < -16.0F)
         && !(var2.id_class() > 32.0F)
         && !(var2.id_break() > 32.0F)
         && !(var2.id_byte() > 32.0F)) {
         return var2;
      } else {
         throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + var2);
      }
   }
}
