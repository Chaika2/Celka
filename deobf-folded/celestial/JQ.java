package celestial;

import com.google.gson.JsonObject;

public class JQ extends hG_2<JN> {
   static final rqO_2 id_class = new rqO_2("used_ender_eye");

   public void id_class(rhN_2 var1, rfH_2 var2) {
      double var3 = var1.rx() - (double)var2.b_();
      double var5 = var1.BO() - (double)var2.d_();
      double var7 = var3 * var3 + var5 * var5;
      this.id_class(var1, var2x -> var2x.id_class(var7));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public JN id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xm_1 var4 = Xm_1.id_class(var1.get("distance"));
      return new JN(var2, var4);
   }
}
