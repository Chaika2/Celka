package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hI_2 {
   public static final hI_2 class_ = new hI_2(Xh_1.class_, Xh_1.class_, Xh_1.class_, Xh_1.class_, Xh_1.class_, Xh_1.class_);
   public static final hI_2 break_ = new hI_2(
      XX.class_().class_(rdy_3.dY).class_(rrEr_1.new_().package_()).break_(), Xh_1.class_, Xh_1.class_, Xh_1.class_, Xh_1.class_, Xh_1.class_
   );
   private final Xh_1 byte_;
   private final Xh_1 protected_;
   private final Xh_1 throws_;
   private final Xh_1 case_;
   private final Xh_1 catch_;
   private final Xh_1 private_;

   public hI_2(Xh_1 var1, Xh_1 var2, Xh_1 var3, Xh_1 var4, Xh_1 var5, Xh_1 var6) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
      this.private_ = var6;
   }

   public boolean class_(an_3 var1) {
      if (this == class_) {
         return true;
      } else if (!(var1 instanceof iB_2 var2)) {
         return false;
      } else if (!this.byte_.class_(var2.class_(rXQ.HEAD))) {
         return false;
      } else if (!this.protected_.class_(var2.class_(rXQ.CHEST))) {
         return false;
      } else if (!this.throws_.class_(var2.class_(rXQ.LEGS))) {
         return false;
      } else if (!this.case_.class_(var2.class_(rXQ.FEET))) {
         return false;
      } else {
         return !this.catch_.class_(var2.class_(rXQ.MAINHAND)) ? false : this.private_.class_(var2.class_(rXQ.OFFHAND));
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("head", this.byte_.class_());
         var1.add("chest", this.protected_.class_());
         var1.add("legs", this.throws_.class_());
         var1.add("feet", this.case_.class_());
         var1.add("mainhand", this.catch_.class_());
         var1.add("offhand", this.private_.class_());
         return var1;
      }
   }

   public static hI_2 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "equipment");
         Xh_1 var2 = Xh_1.class_(var1.get("head"));
         Xh_1 var3 = Xh_1.class_(var1.get("chest"));
         Xh_1 var4 = Xh_1.class_(var1.get("legs"));
         Xh_1 var5 = Xh_1.class_(var1.get("feet"));
         Xh_1 var6 = Xh_1.class_(var1.get("mainhand"));
         Xh_1 var7 = Xh_1.class_(var1.get("offhand"));
         return new hI_2(var2, var3, var4, var5, var6, var7);
      } else {
         return class_;
      }
   }
}
