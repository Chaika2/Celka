package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

final class rQY implements rQo_1 {
   public static final rqO_2 id_class = new rqO_2("binomial_with_bonus_count");
   private final int id_break;
   private final float id_byte;

   public rQY(int var1, float var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public static rQo_1 id_class(JsonObject var0, JsonDeserializationContext var1) {
      int var2 = rpY_2.id_extends(var0, "extra");
      float var3 = rpY_2.id_implements(var0, "probability");
      return new rQY(var2, var3);
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   @Override
   public int id_class(Random var1, int var2, int var3) {
      for (int var4 = 0; var4 < var3 + this.id_break; var4++) {
         if (var1.nextFloat() < this.id_byte) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public void id_class(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("extra", this.id_break);
      var1.addProperty("probability", this.id_byte);
   }
}
