package celestial;

import com.google.gson.JsonObject;

public class XW extends hG_2<Xz_1> {
   static final rqO_2 class_ = new rqO_2("levitation");

   public void class_(rhN_2 var1, rjU_2 var2, int var3) {
      this.class_(var1, var3x -> var3x.class_(var1, var2, var3));
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public Xz_1 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      hl_3 var4 = hl_3.class_(var1.get("distance"));
      XF var5 = XF.class_(var1.get("duration"));
      return new Xz_1(var2, var4, var5);
   }
}
