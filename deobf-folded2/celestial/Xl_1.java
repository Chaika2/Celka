package celestial;

import com.google.gson.JsonObject;

public class Xl_1 extends hG_2<XH> {
   static final rqO_2 id_class = new rqO_2("nether_travel");

   public void id_class(rhN_2 var1, rjU_2 var2) {
      this.id_class(var1, var2x -> var2x.id_class(var1.id_continue(), var2, var1.rx(), var1.re(), var1.BO()));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public XH id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XN var4 = XN.id_class(var1.get("entered"));
      XN var5 = XN.id_class(var1.get("exited"));
      hl_3 var6 = hl_3.id_class(var1.get("distance"));
      return new XH(var2, var4, var5, var6);
   }
}
