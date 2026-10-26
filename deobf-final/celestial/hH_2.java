package celestial;

import com.google.gson.JsonObject;

public class hH_2 extends hG_2<hy_3> {
   static final rqO_2 class_ = new rqO_2("effects_changed");

   public void class_(rhN_2 var1) {
      this.class_(var1, var1x -> var1x.class_(var1));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hy_3 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XA var4 = XA.class_(var1.get("effects"));
      return new hy_3(var2, var4);
   }
}
