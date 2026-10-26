package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

final class rQD implements rQo_1 {
   public static final rqO_2 id_class = new rqO_2("ore_drops");

   public static rQo_1 id_class(JsonObject var0, JsonDeserializationContext var1) {
      return new rQD();
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   @Override
   public int id_class(Random var1, int var2, int var3) {
      if (var3 > 0) {
         int var4 = var1.nextInt(var3 + 2) - 1;
         if (var4 < 0) {
            var4 = 0;
         }

         return var2 * (var4 + 1);
      } else {
         return var2;
      }
   }

   @Override
   public void id_class(JsonObject var1, JsonSerializationContext var2) {
   }
}
