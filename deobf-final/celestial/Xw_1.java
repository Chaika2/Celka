package celestial;

import com.google.gson.JsonObject;

public class Xw_1 extends hZ_2 {
   private final rqO_2 class_;

   public Xw_1(ho_3 var1, rqO_2 var2) {
      super(Xt_1.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.addProperty("loot_table", this.class_.toString());
      return var2;
   }

   public static Xw_1 class_(rqO_2 var0) {
      return new Xw_1(ho_3.class_, var0);
   }

   public boolean break_(rqO_2 var1) {
      return this.class_.equals(var1);
   }
}
