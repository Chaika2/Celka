package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class XQ {
   public static final XQ class_ = new XQ(XF.throws_);
   private final XF break_;

   private XQ(XF var1) {
      this.break_ = var1;
   }

   public boolean class_(rrEm_1 var1, rfH_2 var2) {
      if (this == class_) {
         return true;
      } else {
         return !var1.synchronized_(var2) ? false : this.break_.byte_(var1.package_(var2));
      }
   }

   public static XQ class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "light");
         XF var2 = XF.class_(var1.get("light"));
         return new XQ(var2);
      } else {
         return class_;
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("light", this.break_.protected_());
         return var1;
      }
   }
}
