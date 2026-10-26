package celestial;

import com.google.gson.JsonObject;

public class JQ extends hG_2<JN> {
   static final rqO_2 class_ = new rqO_2("used_ender_eye");

   public void class_(rhN_2 var1, rfH_2 var2) {
      double var3 = var1.rx() - (double)var2.b_();
      double var5 = var1.BO() - (double)var2.d_();
      double var7 = var3 * var3 + var5 * var5;
      this.class_(var1, var2x -> var2x.class_(var7));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public JN break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xm_1 var4 = Xm_1.class_(var1.get("distance"));
      return new JN(var2, var4);
   }
}
