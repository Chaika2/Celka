package celestial;

import com.google.gson.JsonObject;

public class Xi_1 extends hG_2<Jr_1> {
   static final rqO_2 class_ = new rqO_2("shot_crossbow");

   public void class_(rhN_2 var1, rdn_3 var2) {
      this.class_(var1, var1x -> var1x.class_(var2));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public Jr_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.class_(var1.get("item"));
      return new Jr_1(var2, var4);
   }
}
