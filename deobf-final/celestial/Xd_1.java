package celestial;

import com.google.gson.JsonObject;

public class Xd_1 extends hG_2<Xk_1> {
   final rqO_2 class_;

   public Xd_1(rqO_2 var1) {
      this.class_ = var1;
   }

   public void class_(rhN_2 var1, an_3 var2, rye_3 var3) {
      rzr_3 var4 = hY_2.break_(var1, var2);
      this.class_(var1, var3x -> var3x.class_(var1, var4, var3));
   }

   @Override
   public rqO_2 class_() {
      return this.class_;
   }

   public Xk_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      return new Xk_1(this.class_, var2, ho_3.class_(var1, "entity", var3), hn_3.class_(var1.get("killing_blow")));
   }
}
