package celestial;

import com.google.gson.JsonObject;

public class hp_3 extends hG_2<hq_3> {
   static final rqO_2 id_class = new rqO_2("enchanted_item");

   public void id_class(rhN_2 var1, rdn_3 var2, int var3) {
      this.id_class(var1, var2x -> var2x.id_class(var2, var3));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hq_3 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.id_class(var1.get("item"));
      XF var5 = XF.id_class(var1.get("levels"));
      return new hq_3(var2, var4, var5);
   }
}
