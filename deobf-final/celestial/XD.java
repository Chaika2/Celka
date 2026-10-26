package celestial;

import com.google.gson.JsonObject;

public class XD extends hG_2<XU> {
   static final rqO_2 class_ = new rqO_2("recipe_unlocked");

   public static XU class_(rqO_2 var0) {
      return new XU(ho_3.class_, var0);
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public void class_(rhN_2 var1, rkw_3<?> var2) {
      this.class_(var1, var1x -> var1x.class_(var2));
   }

   public XU break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "recipe"));
      return new XU(var2, var4);
   }
}
