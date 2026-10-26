package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Locale;

public class rNu_1 extends rzX_2<rNN> {
   private static rrrZ<?> class_(JsonObject var0) {
      if (var0.has("destination")) {
         String var1 = rpY_2.case_(var0, "destination");
         rrrZ var2 = (rrrZ)rrrZ.class_.get(var1.toLowerCase(Locale.ROOT));
         if (var2 != null) {
            return var2;
         }
      }

      return rNN.break_;
   }

   public void class_(JsonObject var1, rNN var2, JsonSerializationContext var3) {
      super.class_(var1, (rNN)var2, var3);
      if (!var2.throws_.equals(rNN.break_)) {
         var1.add("destination", var3.serialize(var2.throws_.catch_()));
      }

      if (var2.case_ != rNN.byte_) {
         var1.add("decoration", var3.serialize(var2.case_.toString().toLowerCase(Locale.ROOT)));
      }

      if (var2.catch_ != 2) {
         var1.addProperty("zoom", var2.catch_);
      }

      if (var2.private_ != 50) {
         var1.addProperty("search_radius", var2.private_);
      }

      if (!var2.implements_) {
         var1.addProperty("skip_existing_chunks", var2.implements_);
      }
   }

   public rNN break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      rrrZ var4 = class_(var1);
      String var5 = var1.has("decoration") ? rpY_2.case_(var1, "decoration") : "mansion";
      rrGh_1 var6 = rNN.byte_;

      try {
         var6 = rrGh_1.valueOf(var5.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var10) {
         rNN.protected_.error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + rNN.byte_, var5);
      }

      byte var7 = rpY_2.class_(var1, "zoom", (byte)2);
      int var8 = rpY_2.class_(var1, "search_radius", 50);
      boolean var9 = rpY_2.class_(var1, "skip_existing_chunks", true);
      return new rNN(var3, var4, var6, var7, var8, var9);
   }
}
