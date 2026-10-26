package celestial;

import com.google.gson.JsonObject;

public class hN_2 extends hG_2<hc_3> {
   static final rqO_2 class_ = new rqO_2("construct_beacon");

   public void class_(rhN_2 var1, rHO var2) {
      this.class_(var1, var1x -> var1x.class_(var2));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hc_3 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XF var4 = XF.class_(var1.get("level"));
      return new hc_3(var2, var4);
   }
}
