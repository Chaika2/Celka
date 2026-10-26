package celestial;

import com.google.gson.JsonObject;

public class XD extends hG_2<XU> {
   static final rqO_2 id_class = new rqO_2("recipe_unlocked");

   public static XU id_class(rqO_2 var0) {
      return new XU(ho_3.id_class, var0);
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   public void id_class(rhN_2 var1, rkw_3<?> var2) {
      this.id_class(var1, var1x -> var1x.id_class(var2));
   }

   public XU id_break(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "recipe"));
      return new XU(var2, var4);
   }
}
