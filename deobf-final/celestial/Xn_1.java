package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Xn_1 {
   private final XF class_;
   private final XF break_;
   private final Boolean byte_;
   private final Boolean protected_;

   public Xn_1(XF var1, XF var2, Boolean var3, Boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public Xn_1() {
      this(XF.throws_, XF.throws_, (Boolean)null, (Boolean)null);
   }

   public JsonElement class_() {
      JsonObject var1 = new JsonObject();
      var1.add("amplifier", this.class_.protected_());
      var1.add("duration", this.break_.protected_());
      var1.addProperty("ambient", this.byte_);
      var1.addProperty("visible", this.protected_);
      return var1;
   }

   public static Xn_1 class_(JsonObject var0) {
      XF var1 = XF.class_(var0.get("amplifier"));
      XF var2 = XF.class_(var0.get("duration"));
      Boolean var3 = var0.has("ambient") ? rpY_2.private_(var0, "ambient") : null;
      Boolean var4 = var0.has("visible") ? rpY_2.private_(var0, "visible") : null;
      return new Xn_1(var1, var2, var3, var4);
   }

   public boolean class_(rLY var1) {
      if (var1 == null) {
         return false;
      } else if (!this.class_.byte_(var1.byte_())) {
         return false;
      } else if (!this.break_.byte_(var1.break_())) {
         return false;
      } else {
         return this.byte_ != null && this.byte_ != var1.protected_() ? false : this.protected_ == null || this.protected_ == var1.throws_();
      }
   }
}
