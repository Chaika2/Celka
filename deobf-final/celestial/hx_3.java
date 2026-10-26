package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hx_3 extends hG_2<hd_3> {
   static final rqO_2 class_ = new rqO_2("brewed_potion");

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public void class_(rhN_2 var1, rLi_1 var2) {
      this.class_(var1, var1x -> var1x.class_(var2));
   }

   public hd_3 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rLi_1 var4 = null;
      if (var1.has("potion")) {
         rqO_2 var5 = new rqO_2(rpY_2.case_(var1, "potion"));
         var4 = rVL.double_.break_(var5).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var5 + "'"));
      }

      return new hd_3(var2, var4);
   }
}
