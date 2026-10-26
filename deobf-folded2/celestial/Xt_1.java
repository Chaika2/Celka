package celestial;

import com.google.gson.JsonObject;

public class Xt_1 extends hG_2<Xw_1> {
   static final rqO_2 id_class = new rqO_2("player_generates_container_loot");

   public void id_class(rhN_2 var1, rqO_2 var2) {
      this.id_class(var1, var1x -> var1x.id_break(var2));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   protected Xw_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "loot_table"));
      return new Xw_1(var2, var4);
   }
}
