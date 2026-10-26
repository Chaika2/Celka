package celestial;

import com.google.gson.JsonObject;

public class Jc_1 extends hG_2<Ju_1> {
   static final rqO_2 id_class = new rqO_2("used_totem");

   public void id_class(rhN_2 var1, rdn_3 var2) {
      this.id_class(var1, var1x -> var1x.id_class(var2));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public Ju_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.id_class(var1.get("item"));
      return new Ju_1(var2, var4);
   }
}
