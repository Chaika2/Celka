package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class Xy_1 extends hG_2<Xp_1> {
   static final rqO_2 class_ = new rqO_2("placed_block");

   @Override
   public rqO_2 class_() {
      return class_;
   }

   private static xd_3 class_(JsonObject var0) {
      if (var0.has("block")) {
         rqO_2 var1 = new rqO_2(rpY_2.case_(var0, "block"));
         return rVL.strictfp_.break_(var1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var1 + "'"));
      } else {
         return null;
      }
   }

   public void class_(rhN_2 var1, rfH_2 var2, rdn_3 var3) {
      xc_3 var4 = var1.continue_().byte_(var2);
      this.class_(var1, var4x -> var4x.class_(var4, var2, var1.continue_(), var3));
   }

   public Xp_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      xd_3 var4 = class_(var1);
      JS var5 = JS.class_(var1.get("state"));
      if (var4 != null) {
         var5.class_(var4.new_(), var1x -> {
            throw new JsonSyntaxException("Block " + var4 + " has no property " + var1x + ":");
         });
      }

      XN var6 = XN.class_(var1.get("location"));
      Xh_1 var7 = Xh_1.class_(var1.get("item"));
      return new Xp_1(var2, var4, var5, var6, var7);
   }
}
