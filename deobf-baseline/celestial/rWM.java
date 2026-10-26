package celestial;

import com.google.gson.JsonObject;
import java.util.Map;

public class rWM implements rkf_3<rWb_1> {
   public void id_class(ruu_3 var1, rWb_1 var2) {
      var1.id_protected(var2.id_class);
      var1.id_protected(var2.id_break);
      var1.id_class(var2.id_case);

      for (rkg_3 var4 : var2.id_byte) {
         var4.id_class(var1);
      }

      var1.id_class(var2.id_protected);
   }

   public rWb_1 id_class(rqO_2 var1, ruu_3 var2) {
      int var3 = var2.id_case();
      int var4 = var2.id_case();
      String var5 = var2.id_throws(32767);
      rqs_3 var6 = rqs_3.id_class(var3 * var4, rkg_3.id_class);

      for (int var7 = 0; var7 < var6.size(); var7++) {
         var6.set(var7, rkg_3.id_break(var2));
      }

      rdn_3 var8 = var2.id_extends();
      return new rWb_1(var1, var5, var3, var4, var6, var8);
   }

   public rWb_1 id_class(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.id_class(var2, "group", "");
      Map var4 = rWb_1.id_break(rpY_2.id_native(var2, "key"));
      String[] var5 = rWb_1.id_class(rWb_1.id_class(rpY_2.id_volatile(var2, "pattern")));
      int var6 = var5[0].length();
      int var7 = var5.length;
      rqs_3 var8 = rWb_1.id_class(var5, var4, var6, var7);
      rdn_3 var9 = rWb_1.id_class(rpY_2.id_native(var2, "result"));
      return new rWb_1(var1, var3, var6, var7, var8, var9);
   }
}
