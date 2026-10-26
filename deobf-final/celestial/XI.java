package celestial;

import com.google.gson.JsonObject;

public class XI extends hG_2<Xf_1> {
   static final rqO_2 class_ = new rqO_2("player_hurt_entity");

   public void class_(rhN_2 var1, an_3 var2, rye_3 var3, float var4, float var5, boolean var6) {
      rzr_3 var7 = hY_2.break_(var1, var2);
      this.class_(var1, var6x -> var6x.class_(var1, var7, var3, var4, var5, var6));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public Xf_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      hL_2 var4 = hL_2.class_(var1.get("damage"));
      ho_3 var5 = ho_3.class_(var1, "entity", var3);
      return new Xf_1(var2, var4, var5);
   }
}
