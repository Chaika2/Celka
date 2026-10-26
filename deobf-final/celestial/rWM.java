package celestial;

import com.google.gson.JsonObject;
import java.util.Map;

public class rWM implements rkf_3<rWb_1> {
   public void class_(ruu_3 var1, rWb_1 var2) {
      var1.protected_(var2.class_);
      var1.protected_(var2.break_);
      var1.class_(var2.case_);

      for (rkg_3 var4 : var2.byte_) {
         var4.class_(var1);
      }

      var1.class_(var2.protected_);
   }

   public rWb_1 class_(rqO_2 var1, ruu_3 var2) {
      int var3 = var2.case_();
      int var4 = var2.case_();
      String var5 = var2.throws_(32767);
      rqs_3 var6 = rqs_3.class_(var3 * var4, rkg_3.class_);

      for (int var7 = 0; var7 < var6.size(); var7++) {
         var6.set(var7, rkg_3.break_(var2));
      }

      rdn_3 var8 = var2.extends_();
      return new rWb_1(var1, var5, var3, var4, var6, var8);
   }

   public rWb_1 class_(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.class_(var2, "group", "");
      Map var4 = rWb_1.break_(rpY_2.native_(var2, "key"));
      String[] var5 = rWb_1.class_(rWb_1.class_(rpY_2.volatile_(var2, "pattern")));
      int var6 = var5[0].length();
      int var7 = var5.length;
      rqs_3 var8 = rWb_1.class_(var5, var4, var6, var7);
      rdn_3 var9 = rWb_1.class_(rpY_2.native_(var2, "result"));
      return new rWb_1(var1, var3, var6, var7, var8, var9);
   }
}
