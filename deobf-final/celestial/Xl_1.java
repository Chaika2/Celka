package celestial;

import com.google.gson.JsonObject;

public class Xl_1 extends hG_2<XH> {
   static final rqO_2 class_ = new rqO_2("nether_travel");

   public void class_(rhN_2 var1, rjU_2 var2) {
      this.class_(var1, var2x -> var2x.class_(var1.continue_(), var2, var1.rx(), var1.re(), var1.BO()));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public XH break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XN var4 = XN.class_(var1.get("entered"));
      XN var5 = XN.class_(var1.get("exited"));
      hl_3 var6 = hl_3.class_(var1.get("distance"));
      return new XH(var2, var4, var5, var6);
   }
}
