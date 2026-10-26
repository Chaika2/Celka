package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Xn_1 {
   private final XF id_class;
   private final XF id_break;
   private final Boolean id_byte;
   private final Boolean id_protected;

   public Xn_1(XF var1, XF var2, Boolean var3, Boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public Xn_1() {
      this(XF.id_throws, XF.id_throws, (Boolean)null, (Boolean)null);
   }

   public JsonElement id_class() {
      JsonObject var1 = new JsonObject();
      var1.add("amplifier", this.id_class.id_protected());
      var1.add("duration", this.id_break.id_protected());
      var1.addProperty("ambient", this.id_byte);
      var1.addProperty("visible", this.id_protected);
      return var1;
   }

   public static Xn_1 id_class(JsonObject var0) {
      XF var1 = XF.id_class(var0.get("amplifier"));
      XF var2 = XF.id_class(var0.get("duration"));
      Boolean var3 = var0.has("ambient") ? rpY_2.id_private(var0, "ambient") : null;
      Boolean var4 = var0.has("visible") ? rpY_2.id_private(var0, "visible") : null;
      return new Xn_1(var1, var2, var3, var4);
   }

   public boolean id_class(rLY var1) {
      if (var1 == null) {
         return false;
      } else if (!this.id_class.id_byte(var1.id_byte())) {
         return false;
      } else if (!this.id_break.id_byte(var1.id_break())) {
         return false;
      } else {
         return this.id_byte != null && this.id_byte != var1.id_protected() ? false : this.id_protected == null || this.id_protected == var1.id_throws();
      }
   }
}
