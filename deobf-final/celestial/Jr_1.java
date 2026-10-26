package celestial;

import com.google.gson.JsonObject;

public class Jr_1 extends hZ_2 {
   private final Xh_1 class_;

   public Jr_1(ho_3 var1, Xh_1 var2) {
      super(Xi_1.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.class_.class_());
      return var2;
   }

   public boolean class_(rdn_3 var1) {
      return this.class_.class_(var1);
   }

   public static Jr_1 class_(rpL_2 var0) {
      return new Jr_1(ho_3.class_, XX.class_().class_(var0).break_());
   }
}
