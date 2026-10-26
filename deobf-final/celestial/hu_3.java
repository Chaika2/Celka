package celestial;

import com.google.gson.JsonObject;

public class hu_3 extends hG_2<hm_3> {
   static final rqO_2 class_ = new rqO_2("consume_item");

   public void class_(rhN_2 var1, rdn_3 var2) {
      this.class_(var1, var1x -> var1x.class_(var2));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hm_3 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      return new hm_3(var2, Xh_1.class_(var1.get("item")));
   }
}
