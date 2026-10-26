package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hY_2 {
   public static final hY_2 class_ = new hY_2(
      hD_2.class_, hl_3.class_, XN.class_, XA.class_, XC.class_, hj_3.class_, hI_2.class_, Xj_1.class_, rWI.class_, (String)null, (rqO_2)null
   );
   private final hD_2 break_;
   private final hl_3 byte_;
   private final XN protected_;
   private final XA throws_;
   private final XC case_;
   private final hj_3 catch_;
   private final hI_2 private_;
   private final Xj_1 implements_;
   private final rWI finally_;
   private final hY_2 extends_;
   private final hY_2 native_;
   private final String volatile_;
   private final rqO_2 final_;

   private hY_2(hD_2 var1, hl_3 var2, XN var3, XA var4, XC var5, hj_3 var6, hI_2 var7, Xj_1 var8, rWI var9, String var10, rqO_2 var11) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      this.finally_ = var9;
      this.extends_ = this;
      this.native_ = this;
      this.volatile_ = var10;
      this.final_ = var11;
   }

   hY_2(hD_2 var1, hl_3 var2, XN var3, XA var4, XC var5, hj_3 var6, hI_2 var7, Xj_1 var8, rWI var9, hY_2 var10, hY_2 var11, String var12, rqO_2 var13) {
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
      this.native_ = var11;
      this.volatile_ = var12;
      this.final_ = var13;
   }

   public static hY_2 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "entity");
         hD_2 var2 = hD_2.class_(var1.get("type"));
         hl_3 var3 = hl_3.class_(var1.get("distance"));
         XN var4 = XN.class_(var1.get("location"));
         XA var5 = XA.class_(var1.get("effects"));
         XC var6 = XC.class_(var1.get("nbt"));
         hj_3 var7 = hj_3.class_(var1.get("flags"));
         hI_2 var8 = hI_2.class_(var1.get("equipment"));
         Xj_1 var9 = Xj_1.class_(var1.get("player"));
         rWI var10 = rWI.class_(var1.get("fishing_hook"));
         hY_2 var11 = class_(var1.get("vehicle"));
         hY_2 var12 = class_(var1.get("targeted_entity"));
         String var13 = rpY_2.class_(var1, "team", (String)null);
         rqO_2 var14 = var1.has("catType") ? new rqO_2(rpY_2.case_(var1, "catType")) : null;
         return new hK_2()
            .class_(var2)
            .class_(var3)
            .class_(var4)
            .class_(var5)
            .class_(var6)
            .class_(var7)
            .class_(var8)
            .class_(var9)
            .class_(var10)
            .class_(var13)
            .class_(var11)
            .break_(var12)
            .break_(var14)
            .break_();
      } else {
         return class_;
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("type", this.break_.class_());
         var1.add("distance", this.byte_.class_());
         var1.add("location", this.protected_.class_());
         var1.add("effects", this.throws_.break_());
         var1.add("nbt", this.case_.class_());
         var1.add("flags", this.catch_.class_());
         var1.add("equipment", this.private_.class_());
         var1.add("player", this.implements_.class_());
         var1.add("fishing_hook", this.finally_.class_());
         var1.add("vehicle", this.extends_.class_());
         var1.add("targeted_entity", this.native_.class_());
         var1.addProperty("team", this.volatile_);
         if (this.final_ != null) {
            var1.addProperty("catType", this.final_.toString());
         }

         return var1;
      }
   }

   public boolean class_(rhN_2 var1, an_3 var2) {
      return this.class_(var1.continue_(), var1.Ps(), var2);
   }

   public boolean class_(rrEm_1 var1, rjU_2 var2, an_3 var3) {
      if (this == class_) {
         return true;
      } else if (var3 == null) {
         return false;
      } else if (!this.break_.class_(var3.BC())) {
         return false;
      } else {
         if (var2 == null) {
            if (this.byte_ != hl_3.class_) {
               return false;
            }
         } else if (!this.byte_.class_(var2.break_, var2.byte_, var2.protected_, var3.rx(), var3.re(), var3.BO())) {
            return false;
         }

         if (!this.protected_.class_(var1, var3.rx(), var3.re(), var3.BO())) {
            return false;
         } else if (!this.throws_.class_(var3)) {
            return false;
         } else if (!this.case_.class_(var3)) {
            return false;
         } else if (!this.catch_.class_(var3)) {
            return false;
         } else if (!this.private_.class_(var3)) {
            return false;
         } else if (!this.implements_.class_(var3)) {
            return false;
         } else if (!this.finally_.class_(var3)) {
            return false;
         } else if (!this.extends_.class_(var1, var2, var3.ra())) {
            return false;
         } else if (!this.native_.class_(var1, var2, var3 instanceof is_3 ? ((is_3)var3).I_() : null)) {
            return false;
         } else {
            if (this.volatile_ != null) {
               rnM_2 var4 = var3.BG();
               if (var4 == null || !this.volatile_.equals(var4.class_())) {
                  return false;
               }
            }

            return this.final_ == null || var3 instanceof rbf_3 && ((rbf_3)var3).L().equals(this.final_);
         }
      }
   }

   public static rzr_3 break_(rhN_2 var0, an_3 var1) {
      return new rzP_2(var0.continue_()).class_(rzQ_2.class_, var1).class_(rzQ_2.case_, var0.Ps()).class_(var0.Sa()).class_(rzz_3.finally_);
   }
}
