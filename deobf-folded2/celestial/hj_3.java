package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hj_3 {
   public static final hj_3 id_class = new hV_2().id_break();
   private final Boolean id_break;
   private final Boolean id_byte;
   private final Boolean id_protected;
   private final Boolean id_throws;
   private final Boolean id_case;

   public hj_3(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   public static hj_3 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "entity flags");
         Boolean var2 = id_class(var1, "is_on_fire");
         Boolean var3 = id_class(var1, "is_sneaking");
         Boolean var4 = id_class(var1, "is_sprinting");
         Boolean var5 = id_class(var1, "is_swimming");
         Boolean var6 = id_class(var1, "is_baby");
         return new hj_3(var2, var3, var4, var5, var6);
      } else {
         return id_class;
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         this.id_class(var1, "is_on_fire", this.id_break);
         this.id_class(var1, "is_sneaking", this.id_byte);
         this.id_class(var1, "is_sprinting", this.id_protected);
         this.id_class(var1, "is_swimming", this.id_throws);
         this.id_class(var1, "is_baby", this.id_case);
         return var1;
      }
   }

   private void id_class(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }

   public boolean id_class(an_3 var1) {
      if (this.id_break != null && var1.Pz() != this.id_break) {
         return false;
      } else if (this.id_byte != null && var1.x() != this.id_byte) {
         return false;
      } else if (this.id_protected != null && var1.PF() != this.id_protected) {
         return false;
      } else {
         return this.id_throws != null && var1.Py() != this.id_throws
            ? false
            : this.id_case == null || !(var1 instanceof iB_2) || ((iB_2)var1).n_() == this.id_case;
      }
   }

   private static Boolean id_class(JsonObject var0, String var1) {
      return var0.has(var1) ? rpY_2.id_private(var0, var1) : null;
   }
}
