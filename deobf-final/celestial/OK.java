package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OK {
   private final hr_3 class_;

   public static Map<String, OK> byte_(ruu_3 var0) {
      HashMap var1 = Maps.newHashMap();
      int var2 = var0.case_();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.put(var0.throws_(32767), break_(var0));
      }

      return var1;
   }

   public OK(hr_3 var1) {
      this.class_ = var1;
   }

   public OK() {
      this.class_ = null;
   }

   public hr_3 class_() {
      return this.class_;
   }

   public static void class_(Map<String, OK> var0, ruu_3 var1) {
      var1.protected_(var0.size());

      for (Entry var3 : var0.entrySet()) {
         var1.class_((String)var3.getKey());
         ((OK)var3.getValue()).class_(var1);
      }
   }

   public static OK class_(JsonObject var0, rWl_1 var1) {
      rqO_2 var2 = new rqO_2(rpY_2.case_(var0, "trigger"));
      hP_2 var3 = Oo_1.class_(var2);
      if (var3 == null) {
         throw new JsonSyntaxException("Invalid criterion trigger: " + var2);
      } else {
         hr_3 var4 = var3.class_(rpY_2.class_(var0, "conditions", new JsonObject()), var1);
         return new OK(var4);
      }
   }

   public void class_(ruu_3 var1) {
   }

   public JsonElement break_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("trigger", this.class_.class_().toString());
      JsonObject var2 = this.class_.class_(rWH.class_);
      if (var2.size() != 0) {
         var1.add("conditions", var2);
      }

      return var1;
   }

   public static Map<String, OK> break_(JsonObject var0, rWl_1 var1) {
      HashMap var2 = Maps.newHashMap();

      for (Entry var4 : var0.entrySet()) {
         var2.put((String)var4.getKey(), class_(rpY_2.private_((JsonElement)var4.getValue(), "criterion"), var1));
      }

      return var2;
   }

   public static OK break_(ruu_3 var0) {
      return new OK();
   }
}
