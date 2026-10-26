package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class Xy_1 extends hG_2<Xp_1> {
   static final rqO_2 id_class = new rqO_2("placed_block");

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   private static xd_3 id_class(JsonObject var0) {
      if (var0.has("block")) {
         rqO_2 var1 = new rqO_2(rpY_2.id_case(var0, "block"));
         return rVL.id_strictfp.id_break(var1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + var1 + "'"));
      } else {
         return null;
      }
   }

   public void id_class(rhN_2 var1, rfH_2 var2, rdn_3 var3) {
      xc_3 var4 = var1.id_continue().id_byte(var2);
      this.id_class(var1, var4x -> var4x.id_class(var4, var2, var1.id_continue(), var3));
   }

   public Xp_1 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      xd_3 var4 = id_class(var1);
      JS var5 = JS.id_class(var1.get("state"));
      if (var4 != null) {
         var5.id_class(var4.id_new(), var1x -> {
            throw new JsonSyntaxException("Block " + var4 + " has no property " + var1x + ":");
         });
      }

      XN var6 = XN.id_class(var1.get("location"));
      Xh_1 var7 = Xh_1.id_class(var1.get("item"));
      return new Xp_1(var2, var4, var5, var6, var7);
   }
}
