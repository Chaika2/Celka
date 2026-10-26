package celestial;

import com.google.gson.JsonObject;

public class Jh_1 extends hG_2<JX> {
   static final rqO_2 class_ = new rqO_2("tame_animal");

   public void class_(rhN_2 var1, rbZ_2 var2) {
      rzr_3 var3 = hY_2.break_(var1, var2);
      this.class_(var1, var1x -> var1x.class_(var3));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public JX break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3 var4 = ho_3.class_(var1, "entity", var3);
      return new JX(var2, var4);
   }
}
