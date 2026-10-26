package celestial;

import com.google.gson.JsonObject;

public class Jd_1 extends hG_2<Jk_1> {
   static final rqO_2 id_class = new rqO_2("thrown_item_picked_up_by_entity");

   public void id_class(rhN_2 var1, rdn_3 var2, an_3 var3) {
      rzr_3 var4 = hY_2.id_break(var1, var3);
      this.id_class(var1, var3x -> var3x.id_class(var1, var2, var4));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   protected Jk_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.id_class(var1.get("item"));
      ho_3 var5 = ho_3.id_class(var1, "entity", var3);
      return new Jk_1(var2, var4, var5);
   }
}
