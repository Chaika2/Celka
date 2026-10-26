package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class rWI {
   public static final rWI class_ = new rWI(false);
   private boolean break_;

   private rWI(boolean var1) {
      this.break_ = var1;
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("in_open_water", new JsonPrimitive(this.break_));
         return var1;
      }
   }

   public boolean class_(an_3 var1) {
      if (this == class_) {
         return true;
      } else {
         return !(var1 instanceof rhp_3 var2) ? false : this.break_ == var2.protected_();
      }
   }

   public static rWI class_(boolean var0) {
      return new rWI(var0);
   }

   public static rWI class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "fishing_hook");
         JsonElement var2 = var1.get("in_open_water");
         return var2 != null ? new rWI(rpY_2.byte_(var2, "in_open_water")) : class_;
      } else {
         return class_;
      }
   }
}
