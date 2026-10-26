package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;

public class XP extends hG_2<XB> {
   static final rqO_2 id_class = new rqO_2("fishing_rod_hooked");

   public void id_class(rhN_2 var1, rdn_3 var2, rhp_3 var3, Collection<rdn_3> var4) {
      rzr_3 var5 = hY_2.id_break(var1, (an_3)(var3.id_catch() != null ? var3.id_catch() : var3));
      this.id_class(var1, var3x -> var3x.id_class(var2, var5, var4));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public XB id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.id_class(var1.get("rod"));
      ho_3 var5 = ho_3.id_class(var1, "entity", var3);
      Xh_1 var6 = Xh_1.id_class(var1.get("item"));
      return new XB(var2, var4, var5, var6);
   }
}
