package celestial;

import com.google.gson.JsonObject;

public class hp_3 extends hG_2<hq_3> {
   static final rqO_2 class_ = new rqO_2("enchanted_item");

   public void class_(rhN_2 var1, rdn_3 var2, int var3) {
      this.class_(var1, var2x -> var2x.class_(var2, var3));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hq_3 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.class_(var1.get("item"));
      XF var5 = XF.class_(var1.get("levels"));
      return new hq_3(var2, var4, var5);
   }
}
