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
   private static rgl_3 byte_(JsonObject var0) {
      if (var0.has("clickEvent")) {
         JsonObject var1 = rpY_2.native_(var0, "clickEvent");
         String var2 = rpY_2.class_(var1, "action", (String)null);
         rgH_2 var3 = var2 == null ? null : rgH_2.class_(var2);
         String var4 = rpY_2.class_(var1, "value", (String)null);
         if (var3 != null && var4 != null && var3.class_()) {
            return new rgl_3(var3, var4);
         }
      }

      return null;
   }

   private static Boolean class_(JsonObject var0, String var1) {
      return var0.has(var1) ? var0.get(var1).getAsBoolean() : null;
   }

   public JsonElement class_(rgc_3 var1, Type var2, JsonSerializationContext var3) {
      if (var1.catch_()) {
         return null;
      } else {
         JsonObject var4 = new JsonObject();
         if (var1.protected_ != null) {
            var4.addProperty("bold", var1.protected_);
         }

         if (var1.throws_ != null) {
            var4.addProperty("italic", var1.throws_);
         }

         if (var1.case_ != null) {
            var4.addProperty("underlined", var1.case_);
         }

         if (var1.catch_ != null) {
            var4.addProperty("strikethrough", var1.catch_);
         }

         if (var1.private_ != null) {
            var4.addProperty("obfuscated", var1.private_);
         }

         if (var1.byte_ != null) {
            var4.addProperty("color", var1.byte_.break_());
         }

         if (var1.extends_ != null) {
            var4.add("insertion", var3.serialize(var1.extends_));
         }

         if (var1.implements_ != null) {
            JsonObject var5 = new JsonObject();
            var5.addProperty("action", var1.implements_.class_().break_());
            var5.addProperty("value", var1.implements_.break_());
            var4.add("clickEvent", var5);
         }

         if (var1.finally_ != null) {
            var4.add("hoverEvent", var1.finally_.byte_());
         }

         if (var1.native_ != null) {
            var4.addProperty("font", var1.native_.toString());
         }

         return var4;
      }
   }

   public rgc_3 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (var1.isJsonObject()) {
         JsonObject var4 = var1.getAsJsonObject();
         if (var4 == null) {
            return null;
         } else {
            Boolean var5 = class_(var4, "bold");
            Boolean var6 = class_(var4, "italic");
            Boolean var7 = class_(var4, "underlined");
            Boolean var8 = class_(var4, "strikethrough");
            Boolean var9 = class_(var4, "obfuscated");
            rVa_1 var10 = throws_(var4);
            String var11 = protected_(var4);
            rgl_3 var12 = byte_(var4);
            rgy_3 var13 = break_(var4);
            rqO_2 var14 = class_(var4);
            return new rgc_3(var10, var5, var6, var7, var8, var9, var12, var13, var11, var14);
         }
      } else {
         return null;
      }
   }

   private static rqO_2 class_(JsonObject var0) {
      if (var0.has("font")) {
         String var1 = rpY_2.case_(var0, "font");

         try {
            return new rqO_2(var1);
         } catch (rqX_2 var3) {
            throw new JsonSyntaxException("Invalid font name: " + var1);
         }
      } else {
         return null;
      }
   }

   private static rgy_3 break_(JsonObject var0) {
      if (var0.has("hoverEvent")) {
         JsonObject var1 = rpY_2.native_(var0, "hoverEvent");
         rgy_3 var2 = rgy_3.class_(var1);
         if (var2 != null && var2.class_().class_()) {
            return var2;
         }
      }

      return null;
   }

   private static rVa_1 throws_(JsonObject var0) {
      if (var0.has("color")) {
         String var1 = rpY_2.case_(var0, "color");
         return rVa_1.class_(var1);
      } else {
         return null;
      }
   }

   private static String protected_(JsonObject var0) {
      return rpY_2.class_(var0, "insertion", (String)null);
   }
}
