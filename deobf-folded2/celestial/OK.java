package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OK {
   private final hr_3 id_class;

   public static Map<String, OK> id_byte(ruu_3 var0) {
      HashMap var1 = Maps.newHashMap();
      int var2 = var0.id_case();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.put(var0.id_throws(32767), id_break(var0));
      }

      return var1;
   }

   public OK(hr_3 var1) {
      this.id_class = var1;
   }

   public OK() {
      this.id_class = null;
   }

   public hr_3 id_class() {
      return this.id_class;
   }

   public static void id_class(Map<String, OK> var0, ruu_3 var1) {
      var1.id_protected(var0.size());

      for (Entry var3 : var0.entrySet()) {
         var1.id_class((String)var3.getKey());
         ((OK)var3.getValue()).id_class(var1);
      }
   }

   public static OK id_class(JsonObject var0, rWl_1 var1) {
      rqO_2 var2 = new rqO_2(rpY_2.id_case(var0, "trigger"));
      hP_2 var3 = Oo_1.id_class(var2);
      if (var3 == null) {
         throw new JsonSyntaxException("Invalid criterion trigger: " + var2);
      } else {
         hr_3 var4 = var3.id_class(rpY_2.id_class(var0, "conditions", new JsonObject()), var1);
         return new OK(var4);
      }
   }

   public void id_class(ruu_3 var1) {
   }

   public JsonElement id_break() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("trigger", this.id_class.id_class().toString());
      JsonObject var2 = this.id_class.id_class(rWH.id_class);
      if (var2.size() != 0) {
         var1.add("conditions", var2);
      }

      return var1;
   }

   public static Map<String, OK> id_break(JsonObject var0, rWl_1 var1) {
      HashMap var2 = Maps.newHashMap();

      for (Entry var4 : var0.entrySet()) {
         var2.put((String)var4.getKey(), id_class(rpY_2.id_private((JsonElement)var4.getValue(), "criterion"), var1));
      }

      return var2;
   }

   public static OK id_break(ruu_3 var0) {
      return new OK();
   }
}
