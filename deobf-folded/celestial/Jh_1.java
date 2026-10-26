package celestial;

import com.google.gson.JsonObject;

public class Jh_1 extends hG_2<JX> {
   static final rqO_2 id_class = new rqO_2("tame_animal");

   public void id_class(rhN_2 var1, rbZ_2 var2) {
      rzr_3 var3 = hY_2.id_break(var1, var2);
      this.id_class(var1, var1x -> var1x.id_class(var3));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public JX id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3 var4 = ho_3.id_class(var1, "entity", var3);
      return new JX(var2, var4);
   }
}
