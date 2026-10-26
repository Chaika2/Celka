package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class hT_2 {
   public static final hT_2 class_ = new hT_2();
   public static final hT_2[] break_ = new hT_2[0];
   private final ev_3 byte_;
   private final XF protected_;

   public hT_2() {
      this.byte_ = null;
      this.protected_ = XF.throws_;
   }

   public hT_2(ev_3 var1, XF var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   public static hT_2 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "enchantment");
         ev_3 var2 = null;
         if (var1.has("enchantment")) {
            rqO_2 var3 = new rqO_2(rpY_2.case_(var1, "enchantment"));
            var2 = rVL.boolean_.break_(var3).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + var3 + "'"));
         }

         XF var4 = XF.class_(var1.get("levels"));
         return new hT_2(var2, var4);
      } else {
         return class_;
      }
   }

   public boolean class_(Map<ev_3, Integer> var1) {
      if (this.byte_ != null) {
         if (!var1.containsKey(this.byte_)) {
            return false;
         }

         int var2 = (Integer)var1.get(this.byte_);
         if (this.protected_ != null && !this.protected_.byte_(var2)) {
            return false;
         }
      } else if (this.protected_ != null) {
         for (Integer var3 : var1.values()) {
            if (this.protected_.byte_(var3)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.byte_ != null) {
            var1.addProperty("enchantment", rVL.boolean_.break_(this.byte_).toString());
         }

         var1.add("levels", this.protected_.protected_());
         return var1;
      }
   }

   public static hT_2[] break_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var1 = rpY_2.implements_(var0, "enchantments");
         hT_2[] var2 = new hT_2[var1.size()];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = class_(var1.get(var3));
         }

         return var2;
      } else {
         return break_;
      }
   }
}
