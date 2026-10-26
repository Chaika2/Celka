package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.function.Predicate;

public class ho_3 {
   public static final ho_3 class_ = new ho_3(new rQz_1[0]);
   private final rQz_1[] break_;
   private final Predicate<rzr_3> byte_;

   private ho_3(rQz_1[] var1) {
      this.break_ = var1;
      this.byte_ = rQF.class_(var1);
   }

   public boolean class_(rzr_3 var1) {
      return this.byte_.test(var1);
   }

   public JsonElement class_(rWH var1) {
      return (JsonElement)(this.break_.length == 0 ? JsonNull.INSTANCE : var1.class_(this.break_));
   }

   public static JsonElement class_(ho_3[] var0, rWH var1) {
      if (var0.length == 0) {
         return JsonNull.INSTANCE;
      } else {
         JsonArray var2 = new JsonArray();

         for (ho_3 var6 : var0) {
            var2.add(var6.class_(var1));
         }

         return var2;
      }
   }

   public static ho_3 class_(hY_2 var0) {
      if (var0 == hY_2.class_) {
         return class_;
      } else {
         rQz_1 var1 = rQx_1.class_(rzB_2.THIS, var0).build();
         return new ho_3(new rQz_1[]{var1});
      }
   }

   public static ho_3 class_(JsonObject var0, String var1, rWl_1 var2) {
      JsonElement var3 = var0.get(var1);
      return class_(var1, var2, var3);
   }

   private static ho_3 class_(String var0, rWl_1 var1, JsonElement var2) {
      if (var2 != null && var2.isJsonArray()) {
         rQz_1[] var4 = var1.class_(var2.getAsJsonArray(), var1.class_().toString() + "/" + var0, rzz_3.finally_);
         return new ho_3(var4);
      } else {
         hY_2 var3 = hY_2.class_(var2);
         return class_(var3);
      }
   }

   public static ho_3 class_(rQz_1... var0) {
      return new ho_3(var0);
   }

   public static ho_3[] break_(JsonObject var0, String var1, rWl_1 var2) {
      JsonElement var3 = var0.get(var1);
      if (var3 != null && !var3.isJsonNull()) {
         JsonArray var4 = rpY_2.implements_(var3, var1);
         ho_3[] var5 = new ho_3[var4.size()];

         for (int var6 = 0; var6 < var4.size(); var6++) {
            var5[var6] = class_(var1 + "[" + var6 + "]", var2, var4.get(var6));
         }

         return var5;
      } else {
         return new ho_3[0];
      }
   }
}
