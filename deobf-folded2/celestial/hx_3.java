package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hx_3 extends hG_2<hd_3> {
   static final rqO_2 id_class = new rqO_2("brewed_potion");

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public void id_class(rhN_2 var1, rLi_1 var2) {
      this.id_class(var1, var1x -> var1x.id_class(var2));
   }

   public hd_3 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rLi_1 var4 = null;
      if (var1.has("potion")) {
         rqO_2 var5 = new rqO_2(rpY_2.id_case(var1, "potion"));
         var4 = rVL.id_double.id_break(var5).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var5 + "'"));
      }

      return new hd_3(var2, var4);
   }
}
