package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hI_2 {
   public static final hI_2 id_class = new hI_2(Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class, Xh_1.id_class);
   public static final hI_2 id_break = new hI_2(
      XX.id_class().id_class(rdy_3.dY).id_class(rrEr_1.id_new().id_package()).id_break(),
      Xh_1.id_class,
      Xh_1.id_class,
      Xh_1.id_class,
      Xh_1.id_class,
      Xh_1.id_class
   );
   private final Xh_1 id_byte;
   private final Xh_1 id_protected;
   private final Xh_1 id_throws;
   private final Xh_1 id_case;
   private final Xh_1 id_catch;
   private final Xh_1 id_private;

   public hI_2(Xh_1 var1, Xh_1 var2, Xh_1 var3, Xh_1 var4, Xh_1 var5, Xh_1 var6) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_private = var6;
   }

   public boolean id_class(an_3 var1) {
      if (this == id_class) {
         return true;
      } else if (!(var1 instanceof iB_2 var2)) {
         return false;
      } else if (!this.id_byte.id_class(var2.id_class(rXQ.HEAD))) {
         return false;
      } else if (!this.id_protected.id_class(var2.id_class(rXQ.CHEST))) {
         return false;
      } else if (!this.id_throws.id_class(var2.id_class(rXQ.LEGS))) {
         return false;
      } else if (!this.id_case.id_class(var2.id_class(rXQ.FEET))) {
         return false;
      } else {
         return !this.id_catch.id_class(var2.id_class(rXQ.MAINHAND)) ? false : this.id_private.id_class(var2.id_class(rXQ.OFFHAND));
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("head", this.id_byte.id_class());
         var1.add("chest", this.id_protected.id_class());
         var1.add("legs", this.id_throws.id_class());
         var1.add("feet", this.id_case.id_class());
         var1.add("mainhand", this.id_catch.id_class());
         var1.add("offhand", this.id_private.id_class());
         return var1;
      }
   }

   public static hI_2 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "equipment");
         Xh_1 var2 = Xh_1.id_class(var1.get("head"));
         Xh_1 var3 = Xh_1.id_class(var1.get("chest"));
         Xh_1 var4 = Xh_1.id_class(var1.get("legs"));
         Xh_1 var5 = Xh_1.id_class(var1.get("feet"));
         Xh_1 var6 = Xh_1.id_class(var1.get("mainhand"));
         Xh_1 var7 = Xh_1.id_class(var1.get("offhand"));
         return new hI_2(var2, var3, var4, var5, var6, var7);
      } else {
         return id_class;
      }
   }
}
