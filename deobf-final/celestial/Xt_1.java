package celestial;

import com.google.gson.JsonObject;

public class Xt_1 extends hG_2<Xw_1> {
   static final rqO_2 class_ = new rqO_2("player_generates_container_loot");

   public void class_(rhN_2 var1, rqO_2 var2) {
      this.class_(var1, var1x -> var1x.break_(var2));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   protected Xw_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "loot_table"));
      return new Xw_1(var2, var4);
   }
}
