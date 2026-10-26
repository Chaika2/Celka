package celestial;

import com.google.gson.JsonObject;

public class hX_2 extends hG_2<hJ_2> {
   static final rqO_2 id_class = new rqO_2("bred_animals");

   public void id_class(rhN_2 var1, rbZ_2 var2, rbZ_2 var3, au_3 var4) {
      rzr_3 var5 = hY_2.id_break(var1, var2);
      rzr_3 var6 = hY_2.id_break(var1, var3);
      rzr_3 var7 = var4 != null ? hY_2.id_break(var1, var4) : null;
      this.id_class(var1, var3x -> var3x.id_class(var5, var6, var7));
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public hJ_2 id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3 var4 = ho_3.id_class(var1, "parent", var3);
      ho_3 var5 = ho_3.id_class(var1, "partner", var3);
      ho_3 var6 = ho_3.id_class(var1, "child", var3);
      return new hJ_2(var2, var4, var5, var6);
   }
}
