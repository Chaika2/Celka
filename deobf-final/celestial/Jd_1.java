package celestial;

import com.google.gson.JsonObject;

public class Jd_1 extends hG_2<Jk_1> {
   static final rqO_2 class_ = new rqO_2("thrown_item_picked_up_by_entity");

   public void class_(rhN_2 var1, rdn_3 var2, an_3 var3) {
      rzr_3 var4 = hY_2.break_(var1, var3);
      this.class_(var1, var3x -> var3x.class_(var1, var2, var4));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   protected Jk_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.class_(var1.get("item"));
      ho_3 var5 = ho_3.class_(var1, "entity", var3);
      return new Jk_1(var2, var4, var5);
   }
}
