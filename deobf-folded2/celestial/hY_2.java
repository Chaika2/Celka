package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hY_2 {
   public static final hY_2 id_class = new hY_2(
      hD_2.id_class, hl_3.id_class, XN.id_class, XA.id_class, XC.id_class, hj_3.id_class, hI_2.id_class, Xj_1.id_class, rWI.id_class, (String)null, (rqO_2)null
   );
   private final hD_2 id_break;
   private final hl_3 id_byte;
   private final XN id_protected;
   private final XA id_throws;
   private final XC id_case;
   private final hj_3 id_catch;
   private final hI_2 id_private;
   private final Xj_1 id_implements;
   private final rWI id_finally;
   private final hY_2 id_extends;
   private final hY_2 id_native;
   private final String id_volatile;
   private final rqO_2 id_final;

   private hY_2(hD_2 var1, hl_3 var2, XN var3, XA var4, XC var5, hj_3 var6, hI_2 var7, Xj_1 var8, rWI var9, String var10, rqO_2 var11) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      this.id_finally = var9;
      this.id_extends = this;
      this.id_native = this;
      this.id_volatile = var10;
      this.id_final = var11;
   }

   hY_2(hD_2 var1, hl_3 var2, XN var3, XA var4, XC var5, hj_3 var6, hI_2 var7, Xj_1 var8, rWI var9, hY_2 var10, hY_2 var11, String var12, rqO_2 var13) {
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
      this.id_native = var11;
      this.id_volatile = var12;
      this.id_final = var13;
   }

   public static hY_2 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "entity");
         hD_2 var2 = hD_2.id_class(var1.get("type"));
         hl_3 var3 = hl_3.id_class(var1.get("distance"));
         XN var4 = XN.id_class(var1.get("location"));
         XA var5 = XA.id_class(var1.get("effects"));
         XC var6 = XC.id_class(var1.get("nbt"));
         hj_3 var7 = hj_3.id_class(var1.get("flags"));
         hI_2 var8 = hI_2.id_class(var1.get("equipment"));
         Xj_1 var9 = Xj_1.id_class(var1.get("player"));
         rWI var10 = rWI.id_class(var1.get("fishing_hook"));
         hY_2 var11 = id_class(var1.get("vehicle"));
         hY_2 var12 = id_class(var1.get("targeted_entity"));
         String var13 = rpY_2.id_class(var1, "team", (String)null);
         rqO_2 var14 = var1.has("catType") ? new rqO_2(rpY_2.id_case(var1, "catType")) : null;
         return new hK_2()
            .id_class(var2)
            .id_class(var3)
            .id_class(var4)
            .id_class(var5)
            .id_class(var6)
            .id_class(var7)
            .id_class(var8)
            .id_class(var9)
            .id_class(var10)
            .id_class(var13)
            .id_class(var11)
            .id_break(var12)
            .id_break(var14)
            .id_break();
      } else {
         return id_class;
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("type", this.id_break.id_class());
         var1.add("distance", this.id_byte.id_class());
         var1.add("location", this.id_protected.id_class());
         var1.add("effects", this.id_throws.id_break());
         var1.add("nbt", this.id_case.id_class());
         var1.add("flags", this.id_catch.id_class());
         var1.add("equipment", this.id_private.id_class());
         var1.add("player", this.id_implements.id_class());
         var1.add("fishing_hook", this.id_finally.id_class());
         var1.add("vehicle", this.id_extends.id_class());
         var1.add("targeted_entity", this.id_native.id_class());
         var1.addProperty("team", this.id_volatile);
         if (this.id_final != null) {
            var1.addProperty("catType", this.id_final.toString());
         }

         return var1;
      }
   }

   public boolean id_class(rhN_2 var1, an_3 var2) {
      return this.id_class(var1.id_continue(), var1.Ps(), var2);
   }

   public boolean id_class(rrEm_1 var1, rjU_2 var2, an_3 var3) {
      if (this == id_class) {
         return true;
      } else if (var3 == null) {
         return false;
      } else if (!this.id_break.id_class(var3.BC())) {
         return false;
      } else {
         if (var2 == null) {
            if (this.id_byte != hl_3.id_class) {
               return false;
            }
         } else if (!this.id_byte.id_class(var2.id_break, var2.id_byte, var2.id_protected, var3.rx(), var3.re(), var3.BO())) {
            return false;
         }

         if (!this.id_protected.id_class(var1, var3.rx(), var3.re(), var3.BO())) {
            return false;
         } else if (!this.id_throws.id_class(var3)) {
            return false;
         } else if (!this.id_case.id_class(var3)) {
            return false;
         } else if (!this.id_catch.id_class(var3)) {
            return false;
         } else if (!this.id_private.id_class(var3)) {
            return false;
         } else if (!this.id_implements.id_class(var3)) {
            return false;
         } else if (!this.id_finally.id_class(var3)) {
            return false;
         } else if (!this.id_extends.id_class(var1, var2, var3.ra())) {
            return false;
         } else if (!this.id_native.id_class(var1, var2, var3 instanceof is_3 ? ((is_3)var3).I_() : null)) {
            return false;
         } else {
            if (this.id_volatile != null) {
               rnM_2 var4 = var3.BG();
               if (var4 == null || !this.id_volatile.equals(var4.id_class())) {
                  return false;
               }
            }

            return this.id_final == null || var3 instanceof rbf_3 && ((rbf_3)var3).L().equals(this.id_final);
         }
      }
   }

   public static rzr_3 id_break(rhN_2 var0, an_3 var1) {
      return new rzP_2(var0.id_continue()).id_class(rzQ_2.id_class, var1).id_class(rzQ_2.id_case, var0.Ps()).id_class(var0.Sa()).id_class(rzz_3.id_finally);
   }
}
