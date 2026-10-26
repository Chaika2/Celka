package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rWh_1 implements rkf_3<rWO> {
   public rWO class_(rqO_2 var1, ruu_3 var2) {
      String var3 = var2.throws_(32767);
      int var4 = var2.case_();
      rqs_3 var5 = rqs_3.class_(var4, rkg_3.class_);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var5.set(var6, rkg_3.break_(var2));
      }

      rdn_3 var7 = var2.extends_();
      return new rWO(var1, var3, var7, var5);
   }

   public void class_(ruu_3 var1, rWO var2) {
      var1.class_(var2.break_);
      var1.protected_(var2.protected_.size());

      for (rkg_3 var4 : var2.protected_) {
         var4.class_(var1);
      }

      var1.class_(var2.byte_);
   }

   private static rqs_3<rkg_3> class_(JsonArray var0) {
      rqs_3 var1 = rqs_3.class_();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         rkg_3 var3 = rkg_3.class_(var0.get(var2));
         if (!var3.protected_()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public rWO class_(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.class_(var2, "group", "");
      rqs_3 var4 = class_(rpY_2.volatile_(var2, "ingredients"));
      if (var4.isEmpty()) {
         throw new JsonParseException("No ingredients for shapeless recipe");
      } else if (var4.size() > 9) {
         throw new JsonParseException("Too many ingredients for shapeless recipe");
      } else {
         rdn_3 var5 = rWb_1.class_(rpY_2.native_(var2, "result"));
         return new rWO(var1, var3, var5, var4);
      }
   }
}
