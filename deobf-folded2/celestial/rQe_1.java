package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

final class rQe_1 implements rQo_1 {
   public static final rqO_2 id_class = new rqO_2("uniform_bonus_count");
   private final int id_break;

   public rQe_1(int var1) {
      this.id_break = var1;
   }

   public static rQo_1 id_class(JsonObject var0, JsonDeserializationContext var1) {
      int var2 = rpY_2.id_extends(var0, "bonusMultiplier");
      return new rQe_1(var2);
   }

   @Override
   public rqO_2 id_class() {
      return id_class;
   }

   @Override
   public int id_class(Random var1, int var2, int var3) {
      return var2 + var1.nextInt(this.id_break * var3 + 1);
   }

   @Override
   public void id_class(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("bonusMultiplier", this.id_break);
   }
}
