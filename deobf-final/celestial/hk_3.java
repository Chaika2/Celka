package celestial;

import com.google.gson.JsonObject;

public class hk_3 extends hG_2<hW_2> {
   static final rqO_2 class_ = new rqO_2("changed_dimension");

   public void class_(rhN_2 var1, rqM_2<rYB> var2, rqM_2<rYB> var3) {
      this.class_(var1, var2x -> var2x.class_(var2, var3));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hW_2 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rqM_2 var4 = var1.has("from") ? rqM_2.class_(rVL.static_, new rqO_2(rpY_2.case_(var1, "from"))) : null;
      rqM_2 var5 = var1.has("to") ? rqM_2.class_(rVL.static_, new rqO_2(rpY_2.case_(var1, "to"))) : null;
      return new hW_2(var2, var4, var5);
   }
}
