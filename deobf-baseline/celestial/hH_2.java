package celestial;

import com.google.gson.JsonObject;

public class hH_2 extends hG_2<hy_3> {
   static final rqO_2 id_class = new rqO_2("effects_changed");

   public void id_class(rhN_2 var1) {
      this.id_class(var1, var1x -> var1x.id_class(var1));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hy_3 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XA var4 = XA.id_class(var1.get("effects"));
      return new hy_3(var2, var4);
   }
}
