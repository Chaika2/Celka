package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class rgT_2 {
   private final rdb_3 class_;
   private final int break_;
   private final rcd_3 byte_;
   private rdn_3 protected_;

   rgT_2(rdb_3 var1, int var2, rcd_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rgT_2(rdn_3 var1) {
      this(var1.break_(), var1.char_(), var1.package_() != null ? var1.package_().catch_() : null);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgT_2 var2 = (rgT_2)var1;
         return this.break_ == var2.break_ && this.class_.equals(var2.class_) && Objects.equals(this.byte_, var2.byte_);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_;
      return 31 * var1 + (this.byte_ != null ? this.byte_.hashCode() : 0);
   }

   static rgT_2 class_(rgP_2 var0) {
      try {
         rcd_3 var1 = rcH_2.class_(var0.getString());
         return new rgT_2(rdn_3.class_(var1));
      } catch (CommandSyntaxException var2) {
         rgy_3.class_.warn("Failed to parse item tag: {}", var0, var2);
         return null;
      }
   }

   static rgT_2 class_(JsonElement var0) {
      if (var0.isJsonPrimitive()) {
         return new rgT_2(rVL.for_.class_(new rqO_2(var0.getAsString())), 1, (rcd_3)null);
      } else {
         JsonObject var1 = rpY_2.private_(var0, "item");
         rdb_3 var2 = rVL.for_.class_(new rqO_2(rpY_2.case_(var1, "id")));
         int var3 = rpY_2.class_(var1, "count", 1);
         if (var1.has("tag")) {
            String var4 = rpY_2.case_(var1, "tag");

            try {
               rcd_3 var5 = rcH_2.class_(var4);
               return new rgT_2(var2, var3, var5);
            } catch (CommandSyntaxException var6) {
               rgy_3.class_.warn("Failed to parse tag: {}", var4, var6);
            }
         }

         return new rgT_2(var2, var3, (rcd_3)null);
      }
   }

   public rdn_3 class_() {
      if (this.protected_ == null) {
         this.protected_ = new rdn_3(this.class_, this.break_);
         if (this.byte_ != null) {
            this.protected_.byte_(this.byte_);
         }
      }

      return this.protected_;
   }

   JsonElement break_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", rVL.for_.break_(this.class_).toString());
      if (this.break_ != 1) {
         var1.addProperty("count", this.break_);
      }

      if (this.byte_ != null) {
         var1.addProperty("tag", this.byte_.toString());
      }

      return var1;
   }
}
