package celestial;

import com.google.gson.JsonObject;

public class hg_3 extends hG_2<hR_2> {
   static final rqO_2 id_class = new rqO_2("entity_hurt_player");

   public void id_class(rhN_2 var1, rye_3 var2, float var3, float var4, boolean var5) {
      this.id_class(var1, var5x -> var5x.id_class(var1, var2, var3, var4, var5));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hR_2 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      hL_2 var4 = hL_2.id_class(var1.get("damage"));
      return new hR_2(var2, var4);
   }
}
