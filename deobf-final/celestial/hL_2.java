package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hL_2 {
   public static final hL_2 class_ = hA_2.class_().break_();
   private final Xm_1 break_;
   private final Xm_1 byte_;
   private final hY_2 protected_;
   private final Boolean throws_;
   private final hn_3 case_;

   public hL_2() {
      this.break_ = Xm_1.throws_;
      this.byte_ = Xm_1.throws_;
      this.protected_ = hY_2.class_;
      this.throws_ = null;
      this.case_ = hn_3.class_;
   }

   public hL_2(Xm_1 var1, Xm_1 var2, hY_2 var3, Boolean var4, hn_3 var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   public boolean class_(rhN_2 var1, rye_3 var2, float var3, float var4, boolean var5) {
      if (this == class_) {
         return true;
      } else if (!this.break_.break_(var3)) {
         return false;
      } else if (!this.byte_.break_(var4)) {
         return false;
      } else if (!this.protected_.class_(var1, var2.extends_())) {
         return false;
      } else {
         return this.throws_ != null && this.throws_ != var5 ? false : this.case_.class_(var1, var2);
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("dealt", this.break_.protected_());
         var1.add("taken", this.byte_.protected_());
         var1.add("source_entity", this.protected_.class_());
         var1.add("type", this.case_.class_());
         if (this.throws_ != null) {
            var1.addProperty("blocked", this.throws_);
         }

         return var1;
      }
   }

   public static hL_2 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "damage");
         Xm_1 var2 = Xm_1.class_(var1.get("dealt"));
         Xm_1 var3 = Xm_1.class_(var1.get("taken"));
         Boolean var4 = var1.has("blocked") ? rpY_2.private_(var1, "blocked") : null;
         hY_2 var5 = hY_2.class_(var1.get("source_entity"));
         hn_3 var6 = hn_3.class_(var1.get("type"));
         return new hL_2(var2, var3, var5, var4, var6);
      } else {
         return class_;
      }
   }
}
