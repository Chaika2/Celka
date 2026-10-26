package celestial;

import com.google.gson.JsonObject;

public class hq_3 extends hZ_2 {
   private final Xh_1 class_;
   private final XF break_;

   public hq_3(ho_3 var1, Xh_1 var2, XF var3) {
      super(hp_3.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.class_.class_());
      var2.add("levels", this.break_.protected_());
      return var2;
   }

   public boolean class_(rdn_3 var1, int var2) {
      return !this.class_.class_(var1) ? false : this.break_.byte_(var2);
   }

   public static hq_3 break_() {
      return new hq_3(ho_3.class_, Xh_1.class_, XF.throws_);
   }
}
