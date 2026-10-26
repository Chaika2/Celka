package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hL_2 {
   public static final hL_2 id_class = hA_2.id_class().id_break();
   private final Xm_1 id_break;
   private final Xm_1 id_byte;
   private final hY_2 id_protected;
   private final Boolean id_throws;
   private final hn_3 id_case;

   public hL_2() {
      this.id_break = Xm_1.id_throws;
      this.id_byte = Xm_1.id_throws;
      this.id_protected = hY_2.id_class;
      this.id_throws = null;
      this.id_case = hn_3.id_class;
   }

   public hL_2(Xm_1 var1, Xm_1 var2, hY_2 var3, Boolean var4, hn_3 var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   public boolean id_class(rhN_2 var1, rye_3 var2, float var3, float var4, boolean var5) {
      if (this == id_class) {
         return true;
      } else if (!this.id_break.id_break(var3)) {
         return false;
      } else if (!this.id_byte.id_break(var4)) {
         return false;
      } else if (!this.id_protected.id_class(var1, var2.id_extends())) {
         return false;
      } else {
         return this.id_throws != null && this.id_throws != var5 ? false : this.id_case.id_class(var1, var2);
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("dealt", this.id_break.id_protected());
         var1.add("taken", this.id_byte.id_protected());
         var1.add("source_entity", this.id_protected.id_class());
         var1.add("type", this.id_case.id_class());
         if (this.id_throws != null) {
            var1.addProperty("blocked", this.id_throws);
         }

         return var1;
      }
   }

   public static hL_2 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "damage");
         Xm_1 var2 = Xm_1.id_class(var1.get("dealt"));
         Xm_1 var3 = Xm_1.id_class(var1.get("taken"));
         Boolean var4 = var1.has("blocked") ? rpY_2.id_private(var1, "blocked") : null;
         hY_2 var5 = hY_2.id_class(var1.get("source_entity"));
         hn_3 var6 = hn_3.id_class(var1.get("type"));
         return new hL_2(var2, var3, var5, var4, var6);
      } else {
         return id_class;
      }
   }
}
