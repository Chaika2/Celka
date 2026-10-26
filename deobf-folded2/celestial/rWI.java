package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class rWI {
   public static final rWI id_class = new rWI(false);
   private boolean id_break;

   private rWI(boolean var1) {
      this.id_break = var1;
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("in_open_water", new JsonPrimitive(this.id_break));
         return var1;
      }
   }

   public boolean id_class(an_3 var1) {
      if (this == id_class) {
         return true;
      } else {
         return !(var1 instanceof rhp_3 var2) ? false : this.id_break == var2.id_protected();
      }
   }

   public static rWI id_class(boolean var0) {
      return new rWI(var0);
   }

   public static rWI id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "fishing_hook");
         JsonElement var2 = var1.get("in_open_water");
         return var2 != null ? new rWI(rpY_2.id_byte(var2, "in_open_water")) : id_class;
      } else {
         return id_class;
      }
   }
}
