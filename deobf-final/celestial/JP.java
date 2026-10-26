package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class JP extends hG_2<JB> {
   static final rqO_2 class_ = new rqO_2("slide_down_block");

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

   public void class_(rhN_2 var1, xc_3 var2) {
      this.class_(var1, var1x -> var1x.class_(var2));
   }

   public JB break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      xd_3 var4 = class_(var1);
      JS var5 = JS.class_(var1.get("state"));
      if (var4 != null) {
         var5.class_(var4.new_(), var1x -> {
            throw new JsonSyntaxException("Block " + var4 + " has no property " + var1x);
         });
      }

      return new JB(var2, var4, var5);
   }
}
