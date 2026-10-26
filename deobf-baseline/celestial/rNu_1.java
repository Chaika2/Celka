package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Locale;

public class rNu_1 extends rzX_2<rNN> {
   private static rrrZ<?> id_class(JsonObject var0) {
      if (var0.has("destination")) {
         String var1 = rpY_2.id_case(var0, "destination");
         rrrZ var2 = (rrrZ)rrrZ.id_class.get(var1.toLowerCase(Locale.ROOT));
         if (var2 != null) {
            return var2;
         }
      }

      return rNN.id_break;
   }

   public void id_class(JsonObject var1, rNN var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNN)var2, var3);
      if (!var2.id_throws.equals(rNN.id_break)) {
         var1.add("destination", var3.serialize(var2.id_throws.id_catch()));
      }

      if (var2.id_case != rNN.id_byte) {
         var1.add("decoration", var3.serialize(var2.id_case.toString().toLowerCase(Locale.ROOT)));
      }

      if (var2.id_catch != 2) {
         var1.addProperty("zoom", var2.id_catch);
      }

      if (var2.id_private != 50) {
         var1.addProperty("search_radius", var2.id_private);
      }

      if (!var2.id_implements) {
         var1.addProperty("skip_existing_chunks", var2.id_implements);
      }
   }

   public rNN id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rrrZ var4 = id_class(var1);
      String var5 = var1.has("decoration") ? rpY_2.id_case(var1, "decoration") : "mansion";
      rrGh_1 var6 = rNN.id_byte;

      try {
         var6 = rrGh_1.valueOf(var5.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var10) {
         rNN.id_protected.error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + rNN.id_byte, var5);
      }

      byte var7 = rpY_2.id_class(var1, "zoom", (byte)2);
      int var8 = rpY_2.id_class(var1, "search_radius", 50);
      boolean var9 = rpY_2.id_class(var1, "skip_existing_chunks", true);
      return new rNN(var3, var4, var6, var7, var8, var9);
   }
}
