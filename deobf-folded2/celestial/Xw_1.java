package celestial;

import com.google.gson.JsonObject;

public class Xw_1 extends hZ_2 {
   private final rqO_2 id_class;

   public Xw_1(ho_3 var1, rqO_2 var2) {
      super(Xt_1.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.addProperty("loot_table", this.id_class.toString());
      return var2;
   }

   public static Xw_1 id_class(rqO_2 var0) {
      return new Xw_1(ho_3.id_class, var0);
   }

   public boolean id_break(rqO_2 var1) {
      return this.id_class.equals(var1);
   }
}
