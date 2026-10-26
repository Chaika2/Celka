package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rWh_1 implements rkf_3<rWO> {
   public rWO id_class(rqO_2 var1, ruu_3 var2) {
      String var3 = var2.id_throws(32767);
      int var4 = var2.id_case();
      rqs_3 var5 = rqs_3.id_class(var4, rkg_3.id_class);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var5.set(var6, rkg_3.id_break(var2));
      }

      rdn_3 var7 = var2.id_extends();
      return new rWO(var1, var3, var7, var5);
   }

   public void id_class(ruu_3 var1, rWO var2) {
      var1.id_class(var2.id_break);
      var1.id_protected(var2.id_protected.size());

      for (rkg_3 var4 : var2.id_protected) {
         var4.id_class(var1);
      }

      var1.id_class(var2.id_byte);
   }

   private static rqs_3<rkg_3> id_class(JsonArray var0) {
      rqs_3 var1 = rqs_3.id_class();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         rkg_3 var3 = rkg_3.id_class(var0.get(var2));
         if (!var3.id_protected()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public rWO id_class(rqO_2 var1, JsonObject var2) {
      String var3 = rpY_2.id_class(var2, "group", "");
      rqs_3 var4 = id_class(rpY_2.id_volatile(var2, "ingredients"));
      if (var4.isEmpty()) {
         throw new JsonParseException("No ingredients for shapeless recipe");
      } else if (var4.size() > 9) {
         throw new JsonParseException("Too many ingredients for shapeless recipe");
      } else {
         rdn_3 var5 = rWb_1.id_class(rpY_2.id_native(var2, "result"));
         return new rWO(var1, var3, var5, var4);
      }
   }
}
