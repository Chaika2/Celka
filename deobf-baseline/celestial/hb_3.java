package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hb_3 extends hG_2<hM_2> {
   static final rqO_2 id_class = new rqO_2("bee_nest_destroyed");

   public void id_class(rhN_2 var1, xd_3 var2, rdn_3 var3, int var4) {
      this.id_class(var1, var3x -> var3x.id_class(var2, var3, var4));
   }

   private static xd_3 id_class(JsonObject var0) {
      if (var0.has("block")) {
         rqO_2 var1 = new rqO_2(rpY_2.id_case(var0, "block"));
         return rVL.id_strictfp.id_break(var1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var1 + "'"));
      } else {
         return null;
      }
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hM_2 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      xd_3 var4 = id_class(var1);
      Xh_1 var5 = Xh_1.id_class(var1.get("item"));
      XF var6 = XF.id_class(var1.get("num_bees_inside"));
      return new hM_2(var2, var4, var5, var6);
   }
}
