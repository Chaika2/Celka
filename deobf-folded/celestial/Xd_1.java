package celestial;

import com.google.gson.JsonObject;

public class Xd_1 extends hG_2<Xk_1> {
   final rqO_2 id_class;

   public Xd_1(rqO_2 var1) {
      this.id_class = var1;
   }

   public void id_class(rhN_2 var1, an_3 var2, rye_3 var3) {
      rzr_3 var4 = hY_2.id_break(var1, var2);
      this.id_class(var1, var3x -> var3x.id_class(var1, var4, var3));
   }

   @Override
   public rqO_2 id_class() {
      return this.id_class;
   }

   public Xk_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      return new Xk_1(this.id_class, var2, ho_3.id_class(var1, "entity", var3), hn_3.id_class(var1.get("killing_blow")));
   }
}
