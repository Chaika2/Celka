package celestial;

import com.google.gson.JsonObject;

public class JJ extends hG_2<Jx_1> {
   static final rqO_2 id_class = new rqO_2("target_hit");

   public void id_class(rhN_2 var1, an_3 var2, rjU_2 var3, int var4) {
      rzr_3 var5 = hY_2.id_break(var1, var2);
      this.id_class(var1, var3x -> var3x.id_class(var5, var3, var4));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public Jx_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XF var4 = XF.id_class(var1.get("signal_strength"));
      ho_3 var5 = ho_3.id_class(var1, "projectile", var3);
      return new Jx_1(var2, var4, var5);
   }
}
