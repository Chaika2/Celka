package celestial;

import com.google.gson.JsonObject;

public class hy_3 extends hZ_2 {
   private final XA id_class;

   public hy_3(ho_3 var1, XA var2) {
      super(hH_2.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("effects", this.id_class.id_break());
      return var2;
   }

   public boolean id_class(rhN_2 var1) {
      return this.id_class.id_class((iB_2)var1);
   }

   public static hy_3 id_class(XA var0) {
      return new hy_3(ho_3.id_class, var0);
   }
}
