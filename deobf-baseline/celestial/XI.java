package celestial;

import com.google.gson.JsonObject;

public class XI extends hG_2<Xf_1> {
   static final rqO_2 id_class = new rqO_2("player_hurt_entity");

   public void id_class(rhN_2 var1, an_3 var2, rye_3 var3, float var4, float var5, boolean var6) {
      rzr_3 var7 = hY_2.id_break(var1, var2);
      this.id_class(var1, var6x -> var6x.id_class(var1, var7, var3, var4, var5, var6));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public Xf_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      hL_2 var4 = hL_2.id_class(var1.get("damage"));
      ho_3 var5 = ho_3.id_class(var1, "entity", var3);
      return new Xf_1(var2, var4, var5);
   }
}
