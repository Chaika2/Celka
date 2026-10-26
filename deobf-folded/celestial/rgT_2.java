package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class rgT_2 {
   private final rdb_3 id_class;
   private final int id_break;
   private final rcd_3 id_byte;
   private rdn_3 id_protected;

   rgT_2(rdb_3 var1, int var2, rcd_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rgT_2(rdn_3 var1) {
      this(var1.id_break(), var1.id_char(), var1.id_package() != null ? var1.id_package().id_catch() : null);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgT_2 var2 = (rgT_2)var1;
         return this.id_break == var2.id_break && this.id_class.equals(var2.id_class) && Objects.equals(this.id_byte, var2.id_byte);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break;
      return 31 * var1 + (this.id_byte != null ? this.id_byte.hashCode() : 0);
   }

   static rgT_2 id_class(rgP_2 var0) {
      try {
         rcd_3 var1 = rcH_2.id_class(var0.getString());
         return new rgT_2(rdn_3.id_class(var1));
      } catch (CommandSyntaxException var2) {
         rgy_3.id_class.warn("Failed to parse item tag: {}", var0, var2);
         return null;
      }
   }

   static rgT_2 id_class(JsonElement var0) {
      if (var0.isJsonPrimitive()) {
         return new rgT_2(rVL.id_for.id_class(new rqO_2(var0.getAsString())), 1, (rcd_3)null);
      } else {
         JsonObject var1 = rpY_2.id_private(var0, "item");
         rdb_3 var2 = rVL.id_for.id_class(new rqO_2(rpY_2.id_case(var1, "id")));
         int var3 = rpY_2.id_class(var1, "count", 1);
         if (var1.has("tag")) {
            String var4 = rpY_2.id_case(var1, "tag");

            try {
               rcd_3 var5 = rcH_2.id_class(var4);
               return new rgT_2(var2, var3, var5);
            } catch (CommandSyntaxException var6) {
               rgy_3.id_class.warn("Failed to parse tag: {}", var4, var6);
            }
         }

         return new rgT_2(var2, var3, (rcd_3)null);
      }
   }

   public rdn_3 id_class() {
      if (this.id_protected == null) {
         this.id_protected = new rdn_3(this.id_class, this.id_break);
         if (this.id_byte != null) {
            this.id_protected.id_byte(this.id_byte);
         }
      }

      return this.id_protected;
   }

   JsonElement id_break() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", rVL.id_for.id_break(this.id_class).toString());
      if (this.id_break != 1) {
         var1.addProperty("count", this.id_break);
      }

      if (this.id_byte != null) {
         var1.addProperty("tag", this.id_byte.toString());
      }

      return var1;
   }
}
