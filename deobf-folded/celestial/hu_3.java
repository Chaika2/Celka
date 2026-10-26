package celestial;

import com.google.gson.JsonObject;

public class hu_3 extends hG_2<hm_3> {
   static final rqO_2 id_class = new rqO_2("consume_item");

   public void id_class(rhN_2 var1, rdn_3 var2) {
      this.id_class(var1, var1x -> var1x.id_class(var2));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hm_3 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      return new hm_3(var2, Xh_1.id_class(var1.get("item")));
   }
}
