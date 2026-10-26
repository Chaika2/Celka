package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hn_3 {
   public static final hn_3 class_ = hC_2.class_().break_();
   private final Boolean break_;
   private final Boolean byte_;
   private final Boolean protected_;
   private final Boolean throws_;
   private final Boolean case_;
   private final Boolean catch_;
   private final Boolean private_;
   private final Boolean implements_;
   private final hY_2 finally_;
   private final hY_2 extends_;

   public hn_3(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5, Boolean var6, Boolean var7, Boolean var8, hY_2 var9, hY_2 var10) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      this.finally_ = var9;
      this.extends_ = var10;
   }

   private static Boolean class_(JsonObject var0, String var1) {
      return var0.has(var1) ? rpY_2.private_(var0, var1) : null;
   }

   private void class_(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         this.class_(var1, "is_projectile", this.break_);
         this.class_(var1, "is_explosion", this.byte_);
         this.class_(var1, "bypasses_armor", this.protected_);
         this.class_(var1, "bypasses_invulnerability", this.throws_);
         this.class_(var1, "bypasses_magic", this.case_);
         this.class_(var1, "is_fire", this.catch_);
         this.class_(var1, "is_magic", this.private_);
         this.class_(var1, "is_lightning", this.implements_);
         var1.add("direct_entity", this.finally_.class_());
         var1.add("source_entity", this.extends_.class_());
         return var1;
      }
   }

   public boolean class_(rhN_2 var1, rye_3 var2) {
      return this.class_(var1.continue_(), var1.Ps(), var2);
   }

   public static hn_3 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "damage type");
         Boolean var2 = class_(var1, "is_projectile");
         Boolean var3 = class_(var1, "is_explosion");
         Boolean var4 = class_(var1, "bypasses_armor");
         Boolean var5 = class_(var1, "bypasses_invulnerability");
         Boolean var6 = class_(var1, "bypasses_magic");
         Boolean var7 = class_(var1, "is_fire");
         Boolean var8 = class_(var1, "is_magic");
         Boolean var9 = class_(var1, "is_lightning");
         hY_2 var10 = hY_2.class_(var1.get("direct_entity"));
         hY_2 var11 = hY_2.class_(var1.get("source_entity"));
         return new hn_3(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         return class_;
      }
   }

   public boolean class_(rrEm_1 var1, rjU_2 var2, rye_3 var3) {
      if (this == class_) {
         return true;
      } else if (this.break_ != null && this.break_ != var3.break_()) {
         return false;
      } else if (this.byte_ != null && this.byte_ != var3.protected_()) {
         return false;
      } else if (this.protected_ != null && this.protected_ != var3.case_()) {
         return false;
      } else if (this.throws_ != null && this.throws_ != var3.private_()) {
         return false;
      } else if (this.case_ != null && this.case_ != var3.implements_()) {
         return false;
      } else if (this.catch_ != null && this.catch_ != var3.int_()) {
         return false;
      } else if (this.private_ != null && this.private_ != var3.this_()) {
         return false;
      } else if (this.implements_ != null && this.implements_ != (var3 == rye_3.break_)) {
         return false;
      } else {
         return !this.finally_.class_(var1, var2, var3.finally_()) ? false : this.extends_.class_(var1, var2, var3.extends_());
      }
   }
}
