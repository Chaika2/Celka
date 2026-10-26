package celestial;

import com.google.gson.JsonObject;

public class hk_3 extends hG_2<hW_2> {
   static final rqO_2 id_class = new rqO_2("changed_dimension");

   public void id_class(rhN_2 var1, rqM_2<rYB> var2, rqM_2<rYB> var3) {
      this.id_class(var1, var2x -> var2x.id_class(var2, var3));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hW_2 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rqM_2 var4 = var1.has("from") ? rqM_2.id_class(rVL.id_static, new rqO_2(rpY_2.id_case(var1, "from"))) : null;
      rqM_2 var5 = var1.has("to") ? rqM_2.id_class(rVL.id_static, new rqO_2(rpY_2.id_case(var1, "to"))) : null;
      return new hW_2(var2, var4, var5);
   }
}
