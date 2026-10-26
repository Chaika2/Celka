package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hj_3 {
   public static final hj_3 class_ = new hV_2().break_();
   private final Boolean break_;
   private final Boolean byte_;
   private final Boolean protected_;
   private final Boolean throws_;
   private final Boolean case_;

   public hj_3(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   public static hj_3 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "entity flags");
         Boolean var2 = class_(var1, "is_on_fire");
         Boolean var3 = class_(var1, "is_sneaking");
         Boolean var4 = class_(var1, "is_sprinting");
         Boolean var5 = class_(var1, "is_swimming");
         Boolean var6 = class_(var1, "is_baby");
         return new hj_3(var2, var3, var4, var5, var6);
      } else {
         return class_;
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         this.class_(var1, "is_on_fire", this.break_);
         this.class_(var1, "is_sneaking", this.byte_);
         this.class_(var1, "is_sprinting", this.protected_);
         this.class_(var1, "is_swimming", this.throws_);
         this.class_(var1, "is_baby", this.case_);
         return var1;
      }
   }

   private void class_(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }

   public boolean class_(an_3 var1) {
      if (this.break_ != null && var1.Pz() != this.break_) {
         return false;
      } else if (this.byte_ != null && var1.x() != this.byte_) {
         return false;
      } else if (this.protected_ != null && var1.PF() != this.protected_) {
         return false;
      } else {
         return this.throws_ != null && var1.Py() != this.throws_ ? false : this.case_ == null || !(var1 instanceof iB_2) || ((iB_2)var1).n_() == this.case_;
      }
   }

   private static Boolean class_(JsonObject var0, String var1) {
      return var0.has(var1) ? rpY_2.private_(var0, var1) : null;
   }
}
