package celestial;

import com.google.gson.JsonObject;

public class Jr_1 extends hZ_2 {
   private final Xh_1 id_class;

   public Jr_1(ho_3 var1, Xh_1 var2) {
      super(Xi_1.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("item", this.id_class.id_class());
      return var2;
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_class.id_class(var1);
   }

   public static Jr_1 id_class(rpL_2 var0) {
      return new Jr_1(ho_3.id_class, XX.id_class().id_class(var0).id_break());
   }
}
