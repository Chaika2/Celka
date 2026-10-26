package celestial;

import com.google.gson.JsonObject;

public class Xe_1 extends hG_2<Xa_1> {
   static final rqO_2 class_ = new rqO_2("item_used_on_block");

   public void class_(rhN_2 var1, rfH_2 var2, rdn_3 var3) {
      xc_3 var4 = var1.continue_().byte_(var2);
      this.class_(var1, var4x -> var4x.class_(var4, var1.continue_(), var2, var3));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public Xa_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XN var4 = XN.class_(var1.get("location"));
      Xh_1 var5 = Xh_1.class_(var1.get("item"));
      return new Xa_1(var2, var4, var5);
   }
}
