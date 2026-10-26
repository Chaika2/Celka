package celestial;

import com.google.gson.JsonObject;

public class Xo_1 extends hG_2<XK> {
   final rqO_2 id_class;

   public Xo_1(rqO_2 var1) {
      this.id_class = var1;
   }

   public void id_class(rhN_2 var1) {
      this.id_class(var1, var1x -> var1x.id_class(var1.id_continue(), var1.rx(), var1.re(), var1.BO()));
   }

   @Override
   public rqO_2 id_class() {
      return this.id_class;
   }

   public XK id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      JsonObject var4 = rpY_2.id_class(var1, "location", var1);
      XN var5 = XN.id_class(var4);
      return new XK(this.id_class, var2, var5);
   }
}
