package celestial;

import com.google.gson.JsonObject;

public class hd_3 extends hZ_2 {
   private final rLi_1 class_;

   public hd_3(ho_3 var1, rLi_1 var2) {
      super(hx_3.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      if (this.class_ != null) {
         var2.addProperty("potion", rVL.double_.break_(this.class_).toString());
      }

      return var2;
   }

   public boolean class_(rLi_1 var1) {
      return this.class_ == null || this.class_ == var1;
   }

   public static hd_3 break_() {
      return new hd_3(ho_3.class_, (rLi_1)null);
   }
}
