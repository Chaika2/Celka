package celestial;

import com.google.gson.JsonObject;

public class Xo_1 extends hG_2<XK> {
   final rqO_2 class_;

   public Xo_1(rqO_2 var1) {
      this.class_ = var1;
   }

   public void class_(rhN_2 var1) {
      this.class_(var1, var1x -> var1x.class_(var1.continue_(), var1.rx(), var1.re(), var1.BO()));
   }

   @Override
   public rqO_2 class_() {
      return this.class_;
   }

   public XK break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      JsonObject var4 = rpY_2.class_(var1, "location", var1);
      XN var5 = XN.class_(var4);
      return new XK(this.class_, var2, var5);
   }
}
