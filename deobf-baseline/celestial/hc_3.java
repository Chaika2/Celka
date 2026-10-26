package celestial;

import com.google.gson.JsonObject;

public class hc_3 extends hZ_2 {
   private final XF id_class;

   public hc_3(ho_3 var1, XF var2) {
      super(hN_2.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("level", this.id_class.id_protected());
      return var2;
   }

   public boolean id_class(rHO var1) {
      return this.id_class.id_byte(var1.id_private());
   }

   public static hc_3 id_class(XF var0) {
      return new hc_3(ho_3.id_class, var0);
   }
}
