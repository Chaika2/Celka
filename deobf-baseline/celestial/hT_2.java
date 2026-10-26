package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class hT_2 {
   public static final hT_2 id_class = new hT_2();
   public static final hT_2[] id_break = new hT_2[0];
   private final ev_3 id_byte;
   private final XF id_protected;

   public hT_2() {
      this.id_byte = null;
      this.id_protected = XF.id_throws;
   }

   public hT_2(ev_3 var1, XF var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   public static hT_2 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "enchantment");
         ev_3 var2 = null;
         if (var1.has("enchantment")) {
            rqO_2 var3 = new rqO_2(rpY_2.id_case(var1, "enchantment"));
            var2 = rVL.id_boolean.id_break(var3).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var3 + "'"));
         }

         XF var4 = XF.id_class(var1.get("levels"));
         return new hT_2(var2, var4);
      } else {
         return id_class;
      }
   }

   public boolean id_class(Map<ev_3, Integer> var1) {
      if (this.id_byte != null) {
         if (!var1.containsKey(this.id_byte)) {
            return false;
         }

         int var2 = (Integer)var1.get(this.id_byte);
         if (this.id_protected != null && !this.id_protected.id_byte(var2)) {
            return false;
         }
      } else if (this.id_protected != null) {
         for (Integer var3 : var1.values()) {
            if (this.id_protected.id_byte(var3)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.id_byte != null) {
            var1.addProperty("enchantment", rVL.id_boolean.id_break(this.id_byte).toString());
         }

         var1.add("levels", this.id_protected.id_protected());
         return var1;
      }
   }

   public static hT_2[] id_break(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var1 = rpY_2.id_implements(var0, "enchantments");
         hT_2[] var2 = new hT_2[var1.size()];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = id_class(var1.get(var3));
         }

         return var2;
      } else {
         return id_break;
      }
   }
}
