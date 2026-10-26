package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;

public class rgm_3 implements JsonDeserializer<rgc_3>, JsonSerializer<rgc_3> {
   private static rgl_3 id_byte(JsonObject var0) {
      if (var0.has("clickEvent")) {
         JsonObject var1 = rpY_2.id_native(var0, "clickEvent");
         String var2 = rpY_2.id_class(var1, "action", (String)null);
         rgH_2 var3 = var2 == null ? null : rgH_2.id_class(var2);
         String var4 = rpY_2.id_class(var1, "value", (String)null);
         if (var3 != null && var4 != null && var3.id_class()) {
            return new rgl_3(var3, var4);
         }
      }

      return null;
   }

   private static Boolean id_class(JsonObject var0, String var1) {
      return var0.has(var1) ? var0.get(var1).getAsBoolean() : null;
   }

   public JsonElement id_class(rgc_3 var1, Type var2, JsonSerializationContext var3) {
      if (var1.id_catch()) {
         return null;
      } else {
         JsonObject var4 = new JsonObject();
         if (var1.id_protected != null) {
            var4.addProperty("bold", var1.id_protected);
         }

         if (var1.id_throws != null) {
            var4.addProperty("italic", var1.id_throws);
         }

         if (var1.id_case != null) {
            var4.addProperty("underlined", var1.id_case);
         }

         if (var1.id_catch != null) {
            var4.addProperty("strikethrough", var1.id_catch);
         }

         if (var1.id_private != null) {
            var4.addProperty("obfuscated", var1.id_private);
         }

         if (var1.id_byte != null) {
            var4.addProperty("color", var1.id_byte.id_break());
         }

         if (var1.id_extends != null) {
            var4.add("insertion", var3.serialize(var1.id_extends));
         }

         if (var1.id_implements != null) {
            JsonObject var5 = new JsonObject();
            var5.addProperty("action", var1.id_implements.id_class().id_break());
            var5.addProperty("value", var1.id_implements.id_break());
            var4.add("clickEvent", var5);
         }

         if (var1.id_finally != null) {
            var4.add("hoverEvent", var1.id_finally.id_byte());
         }

         if (var1.id_native != null) {
            var4.addProperty("font", var1.id_native.toString());
         }

         return var4;
      }
   }

   public rgc_3 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (var1.isJsonObject()) {
         JsonObject var4 = var1.getAsJsonObject();
         if (var4 == null) {
            return null;
         } else {
            Boolean var5 = id_class(var4, "bold");
            Boolean var6 = id_class(var4, "italic");
            Boolean var7 = id_class(var4, "underlined");
            Boolean var8 = id_class(var4, "strikethrough");
            Boolean var9 = id_class(var4, "obfuscated");
            rVa_1 var10 = id_throws(var4);
            String var11 = id_protected(var4);
            rgl_3 var12 = id_byte(var4);
            rgy_3 var13 = id_break(var4);
            rqO_2 var14 = id_class(var4);
            return new rgc_3(var10, var5, var6, var7, var8, var9, var12, var13, var11, var14);
         }
      } else {
         return null;
      }
   }

   private static rqO_2 id_class(JsonObject var0) {
      if (var0.has("font")) {
         String var1 = rpY_2.id_case(var0, "font");

         try {
            return new rqO_2(var1);
         } catch (rqX_2 var3) {
            throw new JsonSyntaxException("Invalid font name: " + var1);
         }
      } else {
         return null;
      }
   }

   private static rgy_3 id_break(JsonObject var0) {
      if (var0.has("hoverEvent")) {
         JsonObject var1 = rpY_2.id_native(var0, "hoverEvent");
         rgy_3 var2 = rgy_3.id_class(var1);
         if (var2 != null && var2.id_class().id_class()) {
            return var2;
         }
      }

      return null;
   }

   private static rVa_1 id_throws(JsonObject var0) {
      if (var0.has("color")) {
         String var1 = rpY_2.id_case(var0, "color");
         return rVa_1.id_class(var1);
      } else {
         return null;
      }
   }

   private static String id_protected(JsonObject var0) {
      return rpY_2.id_class(var0, "insertion", (String)null);
   }
}
