package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class JP extends hG_2<JB> {
   static final rqO_2 id_class = new rqO_2("slide_down_block");

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

   public void id_class(rhN_2 var1, xc_3 var2) {
      this.id_class(var1, var1x -> var1x.id_class(var2));
   }

   public JB id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      xd_3 var4 = id_class(var1);
      JS var5 = JS.id_class(var1.get("state"));
      if (var4 != null) {
         var5.id_class(var4.id_new(), var1x -> {
            throw new JsonSyntaxException("Block " + var4 + " has no property " + var1x);
         });
      }

      return new JB(var2, var4, var5);
   }
}
