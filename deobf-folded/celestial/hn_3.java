package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hn_3 {
   public static final hn_3 id_class = hC_2.id_class().id_break();
   private final Boolean id_break;
   private final Boolean id_byte;
   private final Boolean id_protected;
   private final Boolean id_throws;
   private final Boolean id_case;
   private final Boolean id_catch;
   private final Boolean id_private;
   private final Boolean id_implements;
   private final hY_2 id_finally;
   private final hY_2 id_extends;

   public hn_3(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5, Boolean var6, Boolean var7, Boolean var8, hY_2 var9, hY_2 var10) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      this.id_finally = var9;
      this.id_extends = var10;
   }

   private static Boolean id_class(JsonObject var0, String var1) {
      return var0.has(var1) ? rpY_2.id_private(var0, var1) : null;
   }

   private void id_class(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         this.id_class(var1, "is_projectile", this.id_break);
         this.id_class(var1, "is_explosion", this.id_byte);
         this.id_class(var1, "bypasses_armor", this.id_protected);
         this.id_class(var1, "bypasses_invulnerability", this.id_throws);
         this.id_class(var1, "bypasses_magic", this.id_case);
         this.id_class(var1, "is_fire", this.id_catch);
         this.id_class(var1, "is_magic", this.id_private);
         this.id_class(var1, "is_lightning", this.id_implements);
         var1.add("direct_entity", this.id_finally.id_class());
         var1.add("source_entity", this.id_extends.id_class());
         return var1;
      }
   }

   public boolean id_class(rhN_2 var1, rye_3 var2) {
      return this.id_class(var1.id_continue(), var1.Ps(), var2);
   }

   public static hn_3 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "damage type");
         Boolean var2 = id_class(var1, "is_projectile");
         Boolean var3 = id_class(var1, "is_explosion");
         Boolean var4 = id_class(var1, "bypasses_armor");
         Boolean var5 = id_class(var1, "bypasses_invulnerability");
         Boolean var6 = id_class(var1, "bypasses_magic");
         Boolean var7 = id_class(var1, "is_fire");
         Boolean var8 = id_class(var1, "is_magic");
         Boolean var9 = id_class(var1, "is_lightning");
         hY_2 var10 = hY_2.id_class(var1.get("direct_entity"));
         hY_2 var11 = hY_2.id_class(var1.get("source_entity"));
         return new hn_3(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         return id_class;
      }
   }

   public boolean id_class(rrEm_1 var1, rjU_2 var2, rye_3 var3) {
      if (this == id_class) {
         return true;
      } else if (this.id_break != null && this.id_break != var3.id_break()) {
         return false;
      } else if (this.id_byte != null && this.id_byte != var3.id_protected()) {
         return false;
      } else if (this.id_protected != null && this.id_protected != var3.id_case()) {
         return false;
      } else if (this.id_throws != null && this.id_throws != var3.id_private()) {
         return false;
      } else if (this.id_case != null && this.id_case != var3.id_implements()) {
         return false;
      } else if (this.id_catch != null && this.id_catch != var3.id_int()) {
         return false;
      } else if (this.id_private != null && this.id_private != var3.id_this()) {
         return false;
      } else if (this.id_implements != null && this.id_implements != (var3 == rye_3.id_break)) {
         return false;
      } else {
         return !this.id_finally.id_class(var1, var2, var3.id_finally()) ? false : this.id_extends.id_class(var1, var2, var3.id_extends());
      }
   }
}
