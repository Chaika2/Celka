package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

final class rQe_1 implements rQo_1 {
   public static final rqO_2 class_ = new rqO_2("uniform_bonus_count");
   private final int break_;

   public rQe_1(int var1) {
      this.break_ = var1;
   }

   public static rQo_1 class_(JsonObject var0, JsonDeserializationContext var1) {
      int var2 = rpY_2.extends_(var0, "bonusMultiplier");
      return new rQe_1(var2);
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   @Override
   public int class_(Random var1, int var2, int var3) {
      return var2 + var1.nextInt(this.break_ * var3 + 1);
   }

   @Override
   public void class_(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("bonusMultiplier", this.break_);
   }
}
