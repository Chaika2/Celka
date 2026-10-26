package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class XQ {
   public static final XQ id_class = new XQ(XF.id_throws);
   private final XF id_break;

   private XQ(XF var1) {
      this.id_break = var1;
   }

   public boolean id_class(rrEm_1 var1, rfH_2 var2) {
      if (this == id_class) {
         return true;
      } else {
         return !var1.id_synchronized(var2) ? false : this.id_break.id_byte(var1.id_package(var2));
      }
   }

   public static XQ id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "light");
         XF var2 = XF.id_class(var1.get("light"));
         return new XQ(var2);
      } else {
         return id_class;
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("light", this.id_break.id_protected());
         return var1;
      }
   }
}
