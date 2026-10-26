package celestial;

import com.google.gson.JsonObject;

public class Jm_1 extends hG_2<JZ> {
   static final rqO_2 class_ = new rqO_2("villager_trade");

   public void class_(rhN_2 var1, rsy_3 var2, rdn_3 var3) {
      rzr_3 var4 = hY_2.break_(var1, var2);
      this.class_(var1, var2x -> var2x.class_(var4, var3));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public JZ break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3 var4 = ho_3.class_(var1, "villager", var3);
      Xh_1 var5 = Xh_1.class_(var1.get("item"));
      return new JZ(var2, var4, var5);
   }
}
