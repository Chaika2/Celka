package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hb_3 extends hG_2<hM_2> {
   static final rqO_2 class_ = new rqO_2("bee_nest_destroyed");

   public void class_(rhN_2 var1, xd_3 var2, rdn_3 var3, int var4) {
      this.class_(var1, var3x -> var3x.class_(var2, var3, var4));
   }

   private static xd_3 class_(JsonObject var0) {
      if (var0.has("block")) {
         rqO_2 var1 = new rqO_2(rpY_2.case_(var0, "block"));
         return rVL.strictfp_.break_(var1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var1 + "'"));
      } else {
         return null;
      }
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hM_2 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      xd_3 var4 = class_(var1);
      Xh_1 var5 = Xh_1.class_(var1.get("item"));
      XF var6 = XF.class_(var1.get("num_bees_inside"));
      return new hM_2(var2, var4, var5, var6);
   }
}
