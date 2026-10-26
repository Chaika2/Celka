package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;

public class XP extends hG_2<XB> {
   static final rqO_2 class_ = new rqO_2("fishing_rod_hooked");

   public void class_(rhN_2 var1, rdn_3 var2, rhp_3 var3, Collection<rdn_3> var4) {
      rzr_3 var5 = hY_2.break_(var1, (an_3)(var3.catch_() != null ? var3.catch_() : var3));
      this.class_(var1, var3x -> var3x.class_(var2, var5, var4));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public XB break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      Xh_1 var4 = Xh_1.class_(var1.get("rod"));
      ho_3 var5 = ho_3.class_(var1, "entity", var3);
      Xh_1 var6 = Xh_1.class_(var1.get("item"));
      return new XB(var2, var4, var5, var6);
   }
}
