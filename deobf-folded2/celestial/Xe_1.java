package celestial;

import com.google.gson.JsonObject;

public class Xe_1 extends hG_2<Xa_1> {
   static final rqO_2 id_class = new rqO_2("item_used_on_block");

   public void id_class(rhN_2 var1, rfH_2 var2, rdn_3 var3) {
      xc_3 var4 = var1.id_continue().id_byte(var2);
      this.id_class(var1, var4x -> var4x.id_class(var4, var1.id_continue(), var2, var3));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public Xa_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      XN var4 = XN.id_class(var1.get("location"));
      Xh_1 var5 = Xh_1.id_class(var1.get("item"));
      return new Xa_1(var2, var4, var5);
   }
}
