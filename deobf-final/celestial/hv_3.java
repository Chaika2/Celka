package celestial;

import com.google.gson.JsonObject;

public class hv_3 extends hG_2<hF_2> {
   static final rqO_2 class_ = new rqO_2("cured_zombie_villager");

   public void class_(rhN_2 var1, rbB_2 var2, rsq_3 var3) {
      rzr_3 var4 = hY_2.break_(var1, var2);
      rzr_3 var5 = hY_2.break_(var1, var3);
      this.class_(var1, var2x -> var2x.class_(var4, var5));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public hF_2 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3 var4 = ho_3.class_(var1, "zombie", var3);
      ho_3 var5 = ho_3.class_(var1, "villager", var3);
      return new hF_2(var2, var4, var5);
   }
}
