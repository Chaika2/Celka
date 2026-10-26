package celestial;

import com.google.gson.JsonObject;

public class hc_3 extends hZ_2 {
   private final XF class_;

   public hc_3(ho_3 var1, XF var2) {
      super(hN_2.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("level", this.class_.protected_());
      return var2;
   }

   public boolean class_(rHO var1) {
      return this.class_.byte_(var1.private_());
   }

   public static hc_3 class_(XF var0) {
      return new hc_3(ho_3.class_, var0);
   }
}
